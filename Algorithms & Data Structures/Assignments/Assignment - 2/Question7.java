import java.util.*;
public class Question7 {
    
    public static int reverseNumber(int n) {
        String number = Integer.toString(Math.abs(n));
        char[] arr = number.toCharArray();

        int start = 0;
        int end = number.length()-1;
        while(start < end) {
            char c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;
            
            start++;
            end--;
        }
        String str = new String(arr);

        int ans = Integer.parseInt(str);

        if(n < 0) {
            return ans * -1;
        }
        else {
            return ans;
        }        
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.print("Reverse of Integer: "+reverseNumber(num));
        sc.close();
    }
}
