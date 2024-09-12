import java.util.Scanner;

public class Question1_2 {
    public static void main(String[] args) {
        
        System.out.print("Enter a Number: ");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        switch(year%4) {
            case 0: 
                switch(year%100) {
                    case 0: 
                        switch(year%400) {
                            case 0: System.out.println(year+ " is a leap year"); 
                            break;
                            default:System.out.println(year+ " is not a leap year");
                        }
                        break;

                    default:
                        System.out.println(year+ " is a leap year");
                        break;
                }
                break;

            default:
                System.out.println(year+ " is not a leap year");
                break;
        }

        sc.close();
    }
}
