import java.util.*;
public class Question8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of queries: ");
        int n = sc.nextInt();
        
        int[][] queries = new int[n][3];
        int[] result = new int[n];
        
        for (int i=0; i<n; i++) {
            System.out.println("Enter query " +(i+1)+ " (start end value): ");
            queries[i][0] = sc.nextInt(); 
            queries[i][1] = sc.nextInt(); 
            queries[i][2] = sc.nextInt(); 
        }
        

     
    }
}