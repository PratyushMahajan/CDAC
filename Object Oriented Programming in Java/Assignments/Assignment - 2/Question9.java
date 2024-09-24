public class Question9 {
    private int intVal;
    private byte byteVal;
    private short shortVal;
    private long longVal;
    private float floatVal;
    private double doubleVal;
    private char charVal;
    private boolean boolVal;

    private static int staticIntVal;
    private static byte staticByteVal;
    private static short staticShortVal;
    private static long staticLongVal;
    private static float staticFloatVal;
    private static double staticDoubleVal;
    private static char staticCharVal;
    private static boolean staticBoolVal;

    public static void main(String[] args) {
        Question9 instance = new Question9();
        System.out.println(instance.intVal);
        System.out.println(instance.byteVal);
        System.out.println(instance.shortVal);
        System.out.println(instance.longVal);
        System.out.println(instance.floatVal);
        System.out.println(instance.doubleVal);
        System.out.println(instance.charVal);
        System.out.println(instance.boolVal);

        System.out.println(staticIntVal);
        System.out.println(staticByteVal);
        System.out.println(staticShortVal);
        System.out.println(staticLongVal);
        System.out.println(staticFloatVal);
        System.out.println(staticDoubleVal);
        System.out.println(staticCharVal);
        System.out.println(staticBoolVal);
    }
}
