package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static comp.fundacionjala.geometryAbstractPractice.Constant.DELTA;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private IShape rectangle;

    @Before
    public void setUp() {
        final int width = 4;
        final int height = 2;
        rectangle = new Rectangle(width, height);
    }

    @Test
    public void testARectangleCanCalculateItsPerimeter() {
        final double expectedPerimeter = 12;
        assertEquals(expectedPerimeter, rectangle.calculatePerimeter(), DELTA);
    }

    @Test
    public void testARectangleCanCalculateItsArea() {
        final double expectedArea = 8;
        assertEquals(expectedArea, rectangle.calculateArea(), DELTA);
    }
}
