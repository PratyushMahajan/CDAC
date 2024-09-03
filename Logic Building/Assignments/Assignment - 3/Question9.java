//Write a program to find and print the largest digit in the number 4825. 

public class Question9 {
    public static void main(String[] args) {
        int num = 4825;

        int max = 5;

        for(int i=0; i<4; i++) {
            int rem = num % 10;

            if(rem > max) {
                max = rem;
            }
            num /= 10;
        }
        System.out.println(max);
    }
}
