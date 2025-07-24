package triangle;

import java.util.Scanner;

public class TriangleArea {
    double base, height;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        height = sc.nextDouble();
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public void displayArea() {
        System.out.printf("Area of triangle is: %.2f%n", calculateArea());
    }
}
