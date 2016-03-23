package wizard.rules;

import wizard.ReadOnlyBalls;
import wizard.ball.Ball;
import wizard.ball.ColourOfBalls;

public class RuleForGreenBall implements Rule {
    @Override
    public boolean check(ReadOnlyBalls readOnlyBalls, Ball newBall) {
        return newBall.isSameColour(ColourOfBalls.GREEN) && readOnlyBalls.getNoOfBalls(ColourOfBalls.GREEN) < 3;
    }
}
