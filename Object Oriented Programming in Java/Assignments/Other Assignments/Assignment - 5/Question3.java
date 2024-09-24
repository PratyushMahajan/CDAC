class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Animal animal = new Animal("Pet Animal");
        Dog dog = new Dog("Shero");

        animal.eat();
        animal.sleep();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
