import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void area_should_return_area_of_rectangle() throws Exception {
        Rectangle rectangle= Rectangle.create(new Length(3,"m"), new Length(4, "m"));
        Length expected = new Length(12, "mxm");
        assertEquals(expected, rectangle.calculateArea());
    }

    @Test
    public void perimeter_should_return_perimeter_of_rectangle() throws Exception {
        Rectangle rectangle= Rectangle.create(new Length(3,"m"), new Length(4, "m"));
        Length expected = new Length(14, "m");
        assertEquals(expected, rectangle.calculatePerimeter());
    }

    @Test(expected = RuntimeException.class)
    public void rectangle_is_created_only_if_the_length_and_width_are_positive_values() throws Exception {
        Rectangle rectangle = Rectangle.create(new Length(0,"m"),new Length(0,"m"));

    }
}