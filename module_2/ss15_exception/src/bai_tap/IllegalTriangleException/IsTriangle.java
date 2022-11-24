package bai_tap.IllegalTriangleException;

import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter 3 sides of the triangle ( a ; b ; c )");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                checkSideTriangle(a, b, c);
                break;
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }
    public static void checkSideTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b < c || a + c < b || b + c < a || (a <= 0 && b <= 0 && c <= 0)) {
            throw new IllegalTriangleException();
        } else System.out.println(" a ,b ,c are 3 sides of the triangle ");
    }


}