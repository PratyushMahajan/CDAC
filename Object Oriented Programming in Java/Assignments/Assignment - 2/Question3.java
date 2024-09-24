public class Question3 {
    public static void main(String[] args) {
        // part b
        short b = Short.BYTES;
        System.out.println(b);

        // part c
        short cmax = Short.MAX_VALUE;
        short cmin = Short.MIN_VALUE;
        System.out.println(cmax + " " + cmin);

        // part d
        short d = 180;
        String str = Short.toString(d);
        System.out.println(str);

        // part e
        String strE = "1234";
        short e = Short.parseShort(strE);
        System.out.println(e);

        // part g
        short num = 456;
        Short g = Short.valueOf(num);
        System.out.println(g);

        // part h
        String strH = "789";
        Short h = Short.valueOf(strH);
        System.out.println(h);

        // part i
        int intI = 18;
        float floatI = 49.15f;
        double doubleI = 66.13d;
        char charI = '7';
        short i1 = (short) intI;
        short i2 = (short) floatI;
        short i3 = (short) doubleI;
        short i4 = (short) charI;
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " ");

        short I1 = 129;
        short I2 = 130;
        short I3 = 140;
        short I4 = 65;
        int i = (int) I1;
        float f = (float) I2;
        double di = (double) I3;
        char c = (char) I4;
        System.out.println(i + " " + f + " " + di + " " + c + " ");
    }
}
