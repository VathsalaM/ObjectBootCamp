package wizard;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void Should_hold_maximum_of_12_balls() throws LimitExceedExcetion {
        Bag bag = Bag.create(12);
        assertFalse(bag.isMaxSizeExceeded(12));
    }
    @Test
    public void Should_throw_exception_if_the_size_exceeds() throws LimitExceedExcetion {
        thrown.expectMessage("Size exceeded ");
        Bag bag = Bag.create(13);
    }

    @Test
    public void Should_put_a_ball_into_the_bag() throws LimitExceedExcetion, PlacementRuleViolationException {
        Bag bag = Bag.create(12);
        assertTrue(bag.put(new Ball(ColourOfBalls.GREEN)));
    }
    @Test
    public void Should_not_allow_to_add_more_than_three_green_balls() throws LimitExceedExcetion, PlacementRuleViolationException {
        Bag bag = Bag.create(12);
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.GREEN));
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.GREEN));
    }

    @Test
    public void Should_not_allow_to_add_number_of_red_balls_which_is_greater_than_double_of_green_balls() throws LimitExceedExcetion, PlacementRuleViolationException {
        Bag bag = Bag.create(12);
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.RED));
        bag.put(new Ball(ColourOfBalls.RED));
        bag.put(new Ball(ColourOfBalls.RED));
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.RED));
    }

    @Test
    public void Should_not_add_red_ball_when_green_ball_is_not_present() throws LimitExceedExcetion, PlacementRuleViolationException {
        Bag bag = Bag.create(12);
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.RED));
    }
    @Test
    public void Should_not_add_red_ball_when_there_is_single_green_ball() throws LimitExceedExcetion, PlacementRuleViolationException {
        Bag bag = Bag.create(12);
        bag.put(new Ball(ColourOfBalls.GREEN));
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.RED));
    }
    @Test
    public void Should_add_blue_balls_when_there_is_space_in_bag() throws LimitExceedExcetion, PlacementRuleViolationException {
        Bag bag = Bag.create(12);
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.BLUE));

    }
}