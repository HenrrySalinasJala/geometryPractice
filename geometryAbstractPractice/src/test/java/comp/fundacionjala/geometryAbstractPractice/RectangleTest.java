package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by HENRRY on 16/06/2016.
 */
public class RectangleTest {

    private Rectangle rectangle;
    private static final double perimeterExpected = 12;
    private static final double areaExpected = 8;

    @Before
    public void setUp() {
        rectangle = new Rectangle(4, 2);
    }

    @Test
    public void testARectangleCanCalculateItsPerimeter() {
        assertEquals(perimeterExpected, rectangle.calculatePerimeter(), constant.DELTA);
    }

    @Test
    public void testARectangleCanCalculateItsArea() {

        assertEquals(areaExpected, rectangle.calculateArea(), constant.DELTA);
    }
}
