import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeasurementTest {

    @Test
    public void testMultiply() throws Exception {
        Measurement firstValue = new Measurement(2, "m");
        Measurement secondValue = new Measurement(2, "m");
        Measurement expected = new Measurement(4, "mxm");
        assertEquals(expected, firstValue.multiply(secondValue));
    }

    @Test
    public void testMultiplyWithInt() throws Exception {
        Measurement firstValue = new Measurement(2, "m");
        int secondValue = 2;
        Measurement expected = new Measurement(4, "m");
        assertEquals(expected, firstValue.multiply(secondValue));
    }

    @Test
    public void testEquals() throws Exception {
        Measurement firstValue = new Measurement(2, "m");
        Measurement secondValue = new Measurement(2, "m");
        assertEquals(firstValue, secondValue);
    }
}