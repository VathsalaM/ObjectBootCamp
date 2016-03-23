//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//public class LengthTest {
//
//    @Test
//    public void testMultiply() throws Exception {
//        Measurements firstValue = new Measurements(2, new Unit("m"));
//        Measurements secondValue = new Measurements(2,new Unit("m"));
//        Measurements expected = new Measurements(4,new Unit("m²"));
//        assertTrue(expected.equals(firstValue.multiply(secondValue)));
//    }
//
//    @Test
//    public void testMultiplyWithInt() throws Exception {
//        Measurements firstValue = new Measurements(2,new Unit("m"));
//        int secondValue = 2;
//        Measurements expected = new Measurements(4,new Unit("m"));
//        assertEquals(expected, firstValue.multiply(secondValue));
//    }
//
//    @Test
//    public void testEquals() throws Exception {
//        Measurements firstValue = new Measurements(2,new Unit("m"));
//        Measurements secondValue = new Measurements(2,new Unit("m"));
//        assertEquals(firstValue, secondValue);
//    }
//}