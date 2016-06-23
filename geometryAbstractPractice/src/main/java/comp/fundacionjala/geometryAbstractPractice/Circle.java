package comp.fundacionjala.geometryAbstractPractice;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements IShape {

    private static final int CIRCLE_FORMULA_VALUE = 2;

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return PI * pow(radio, CIRCLE_FORMULA_VALUE);
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return radio * PI * CIRCLE_FORMULA_VALUE;
    }
}
