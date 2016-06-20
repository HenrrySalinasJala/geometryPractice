package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(4, 2);
    }

    @Test
    public void testARectangleCanCalculateItsPerimeter() {
        double expectedPerimeter = 12;
        assertEquals(expectedPerimeter, rectangle.calculatePerimeter(), constant.DELTA);
    }

    @Test
    public void testARectangleCanCalculateItsArea() {
        double expectedArea = 8;
        assertEquals(expectedArea, rectangle.calculateArea(), constant.DELTA);
    }
}
