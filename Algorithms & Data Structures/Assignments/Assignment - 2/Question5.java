import java.util.*;
public class Question5 {
    
    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter integers in Array: ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Reverse Array: "+Arrays.toString(reverseArray(arr)));
        sc.close();
    }
}
