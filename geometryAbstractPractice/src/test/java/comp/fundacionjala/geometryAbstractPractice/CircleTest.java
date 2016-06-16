package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private Circle circle;
    private static final double perimeterExpected = 25.12;
    private static final double areaExpected = 50.24;

    @Before
    public void setUp() {
        circle = new Circle(4);
    }

    @Test
    public void testACircleCanCalculateItsPerimeter() {

        assertEquals(perimeterExpected, circle.calculatePerimeter(), constant.DELTA);
    }

    @Test
    public void testACircleCanCalculateItsArea() {

        assertEquals(areaExpected, circle.calculateArea(), constant.DELTA);
    }
}
