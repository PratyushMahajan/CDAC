/*

 *
 ** 
 *** 
 ***** 
 ******* 
 ********* 

 */

public class Question14 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.print("**");
        for(int i=0; i<6; i++) {
            if(i==1) {
                continue;
            }
            for(int j=0; j<2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
