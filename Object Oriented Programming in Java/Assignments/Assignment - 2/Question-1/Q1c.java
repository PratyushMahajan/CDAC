/*
 * Declare a method-local variable strStatus of type String with the value "true" and 
 * convert it to a boolean using the parseBoolean method. 
 * (Hint: Use Boolean.parseBoolean(String)).
 */
public class Q1c {
    public static void main(String[] args) {
        String strStatus = "true";
        boolean status = Boolean.parseBoolean(strStatus);
        System.out.println(status);
    }
}
