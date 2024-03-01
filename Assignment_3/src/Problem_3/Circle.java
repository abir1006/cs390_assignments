package Problem_3;

final public class Circle {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
