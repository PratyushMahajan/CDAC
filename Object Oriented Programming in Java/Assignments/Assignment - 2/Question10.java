public class Question10 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide an integer, an operator, and another integer");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        char operator = args[1].charAt(0); 
        int num2 = Integer.parseInt(args[2]);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
