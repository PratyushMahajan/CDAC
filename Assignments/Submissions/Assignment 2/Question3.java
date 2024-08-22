import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int num2 = sc.nextInt();

        System.out.print("Select a Operator (+, -, *, /) : ");
        char op = sc.next().charAt(0);
        int result = 0;

        switch(op) {
            case '+': 
            result = num1 + num2;
            System.out.println("Addition of "+num1+" & "+num2+" : "+result);
            break;

            case '-': 
            result = num1 - num2;
            System.out.println("Subtraction from "+num1+" of "+num2+" : "+result);
            break;

            case '*': 
            result = num1 * num2;
            System.out.println("Multiplication of "+num1+" & "+num2+" : "+result);
            break;

            case '/': 
            if(num2 == 0){
                System.out.println("Error!! 2nd Number can't be Zero");
            }
            else {
                result = num1 / num2;
                System.out.println("Division of "+num1+" by "+num2+" : "+result);
            }
            break;

            default: System.out.println("Invalid Input");
            break;
        }

    }
}
