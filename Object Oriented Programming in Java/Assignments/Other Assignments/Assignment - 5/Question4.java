class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Student student = new Student("Pratyush Mahajan", 21, "Information Technology");
        student.displayDetails();
    }
}
