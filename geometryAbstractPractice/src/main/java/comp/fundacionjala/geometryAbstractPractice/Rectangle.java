package comp.fundacionjala.geometryAbstractPractice;

public class Rectangle implements IShape {

    private static final int RECTANGLE_SIDES = 2;

    private final double width;

    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return height * width;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return RECTANGLE_SIDES * (height + width);
    }
}

