/*
 * Declare a method-local variable strNumber of type String with some value and 
 * convert it to a byte value using the parseByte method. 
 * (Hint: Use Byte.parseByte(String)).
 */

public class Q2e {
    public static void main(String[] args) {
        String strNumber = "107"; 

        byte byteValue = Byte.parseByte(strNumber);

        System.out.println("Byte value: " + byteValue);
    }
}
