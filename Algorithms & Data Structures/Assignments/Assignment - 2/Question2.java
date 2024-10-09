public class Question2 {
    public static int removeDuplicates(int[] arr) { // Time Complexity: O(n), Space Complexity: O(1)
        int i = 0;
        for(int j=1; j<arr.length; j++) {
            if(arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int k = removeDuplicates(arr);
        System.out.println("The number of unique elements is: " +k);
    }
}
