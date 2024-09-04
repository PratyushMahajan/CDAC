public class Q3 {
    public static void main(String[] args) {
        char c = 65;
        for(int i=1; i<=5; i++) {
            for(int j=0; j<5-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                if(j==2*i-1 && i==5) {
                    System.out.print(""+c+""+(++c));
                }
                else {
                   System.out.print(c);
                }
                c++;
            }
            System.out.println();
        }
        
    }
}