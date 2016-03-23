//import Length.Feet;
//import Measurements.Inch;
//import org.junit.Test;
//
//import static org.junit.Assert.assertTrue;
//
//public class InchTest {
//    @Test
//    public void ShouldConvertInchesIntoFeets() throws Exception {
//        Inch INCH = new Inch(12);
//        Feet actualFeet = INCH.convertToFeet();
//        Feet expectedFeet = new Feet(1);
//        assertEquals(expectedFeet,actualFeet);
//    }
//
//    @Test
//    public void ShouldCompareWithSpecifiedFeet() throws Exception {
//        Inch INCH = new Inch(1);
//        Inch otherInch = new Inch(1);
//        assertTrue(INCH.equals(otherInch));
//    }
//
//    @Test
//    public void ShouldCompareWithSpecifiedInches() throws Exception {
//        Inch INCH = new Inch(12);
//        Feet FEET = new Feet(1);
//        assertTrue(INCH.equals(FEET));
//    }
//
//}