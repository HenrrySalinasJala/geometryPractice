package comp.fundacionjala.geometryAbstractPractice;

public class Circle extends Shape implements IShape {

    public static final int CIRCLE_FORMULE_VALUE = 2;
    private double radio;
    private static final double PI = Math.PI;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double calculateArea() {
        double area = 0;
        area = PI * Math.pow(radio, CIRCLE_FORMULE_VALUE);
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        perimeter = radio * PI * CIRCLE_FORMULE_VALUE;
        return perimeter;
    }
}
