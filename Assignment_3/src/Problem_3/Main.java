package Problem_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        String ch = scanner.nextLine().toUpperCase();

        switch (ch) {
            case "C":
                System.out.println("Enter the radius of the Circle:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("The area of Circle is: " + circle.computeArea());
                break;
            case "R":
                System.out.println("Enter the width of the Rectangle:");
                double width = scanner.nextDouble();
                System.out.println("Enter the height of the Rectangle:");
                double length = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(width, length);
                System.out.println("The area of Rectangle is: " + rectangle.computeArea());
                break;
            case "T":
                System.out.println("Enter the base of the Triangle:");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the Triangle:");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("The area of Triangle is:" + triangle.computeArea());
                break;
            default:
                System.out.println("You did not enter any choice");
        }
        scanner.close();

    }
}
