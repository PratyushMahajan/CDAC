/*
 * Declare a method-local variable strStatus of type String with the value "true" 
 * and convert it to the corresponding wrapper class using Boolean.valueOf(). 
 * (Hint: Use Boolean.valueOf(String)).
 */

public class Q1f {
    public static void main(String[] args) {
        String strStatus = "true";
        System.out.println(Boolean.valueOf(strStatus));
    }
}