import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice -");
        System.out.println("Press 1 for Circle");
        System.out.println("Press 2 for Square");
        System.out.println("Press 3 for Rectangle");
        System.out.println("Press 4 for Triangle");

        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double rad = sc.nextDouble();
                double area = Math.PI*rad*rad;
                System.out.format("Area of the Circle: %.2f",area);
                break;

            case 2:
                System.out.print("Enter length of the square: ");
                double len = sc.nextDouble();
                double areasq = len*len;
                System.out.format("Area of the Square: %.2f",areasq);
                break;

            case 3:
                System.out.print("Enter length of the rectangle: ");
                double lenrec = sc.nextDouble();
                System.out.print("Enter breadth of the rectangle: ");
                double wid = sc.nextDouble();
                double arearec = lenrec*wid;
                System.out.format("Area of the Rectangle: %.2f",arearec);
                break;

            case 4:
                System.out.print("Enter base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of the rectangle: ");
                double height = sc.nextDouble();
                double areatri = 0.5*base*height;
                System.out.format("Area of the Triangle: %.2f",areatri);
                break;
        
            default: System.out.println("Wrong Input");
                break;
        }
        sc.close();
    }
}
