import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter number of queries: ");
        int n = sc.nextInt();

        long[] arr = new long[size + 1];
        int[][] queries = new int[n][3];

        for (int i=0; i<n; i++) {
            System.out.println("Enter query " + (i+1) + " (start end value): ");
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
            queries[i][2] = sc.nextInt();

            int start = queries[i][0] - 1;
            int end = queries[i][1];
            int value = queries[i][2];

            arr[start] += value;
            if (end < size) {
                arr[end] -= value;
            }
        }

        long max = Long.MIN_VALUE;
        long sum = 0;

        for (int i=0; i<size; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
        }

        System.out.println("Maximum value after all operations: " +max);
        sc.close();
    }
}
