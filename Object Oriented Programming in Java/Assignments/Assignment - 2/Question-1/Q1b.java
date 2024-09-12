/*
 * Declare a method-local variable status of type boolean with the value true and 
 * convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).
 */

public class Q1b {
    public static void main(String[] args) {
        boolean status = true;
        String str = Boolean.toString(status);
        System.out.println(str);
    }
}