/*

11111 
22222 
33333 
44444 
55555 

*/

public class Question23 {
    public static void main(String[] args) {
        int count = 1;
        for(int i=0; i<5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print(count);
            }
            count++;
            System.out.println();
        }
    }
}
