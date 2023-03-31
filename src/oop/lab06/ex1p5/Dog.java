package oop.lab06.ex1p5;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Dog["
                + super.toString()
                + "]";
    }
}
