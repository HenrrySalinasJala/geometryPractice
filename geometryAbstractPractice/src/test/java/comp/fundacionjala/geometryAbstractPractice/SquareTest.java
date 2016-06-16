package comp.fundacionjala.geometryAbstractPractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    private Square square;
    private static final double perimeterExpected = 16;
    private static final double areaExpected = 16;

    @Before
    public void setUp() {
        square = new Square(4);
    }

    @Test
    public void testASquareCanCalculateItsPerimeter() {

        assertEquals(perimeterExpected, square.calculatePerimeter(), constant.DELTA);
    }

    @Test
    public void testASquareCanCalculateItsArea() {

        assertEquals(areaExpected, square.calculateArea(), constant.DELTA);
    }
}
