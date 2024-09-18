import java.util.*;

public class Question2 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the size of Array: ");
		int size =  sc.nextInt();
		
		System.out.print("How many large numbers you want to search: ");
		int k = sc.nextInt();
		
		int[] array  = new int[size];
	
		System.out.println("Enter the Array Elements: ");
		for(int i=0; i<array.length; i++) {
			array[i]= sc.nextInt();
		}
		System.out.print("Largest "+k+" Elements: ");
		Arrays.sort(array);

		int kLargest = array.length-1-k;
		for (int i=array.length-1; i>kLargest; i--) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}

}
