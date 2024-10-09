import java.util.*;
public class Question6 {

    public static void reverseWordsOfString(String str) {
        String[] words = str.split(" ");
        int start = 0;
        int end = words.length-1;

        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;

            start++;
            end--;
        }
        for(int i=0; i<words.length; i++) {
            System.out.print(words[i] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Reverse String is: ");
        reverseWordsOfString(str);
        sc.close();
    }
}
