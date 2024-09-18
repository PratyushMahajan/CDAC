import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ") ;
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter window length: ");
        int k = sc.nextInt();
        for(int i=0; i<n-k+1; i++) {
            int[] window = new int[k];
            for(int j=0; j<k; j++) {
                window[j] = arr[i+j];
            }
            Arrays.sort(window);
            
            if(k%2 != 0) {
                System.out.println(window[k/2]);
            }
            else {
                double median = ((double)window[k/2 - 1] + (double)window[k/2])/2;
                System.out.println(median);
            }
        }
        sc.close();
    }
}
