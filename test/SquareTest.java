import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void square_area_is_the_square_of_its_side() throws Exception, NonPositiveValueException {
        Square square = Square.create(new Length(5,"m") );
        Assert.assertEquals(new Length(25,"mxm"),square.calculateArea());
    }
    @Test
    public void square_perimeter_is_four_times_of_its_side() throws Exception, NonPositiveValueException {
        Square square = Square.create(new Length(5,"m") );
        Assert.assertEquals(new Length(20,"m"),square.calculatePerimeter());
    }

    @Test
    public void square_throws_NonPositiveValueException_when_the_value_is_negative() throws Exception, NonPositiveValueException {
        thrown.expectMessage("Expected the value to be greater than zero . But found :-1");
        Square square = Square.create(new Length(-1,"m") );
    }
    @Test
    public void square_throws_NonPositiveValueException_when_the_value_is_zero() throws Exception, NonPositiveValueException {
        thrown.expectMessage("Expected the value to be greater than zero . But found :0");
        Square square = Square.create(new Length(0,"m") );
    }

}
