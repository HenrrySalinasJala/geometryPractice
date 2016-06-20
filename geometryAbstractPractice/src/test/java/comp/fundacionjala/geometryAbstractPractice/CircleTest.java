package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private Circle circle;

    @Before
    public void setUp() {
        circle = new Circle(4);
    }

    @Test
    public void testACircleCanCalculateItsPerimeter() {
        double perimeterExpected = 25.12;
        assertEquals(perimeterExpected, circle.calculatePerimeter(), constant.DELTA);
    }

    @Test
    public void testACircleCanCalculateItsArea() {
        double areaExpected = 50.24;
        assertEquals(areaExpected, circle.calculateArea(), constant.DELTA);
    }
}
