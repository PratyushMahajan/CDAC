public class Question6 {
    public static void main(String[] args) {
        // part b
        float byteSize = Float.BYTES;
        System.out.println(byteSize);

        // part c
        System.out.println(Float.MAX_VALUE + " " + Float.MIN_VALUE);

        // part d
        float numD = 12345.67f;
        String strD = Float.toString(numD);
        System.out.println(strD);

        // part e
        String strNumE = "4512.342";
        float numE = Float.parseFloat(strNumE);
        System.out.println(numE);

        // part g
        float numG = 78123.99f;
        Float objG = Float.valueOf(numG);
        System.out.println(objG);

        // part h
        String strNumH = "984.34";
        Float objH = Float.valueOf(strNumH);
        System.out.println(objH);

        // part i
        float val1 = 182.34f;
        float val2 = 497.22f;
        System.out.println(Float.sum(val1, val2));

        // part j
        float firstVal = 101.45f;
        float secondVal = 299.88f;
        System.out.println(Float.min(firstVal, secondVal) + " " + Float.max(firstVal, secondVal));

        // part k
        float negNum = -36.0f;
        System.out.println(Math.sqrt(negNum)); // output is NaN

        // part l
        float zero1 = 0.0f;
        float zero2 = 0.0f;
        System.out.println(zero1 / zero2); // output is NaN

        // part m
        int intVal = 25;
        byte byteVal = 10;
        double doubleVal = 45.678;
        short shortVal = 150;
        long longVal = 543678432L;
        System.out.println((float) intVal + " " + (float) byteVal + " " + (float) doubleVal + " " + (float) shortVal + " " + (float) longVal);
    }
}
