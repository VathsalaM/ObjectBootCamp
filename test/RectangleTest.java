import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void area_should_return_area_of_rectangle() throws NonPositiveValueException {
        Rectangle rectangle= Rectangle.create(new Length(3,new Unit("m")), new Length(4, new Unit("m")));
        Length expected = new Length(12, new Unit("m²"));
        assertEquals(expected, rectangle.calculateArea());
    }

    @Test
    public void perimeter_should_return_perimeter_of_rectangle() throws NonPositiveValueException {
        Rectangle rectangle= Rectangle.create(new Length(3,new Unit("m")), new Length(4, new Unit("m")));
        Length expected = new Length(14, new Unit("m"));
        assertEquals(expected, rectangle.calculatePerimeter());
    }

    @Test
    public void rectangle_throws_an_NonPositiveValueException_when_the_value_is_negative() throws NonPositiveValueException {
        thrown.expectMessage("Expected the value to be greater than zero . But found :-1");
        thrown.expect(NonPositiveValueException.class);
        Rectangle rectangle = Rectangle.create(new Length(5,new Unit("m")),new Length(-1,new Unit("m")));
    }
    @Test
    public void rectangle_throws_an_NonPositiveValueException_when_the_value_is_zero() throws NonPositiveValueException {
        thrown.expectMessage("Expected the value to be greater than zero . But found :0");
        thrown.expect(NonPositiveValueException.class);
        Rectangle rectangle = Rectangle.create(new Length(5,new Unit("m")),new Length(0,new Unit("m")));
    }

}