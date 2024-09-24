public class Question8 {
    public static void main(String[] args) {
        int intVal = 25;
        byte byteVal = 8;
        short shortVal = 300;
        long longVal = 123456789L;
        float floatVal = 3.14f;
        double doubleVal = 9876.543;
        char charVal = 'A';
        boolean boolVal = true;

        String intStr1 = Integer.toString(intVal);
        String byteStr1 = Byte.toString(byteVal);
        String shortStr1 = Short.toString(shortVal);
        String longStr1 = Long.toString(longVal);
        String floatStr1 = Float.toString(floatVal);
        String doubleStr1 = Double.toString(doubleVal);
        String charStr1 = Character.toString(charVal);
        String boolStr1 = Boolean.toString(boolVal);

        String intStr2 = String.valueOf(intVal);
        String byteStr2 = String.valueOf(byteVal);
        String shortStr2 = String.valueOf(shortVal);
        String longStr2 = String.valueOf(longVal);
        String floatStr2 = String.valueOf(floatVal);
        String doubleStr2 = String.valueOf(doubleVal);
        String charStr2 = String.valueOf(charVal);
        String boolStr2 = String.valueOf(boolVal);

        System.out.println("Using toString():");
        System.out.println("int: " + intStr1 + ", byte: " + byteStr1 + ", short: " + shortStr1 + ", long: " + longStr1);
        System.out.println("float: " + floatStr1 + ", double: " + doubleStr1 + ", char: " + charStr1 + ", boolean: " + boolStr1);
        System.out.println();
        System.out.println("Using valueOf():");
        System.out.println("int: " + intStr2 + ", byte: " + byteStr2 + ", short: " + shortStr2 + ", long: " + longStr2);
        System.out.println("float: " + floatStr2 + ", double: " + doubleStr2 + ", char: " + charStr2 + ", boolean: " + boolStr2);
    }
}

           