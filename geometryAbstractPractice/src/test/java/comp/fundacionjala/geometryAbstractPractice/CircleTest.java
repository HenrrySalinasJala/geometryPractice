package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static comp.fundacionjala.geometryAbstractPractice.Constant.DELTA;

/**
 * Tests for {@link Circle}
 */
public class CircleTest {

    private IShape circle;

    @Before
    public void setUp() {
        final double radio=4;
        circle = new Circle(radio);
    }

    @Test
    public void testACircleCanCalculateItsPerimeter() {
        final double perimeterExpected = 25.12;
        assertEquals("the perimeter obtained does not match with the perimeter expected", perimeterExpected, circle.calculatePerimeter(), DELTA);
    }

    @Test
    public void testACircleCanCalculateItsArea() {
        final double areaExpected = 50.24;
        assertEquals(areaExpected, circle.calculateArea(), DELTA);
    }
}
