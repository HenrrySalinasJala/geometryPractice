package comp.fundacionjala.geometryAbstractPractice;

public class Rectangle extends Shape implements IShape {

    private static final int RECTANGLE_SIDES = 2;
    protected double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width) {
        this.width = width;
        this.height = width;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return height * RECTANGLE_SIDES + width * RECTANGLE_SIDES;
    }
}

