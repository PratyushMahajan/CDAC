class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model) {
        super(make, year); 
        this.model = model;
    }

    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Model: " + model);
    }
}

public class Question2 {
    public static void main(String[] args) {

        Car car = new Car("Swift", 2021, "DZire");

        car.displayDetails();
    }
}
