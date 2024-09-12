/*
 * Declare a method-local variable strNumber of type String with some byte value and 
 * convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(String)).
 */

public class Q2h {
    public static void main(String[] args) {
        String str = "66";
		System.out.println(Byte.valueOf(str));
    }
}
