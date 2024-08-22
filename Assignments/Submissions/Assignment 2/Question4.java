import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Amount : ");
        int amount = sc.nextInt();

        if(amount >= 1000) {
            System.out.println("Hey, You get a 20% Discount");
            System.out.print("Do you have a Membership Card (Y / N) : ");
            char card = sc.next().charAt(0);

            if(card == 'Y') {
                System.out.println("Hurray, You got extra 5% Discount");
                System.out.println("Discounted Amount after 25% dedeuction : "+amount*0.75);
            }
            else {
                System.out.println("Discounted Amount after 20% deduction : "+amount*0.8);
            }
            
        }
        else if(amount >= 500 && amount <= 999) {
            System.out.println("Hey, You get a 10% Discount");
            System.out.print("Do you have a Membership Card (Y / N) : ");
            char card = sc.next().charAt(0);

            if(card == 'Y') {
                System.out.println("Hurray, You got extra 5% Discount");
                System.out.println("Discounted Amount after 15% dedeuction : "+amount*0.85);
            }
            else {
                System.out.println("Discounted Amount after 10% deduction : "+amount*0.9);
            }
        }
        else {
            System.out.println("Hey, You get a 5% Discount");
            System.out.print("Do you have a Membership Card (Y / N) : ");
            char card = sc.next().charAt(0);

            if(card == 'Y') {
                System.out.println("Hurray, You got extra 5% Discount");
                System.out.println("Discounted Amount after 10% dedeuction : "+amount*0.9);
            }
            else {
                System.out.println("Discounted Amount after 5% deduction : "+amount*0.95);
            }
        }
    }
}
