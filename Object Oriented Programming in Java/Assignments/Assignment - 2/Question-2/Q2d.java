/*
 * Declare a method-local variable number of type byte with some value and 
 * convert it to a String using the toString method.
 * (Hint: Use Byte.toString(byte)).
 */

public class Q2d {
    public static void main(String[] args) {
        byte number = 125; 
        String numberAsString = Byte.toString(number);
        System.out.println("Byte value as String: " + numberAsString);
    }
}
