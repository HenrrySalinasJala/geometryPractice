package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PainterTest {
    private IShape shape;
    @Before
    public void setUp(){

    }
    @Test
    public void testAShapeCanCalculateCircleArea() {
        double areaExpected = 50.24;
        shape = new Circle(4);
        assertEquals(areaExpected, shape.calculateArea(), constant.DELTA);
    }

    @Test
    public void testAShapeCanCalculateCirclePerimeter() {
        double perimeterExpected = 25.12;
         shape = new Circle(4);
        assertEquals(perimeterExpected, shape.calculatePerimeter(), constant.DELTA);
    }

    @Test
    public void testAShapeCanCalculateSquareArea() {
        double areaExpected = 16;
        shape = new Square(4);
        assertEquals(areaExpected, shape.calculateArea(), constant.DELTA);
    }

    @Test
    public void testAShapeCanCalculateSquarePerimeter() {
        double perimeterExpected = 16;
        shape = new Square(4);
        assertEquals(perimeterExpected, shape.calculatePerimeter(), constant.DELTA);
    }
    @Test
    public void testAShapeCanCalculateRectangleArea() {
        double areaExpected = 8;
        shape = new Rectangle(4,2);
        assertEquals(areaExpected, shape.calculateArea(), constant.DELTA);
    }

    @Test
    public void testAShapeCanCalculateRectanglePerimeter() {
        double perimeterExpected = 12;
        shape = new Rectangle(4,2);
        assertEquals(perimeterExpected, shape.calculatePerimeter(), constant.DELTA);
    }
}
