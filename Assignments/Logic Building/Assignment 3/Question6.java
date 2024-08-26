//Write a program to find and print the first 5 prime numbers. 

public class Question6 {
    public static void main(String[] args) {

        int count = 0;
        int i = 2;
        
        while(count < 5) {
            boolean isPrime = true;

            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        
    }
}
