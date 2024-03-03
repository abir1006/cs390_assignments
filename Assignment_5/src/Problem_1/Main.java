package Problem_1;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];

        shapes[0] = new Rectangle("red", 2, 4);
        shapes[1] = new Circle("blue", 3);
        shapes[2] = new Circle("purple", 10);
        shapes[3] = new Square("yellow", 3, 3);
        shapes[4] = new Square("grey", 5, 5);

        printTotal(shapes);

    }

    public static void printTotal(Shape[] shapes) {

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape: shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);

    }
}
