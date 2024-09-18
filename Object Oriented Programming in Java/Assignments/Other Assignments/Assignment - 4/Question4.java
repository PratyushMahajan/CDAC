public class Question4 {
    public static void main(String[] args) {
        int a = 5;

        float f = a;
        System.out.println("Int to float: "+f);

        double d = a;
        System.out.println("Int to double: "+d);

        //boolean b = a; Cannot convert an integer to a boolean value

        String s = Integer.toString(a);
        System.out.println("Int to String: "+s);
    }
}
