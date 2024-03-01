package Problem_3;

final public class Triangle {
    private final double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double computeArea() {
        return  0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
