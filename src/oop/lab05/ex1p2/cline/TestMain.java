package oop.lab05.ex1p2.cline;

import oop.lab05.ex1p1.service.Circle;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1);
        Circle circle2 = new Circle();
        System.out.println(circle2);
        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());
        System.out.printf("area is: %.2f%n", circle1.getArea());
    }
}
