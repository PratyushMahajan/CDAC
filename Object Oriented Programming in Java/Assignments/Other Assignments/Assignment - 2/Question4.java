import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Month (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2: System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5: System.out.println("Spring"); break;
            case 6:
            case 7:
            case 8: System.out.println("Summer"); break;
            case 9:
            case 10:
            case 11: System.out.println("Autumn"); break;
            case 12: System.out.println("Winter"); break;
        
            default: System.out.println("Wrong Input"); break;
        }
        sc.close();
    }
    
}
