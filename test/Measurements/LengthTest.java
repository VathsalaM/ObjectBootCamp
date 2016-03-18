package Measurements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void ShouldCompareTwoSameUnitLengths() throws Exception {
        Length feet = new Length(Units.FEET, 1);
        Length otherFeet = new Length(Units.FEET, 1);
        assertTrue(feet.equals(otherFeet));
    }
    @Test
    public void ShouldCompareFeetWithInches() throws Exception {
        Length feet = new Length(Units.FEET, 1);
        Length inch = new Length(Units.INCH, 12);
        assertTrue(feet.equals(inch));
    }
    @Test
    public void ShouldCompareInchesWithCM() throws Exception {
        Length cm = new Length(Units.CM, 30);
        Length inch = new Length(Units.INCH, 12);
        assertTrue(inch.equals(cm));
    }
    @Test
    public void ShouldCompareCMWithMM() throws Exception {
        Length cm = new Length(Units.CM, 30);
        Length mm = new Length(Units.MM, 300);
        assertTrue(cm.equals(mm));
    }
    @Test
    public void ShouldCompareMMWithCM() throws Exception {
        Length cm = new Length(Units.CM, 1);
        Length mm = new Length(Units.MM, 10);
        assertTrue(cm.equals(mm));
    }

    @Test
    public void ShouldAddTwoSameUnits() throws Exception {
        Length cm = new Length(Units.CM, 1);
        Length othercm = new Length(Units.CM, 1);
        Length expectedLength = new Length(Units.CM, 2);
        Length actualLength = cm.add(othercm);
        assertTrue(expectedLength.equals(actualLength));
    }
}