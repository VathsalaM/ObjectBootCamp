package wizard.rules;

import wizard.ReadOnlyBalls;
import wizard.ball.Ball;
import wizard.ball.ColourOfBalls;

public class RuleForRedBall implements Rule {
    @Override
    public boolean check(ReadOnlyBalls readOnlyBalls, Ball newBall) {
        int noOfBalls = readOnlyBalls.getNoOfBalls(ColourOfBalls.GREEN);
        int max =  2*((noOfBalls<=1)?0:noOfBalls)-1;
        return newBall.isSameColour(ColourOfBalls.RED) && readOnlyBalls.getNoOfBalls(ColourOfBalls.RED) < max;
    }
}
