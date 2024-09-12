/*
 * Experiment with converting a boolean value into other primitive types or vice versa and observe the results.
 */

public class Q1g {
    public static void main(String[] args) {

        int val = 5;

        boolean boolint = val != 0;
        System.out.println("Int to boolean: " + boolint);  

        double doubleval = 0.0;

        boolean b = doubleval != 0.0;
        System.out.println("Double to boolean: " + b);  

        char charval = 'A';

        boolean boolchar = charval != '\0';
        System.out.println("Char to boolean: " + boolchar);  
        String stringValue = "true";

        boolean boolstring = Boolean.parseBoolean(stringValue);
        System.out.println("String to boolean: " + boolstring);  
    }
    
}