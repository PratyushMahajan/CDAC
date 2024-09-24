class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine is starting");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine is stopping");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine is shutting down");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is starting up");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine is shutting down");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        myCar.startEngine();
        myCar.stopEngine();

        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}
