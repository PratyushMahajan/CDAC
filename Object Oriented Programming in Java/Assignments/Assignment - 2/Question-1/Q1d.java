/*
 * Declare a method-local variable strStatus of type String with the value "1" or "0" and 
 * attempt to convert it to a boolean. 
 * (Hint: parseBoolean method will not work as expected with "1" or "0").
 */

public class Q1d {
    public static void main(String[] args) {
        String strStatus = "1";
        boolean  b = strStatus.equals("1");
        System.out.println(b);
    }
}
