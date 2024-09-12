/*
 * Experiment with converting a byte value into other primitive types or vice versa and observe the results.
 */

public class Q2i {
    public static void main(String[] args) {
        byte byteValue = 20; 

        // Converting byte to other primitive types
        int intValue = byteValue;        
        short shortValue = byteValue;    
        long longValue = byteValue;      
        float floatValue = byteValue;    
        double doubleValue = byteValue;  
        char charValue = (char) byteValue; 

        
        System.out.println("Byte value: " + byteValue);
        System.out.println("Converted to int: " + intValue);
        System.out.println("Converted to short: " + shortValue);
        System.out.println("Converted to long: " + longValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to double: " + doubleValue);
        System.out.println("Converted to char: " + charValue);

        // Converting other primitive types back to byte
        byte fromInt = (byte) intValue;       
        byte fromShort = (byte) shortValue;   
        byte fromLong = (byte) longValue;     
        byte fromFloat = (byte) floatValue;   
        byte fromDouble = (byte) doubleValue; 
        byte fromChar = (byte) charValue;     

        System.out.println();
        System.out.println("Conversions back to byte:");
        System.out.println("From int: " + fromInt);
        System.out.println("From short: " + fromShort);
        System.out.println("From long: " + fromLong);
        System.out.println("From float: " + fromFloat);
        System.out.println("From double: " + fromDouble);
        System.out.println("From char: " + fromChar);
    }
}
