public class Question4 {
    public static void main(String[] args) {
        // part b
        int byteSize = Integer.BYTES;
        System.out.println(byteSize);

        // part c
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println(minValue + " " + maxValue);

        // part d
        int numD = 456789;
        String strD = Integer.toString(numD);
        System.out.println(strD);

        // part e
        String strNumE = "543210";
        int numE = Integer.parseInt(strNumE);
        System.out.println(numE);

        // part g
        int numG = 65432;
        Integer objG = Integer.valueOf(numG);
        System.out.println(objG);

        // part h
        String strNumH = "765";
        Integer objH = Integer.valueOf(strNumH);
        System.out.println(objH);

        // part i
        short shortVal = 15000;
        long longVal = 123456L;
        float floatVal = 72.34f;
        double doubleVal = 987.65d;
        System.out.println((int) shortVal + " " + (int) longVal + " " + (int) floatVal + " " + (int) doubleVal + " ");

        int val1 = 8;
        int val2 = 4;
        int val3 = 9;
        
        System.out.println((double) val1 + " " + (long) val2 + " " + (float) val3);

        // part j
        int firstVal = 22;
        int secondVal = 14;
        System.out.println(Integer.min(firstVal, secondVal) + " " + Integer.max(firstVal, secondVal));

        // part k
        int numK = 13;
        System.out.println(Integer.toBinaryString(numK) + " " + Integer.toOctalString(numK) + " " + Integer.toHexString(numK));
    }
}
