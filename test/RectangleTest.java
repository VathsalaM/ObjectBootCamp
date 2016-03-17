import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void area_should_return_area_of_rectangle() throws Exception {
        Rectangle rectangle= new Rectangle(new Length(3,"m"), new Length(4, "m"));
        Length expected = new Length(12, "mxm");
        assertEquals(expected, rectangle.calculateArea());
    }

    @Test
    public void perimeter_should_return_perimeter_of_rectangle() throws Exception {
        Rectangle rectangle= new Rectangle(new Length(3,"m"), new Length(4, "m"));
        Length expected = new Length(14, "m");
        assertEquals(expected, rectangle.calculatePerimeter());
    }
}