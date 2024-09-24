public class Question7 {
    public static void main(String[] args) {
        // part b
        double byteSize = Double.BYTES;
        System.out.println(byteSize);

        // part c
        System.out.println(Double.MAX_VALUE + " " + Double.MIN_VALUE);

        // part d
        Double numD = 65432.12d;
        String strD = Double.toString(numD);
        System.out.println(strD);

        // part e
        String strNumE = "4892.554";
        double numE = Double.parseDouble(strNumE);
        System.out.println(numE);

        // part g
        Double numG = 23145.89;
        Double objG = Double.valueOf(numG);
        System.out.println(objG);

        // part h
        String strNumH = "1923.45";
        double objH = Double.valueOf(strNumH);
        System.out.println(objH);

        // part i
        double val1 = 145.876;
        double val2 = 678.342;
        System.out.println(Double.sum(val1, val2));

        // part j
        double firstVal = 198.22;
        double secondVal = 429.33;
        System.out.println(Double.min(firstVal, secondVal) + " " + Double.max(firstVal, secondVal));

        // part k
        double negVal = -42.0;
        System.out.println(Math.sqrt(negVal)); // output is NaN

        // part l
        double zero1 = 0.0;
        double zero2 = 0.0;
        System.out.println(zero1 / zero2); // output is NaN

        // part m
        int intVal = 7;
        byte byteVal = 3;
        short shortVal = 233;
        long longVal = 123456789L;
        System.out.println((double) intVal + " " + (double) byteVal + " " + (double) shortVal + " " + (double) longVal);
    }
}
