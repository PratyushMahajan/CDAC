class Program3{
    public static void main(String[] args) {
        //int num1 = new int( 10 );   //Not OK
        int num1 = 10;//OK
        Integer num2 = new Integer(num1);   //OK

        String s1 = new String("Pratyush");
        //String s1;  //Object reference / reference 
        //new String("Pratyush");    //Instance
        System.out.println(s1);

        String s2 = "Mahajan";
        //String s2;    //Object reference / reference 
        //"Mahajan";    //String constant / String literal
        System.out.println(s2);
    }
}   