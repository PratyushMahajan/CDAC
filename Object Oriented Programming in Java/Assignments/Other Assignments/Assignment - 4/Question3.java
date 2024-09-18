public class Question3 {
    public static void main(String[] args) {
        int a = 7;
        float b = 5.5f;
        double c = 33.5d;
        
        double sum = a+b+c;
        System.out.println("Addition: "+sum);

        double sub = c-b-a;
        System.out.println("Substraction: "+sub);

        double mul = c*b*a;
        System.out.printf("Multiplication: %0.2f",mul);

        double div = c/b/a;
        System.out.printf("Division: %0.2f",div);
    }
}
