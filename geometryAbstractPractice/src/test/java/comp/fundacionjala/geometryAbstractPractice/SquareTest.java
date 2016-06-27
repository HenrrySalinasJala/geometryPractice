package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static comp.fundacionjala.geometryAbstractPractice.Constant.DELTA;
import static org.junit.Assert.assertEquals;

public class SquareTest {

    private IShape square;

    @Before
    public void setUp() {
        final int side = 4;
        square = new Square(side);
    }

    @Test
    public void testASquareCanCalculateItsPerimeter() {
        final double expectedPerimeter = 16;
        assertEquals(expectedPerimeter, square.calculatePerimeter(), DELTA);
    }

    @Test
    public void testASquareCanCalculateItsArea() {
        final double expectedArea = 16;
        assertEquals(expectedArea, square.calculateArea(), DELTA);
    }
}
