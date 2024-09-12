/*
 * Declare a method-local variable number of type byte with some value and 
 * convert it to the corresponding wrapper class using Byte.valueOf(). 
 * (Hint: Use Byte.valueOf(byte)).
 */

public class Q2g {
    public static void main(String[] args) {
        byte c = 100;
		System.out.println(Byte.valueOf(c));
    }
}
