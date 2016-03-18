import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LengthTest {

    @Test
    public void testMultiply() throws Exception {
        Length firstValue = new Length(2, new Unit("m"));
        Length secondValue = new Length(2,new Unit("m"));
        Length expected = new Length(4,new Unit("m²"));
        assertTrue(expected.equals(firstValue.multiply(secondValue)));
    }

    @Test
    public void testMultiplyWithInt() throws Exception {
        Length firstValue = new Length(2,new Unit("m"));
        int secondValue = 2;
        Length expected = new Length(4,new Unit("m"));
        assertEquals(expected, firstValue.multiply(secondValue));
    }

    @Test
    public void testEquals() throws Exception {
        Length firstValue = new Length(2,new Unit("m"));
        Length secondValue = new Length(2,new Unit("m"));
        assertEquals(firstValue, secondValue);
    }
}