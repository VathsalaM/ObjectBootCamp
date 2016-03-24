package wizard;

import Exceptions.LimitExceedExcetion;
import Exceptions.PlacementRuleViolationException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import wizard.bag.Bag;
import wizard.ball.Ball;
import wizard.ball.ColourOfBalls;
import wizard.rules.*;
import wizard.summary.ColourSummarizer;
import wizard.summary.Summarizer;
import wizard.summary.Summary;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void Should_put_a_ball_into_the_bag() throws LimitExceedExcetion, PlacementRuleViolationException {
        Rules rules = new Rules();
        rules.add(new RuleForGreenBall());
        Bag bag = new Bag(12,rules);
        assertTrue(bag.put(new Ball(ColourOfBalls.GREEN)));
    }

    @Test
    public void Should_not_allow_to_add_more_than_three_green_balls() throws LimitExceedExcetion, PlacementRuleViolationException {
        Rules rules = new Rules();
        rules.add(new RuleForGreenBall());
        Bag bag = new Bag(12,rules);
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.GREEN));
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.GREEN));
    }

    @Test
    public void Should_not_allow_to_add_number_of_red_balls_which_is_greater_than_double_of_green_balls() throws LimitExceedExcetion, PlacementRuleViolationException {
        Rules rules = new Rules();
        rules.add(new RuleForGreenBall());
        rules.add(new RuleForRedBall());
        Bag bag = new Bag(12,rules);
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
        Rules rules = new Rules();
        rules.add(new RuleForRedBall());
        Bag bag = new Bag(12,rules);
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.RED));
    }

    @Test
    public void Should_not_add_red_ball_when_there_is_single_green_ball() throws LimitExceedExcetion, PlacementRuleViolationException {
        Rules rules = new Rules();
        rules.add(new RuleForGreenBall());
        rules.add(new RuleForRedBall());
        Bag bag = new Bag(12,rules);
        bag.put(new Ball(ColourOfBalls.GREEN));
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.RED));
    }

    @Test
    public void Should_add_blue_balls_when_there_is_space_in_bag() throws LimitExceedExcetion, PlacementRuleViolationException {
        Rules rules = new Rules();
        rules.add(new RuleForBlueBall());
        Bag bag = new Bag(12,rules);
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
        thrown.expect(LimitExceedExcetion.class);
        thrown.expectMessage("Size exceeded");
        bag.put(new Ball(ColourOfBalls.BLUE));
    }

    @Test
    public void Should_not_add_yellow_ball_when_the_bag_is_empty() throws PlacementRuleViolationException, LimitExceedExcetion {
        Rules rules = new Rules();
        rules.add(new RuleForYellowBall());
        Bag bag = new Bag(12,rules);
        thrown.expect(PlacementRuleViolationException.class);
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.YELLOW));
    }

    @Test
    public void Should_not_add_yellow_ball_when_there_is_only_one_ball_in_bag() throws PlacementRuleViolationException, LimitExceedExcetion {
        Rules rules = new Rules();
        rules.add(new RuleForGreenBall());
        rules.add(new RuleForYellowBall());
        Bag bag = new Bag(12,rules);
        bag.put(new Ball(ColourOfBalls.GREEN));
        thrown.expect(PlacementRuleViolationException.class);
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.YELLOW));
    }

    @Test
    public void Should_not_add_yellow_ball_when_there_is_only_two_balls_in_bag() throws PlacementRuleViolationException, LimitExceedExcetion {
        Rules rules = new Rules();
        rules.add(new RuleForGreenBall());
        rules.add(new RuleForYellowBall());
        Bag bag = new Bag(12,rules);
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.YELLOW));
    }

    @Test
    public void Should_add_one_yellow_ball_when_there_are_three_balls_in_bag() throws PlacementRuleViolationException, LimitExceedExcetion {
        Rules rules = new Rules();
        rules.add(new RuleForGreenBall());
        rules.add(new RuleForYellowBall());
        Bag bag = new Bag(12,rules);
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.YELLOW));
        thrown.expect(PlacementRuleViolationException.class);
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.YELLOW));
    }

    @Test
    public void Should_add_yellow_ball_when_there_are_seven_balls_in_bag() throws PlacementRuleViolationException, LimitExceedExcetion {
        Rules rules = new Rules();
        rules.add(new RuleForGreenBall());
        rules.add(new RuleForYellowBall());
        rules.add(new RuleForBlueBall());
        Bag bag = new Bag(12,rules);
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.YELLOW));
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.BLUE));
        bag.put(new Ball(ColourOfBalls.YELLOW));
        bag.put(new Ball(ColourOfBalls.YELLOW));
        bag.put(new Ball(ColourOfBalls.YELLOW));
        thrown.expect(PlacementRuleViolationException.class);
        thrown.expectMessage("Placement rule violated");
        bag.put(new Ball(ColourOfBalls.YELLOW));
    }

    @Test
    public void Should_give_summary_of_balls() throws PlacementRuleViolationException, LimitExceedExcetion {
        Rules rules = new Rules();
        rules.add(new RuleForGreenBall());
        Bag bag = new Bag(12,rules);
        bag.put(new Ball(ColourOfBalls.GREEN));
        bag.put(new Ball(ColourOfBalls.GREEN));
        Summarizer summarizer = new ColourSummarizer();
        Summary summary = bag.getSummary(summarizer);
        HashMap<ColourOfBalls,Integer> expectedSummaryList = new HashMap<>();
        expectedSummaryList.put(ColourOfBalls.GREEN,2);
        Summary expectedSummary = new Summary(expectedSummaryList);
        assertEquals(expectedSummary,summary);
//        String expected = "Bag : 2 Balls \n2G";
//        assertEquals(expected, summary.toString());
    }

//    @Test
//    public void Should_give_summary_of_five_different_balls() throws PlacementRuleViolationException, LimitExceedExcetion {
//        Bag bag = new Bag();
//        bag.put(new Ball(ColourOfBalls.GREEN));
//        bag.put(new Ball(ColourOfBalls.GREEN));
//        bag.put(new Ball(ColourOfBalls.RED));
//        bag.put(new Ball(ColourOfBalls.BLUE));
//        bag.put(new Ball(ColourOfBalls.BLUE));
//        bag.put(new Ball(ColourOfBalls.BLUE));
//        bag.put(new Ball(ColourOfBalls.GREEN));
//        String summary = bag.getSummary();
//        String expected = "Bag : 7 Balls \n2G, 1R, 3B, 1G";
//        assertEquals(expected, summary);
//    }
}