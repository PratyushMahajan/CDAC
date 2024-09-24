public class Question5 {
    public static void main(String[] args) {
        // part b
        long byteSize = Long.BYTES;
        System.out.println(byteSize);

        // part c
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        // part d
        long numD = 543298723L;
        String strD = Long.toString(numD);
        System.out.println(strD);

        // part e
        String strNumE = "987654321";
        long numE = Long.parseLong(strNumE);
        System.out.println(numE);

        // part g
        long numG = 123456L;
        Long objG = Long.valueOf(numG);
        System.out.println(objG);

        // part h
        String strNumH = "654321";
        Long objH = Long.valueOf(strNumH);
        System.out.println(objH);

        // part i
        long val1 = 4321L;
        long val2 = 8765L;
        System.out.println(Long.sum(val1, val2));

        // part j
        long firstVal = 1024L;
        long secondVal = 2048L;
        System.out.println(Long.min(firstVal, secondVal) + " " + Long.max(firstVal, secondVal));

        // part k
        long numK = 13L;
        System.out.println(Long.toBinaryString(numK) + " " + Long.toHexString(numK) + " " + Long.toOctalString(numK));
    }
}
