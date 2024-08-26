//Write a program to print the Fibonacci sequence up to the number 21. 

public class Question5 {
    public static void main(String[] args) {
        int n1 = 0; int n2 = 1;
        System.out.print("Fibonacci sequence upto 21 is: "+n1+" "+n2+" ");
        
        for(int i=0; i<100; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");

            if(n3 == 21) {
                break;
            }
        }
    }
}
