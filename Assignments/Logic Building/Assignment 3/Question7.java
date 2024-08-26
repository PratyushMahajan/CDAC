//Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 

public class Question7 {
    public static void main(String[] args) {
        
        int number = 9876;
        int result = 0;

        for(int i=0; i<4; i++) {
            result += number % 10;
            number /= 10;
        }
        System.out.println(result);
    }
}
