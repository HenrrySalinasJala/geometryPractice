package comp.fundacionjala.geometryAbstractPractice;

public class Square extends Rectangle implements IShape {

    public static final double SHAPE_SIDES=4;

    public Square(double side) {
        super(side);
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public double calculatePerimeter() {
        return side * SHAPE_SIDES;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
