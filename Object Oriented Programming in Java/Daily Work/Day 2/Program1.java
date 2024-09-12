class Program1 {
    public static void main(String[] args) { // String[] args
        System.out.println("Hello World");
    }
}

class A {
    public static void main(String args[]) { // String args[]
        System.out.println("A.Hello World");
    }
}

class B {
    public static void main(String...args) { // String...args
        System.out.println("B.Hello World");
    }
}
// Each class can have one main method, so there can be multiple main methods in java code.
// But at the time of execution only the main method is executed whose class name is same as the java file name.
//So until on compiler we specify that we want output from another class it will execute Program(in this case) class. 
// For executing class A, we can command in terminal as: java A, after compilation with javac Program.java