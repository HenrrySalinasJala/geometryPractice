package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    private Square square;

    @Before
    public void setUp() {
        square = new Square(4);
    }

    @Test
    public void testASquareCanCalculateItsPerimeter() {
        double expectedPerimeter = 16;
        assertEquals(expectedPerimeter, square.calculatePerimeter(), constant.DELTA);
    }

    @Test
    public void testASquareCanCalculateItsArea() {
        double expectedArea = 16;
        assertEquals(expectedArea, square.calculateArea(), constant.DELTA);
    }
}
