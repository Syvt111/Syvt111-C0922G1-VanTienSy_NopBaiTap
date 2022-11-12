package bai_tap.CircleClass_CylinderClass;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius and color");
        double radius = input.nextDouble();
        String color = input.next();
        Circle circle = new Circle(radius,color);
        System.out.println(circle);
    }
}
