package comp.fundacionjala.geometryAbstractPractice;

public class Circle extends Shape implements IShape {

    private static final int CIRCLE_FORMULA_VALUE = 2;
    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radio, CIRCLE_FORMULA_VALUE);
    }

    public double calculatePerimeter() {
        return radio * Math.PI * CIRCLE_FORMULA_VALUE;
    }
}
