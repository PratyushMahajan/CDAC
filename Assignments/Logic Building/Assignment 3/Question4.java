//Write a program to reverse the digits of the number 1234. The output should be 4321. 

public class Question4 {
    public static void main(String[] args) {
        int digit = 1234;
        int rev = 0;

        for(int i=0; i<4; i++) {
            int rem = digit % 10;
            digit = digit / 10;
            
            rev = rev*10 + rem;
        }
        System.out.println("Reverse of 1234 is: "+rev);
    }
}
