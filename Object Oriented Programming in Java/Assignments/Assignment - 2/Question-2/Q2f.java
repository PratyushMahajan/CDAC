/*
 * Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and 
 * attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).
 */

public class Q2f {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";

        try {
            byte byteValue = Byte.parseByte(strNumber);
            System.out.println("Byte value: " + byteValue);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
