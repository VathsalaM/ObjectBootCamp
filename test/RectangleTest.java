import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void area_should_return_area_of_rectangle() throws Exception {
        Rectangle rectangle= new Rectangle(new Measurement(3,"m"), new Measurement(4, "m"));
        Measurement expected = new Measurement(12, "mxm");
        assertEquals(expected, rectangle.calculateArea());
    }

    @Test
    public void perimeter_should_return_perimeter_of_rectangle() throws Exception {
        Rectangle rectangle= new Rectangle(new Measurement(3,"m"), new Measurement(4, "m"));
        Measurement expected = new Measurement(14, "m");
        assertEquals(expected, rectangle.calculatePerimeter());
    }
}