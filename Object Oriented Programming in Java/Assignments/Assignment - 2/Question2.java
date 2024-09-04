import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height in metres: ");
        double height = sc.nextDouble();
        System.out.print("Enter Weight in kgs: ");
        double weight = sc.nextDouble();

        double bmi = weight/(height*height);

        if(bmi <= 18.4) {
            System.out.format("You are Underweight, BMI: %.2f", bmi);
        }
        else if(bmi > 18.4 && bmi < 25) {
            System.out.format("You have Normal Weight, BMI: %.2f", bmi);
        }
        else {
            System.out.format("You are Overweight, BMI: %.2f", bmi);
        }

        sc.close();
    }
}
