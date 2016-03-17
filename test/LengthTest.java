import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {

    @Test
    public void testMultiply() throws Exception {
        Length firstValue = new Length(2, "m");
        Length secondValue = new Length(2, "m");
        Length expected = new Length(4, "mxm");
        assertEquals(expected, firstValue.multiply(secondValue));
    }

    @Test
    public void testMultiplyWithInt() throws Exception {
        Length firstValue = new Length(2, "m");
        int secondValue = 2;
        Length expected = new Length(4, "m");
        assertEquals(expected, firstValue.multiply(secondValue));
    }

    @Test
    public void testEquals() throws Exception {
        Length firstValue = new Length(2, "m");
        Length secondValue = new Length(2, "m");
        assertEquals(firstValue, secondValue);
    }
}