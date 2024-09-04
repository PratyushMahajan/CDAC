public class Q1 {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++) {
            for(int j=0; j<6-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                if (j==1 || j==2*i-1 || i==6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}