package comp.fundacionjala.geometryAbstractPractice;

/**
 * Created by HENRRY on 16/06/2016.
 */
public class Rectangle extends Shape implements IShape {

    public static final int RECTANGLE_FORMULE_VALUE = 2;
    protected double side;
    private double shortSide;

    public Rectangle(double longSide, double shortSide) {
        this.side = longSide;
        this.shortSide = shortSide;
    }
    public Rectangle(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return shortSide * side;
    }

    public double calculatePerimeter() {
        double perimetro = shortSide * RECTANGLE_FORMULE_VALUE + side * RECTANGLE_FORMULE_VALUE;
        return perimetro;
    }
}

