package wizard.rules;

import wizard.ReadOnlyBalls;
import wizard.ball.Ball;
import wizard.ball.ColourOfBalls;

public class RuleForYellowBall implements Rule {
    @Override
    public boolean check(ReadOnlyBalls readOnlyBalls, Ball newBall) {
        double fortyPercent = ((double) readOnlyBalls.size()+1)*0.4;
        return newBall.isSameColour(ColourOfBalls.YELLOW) && (double)readOnlyBalls.getNoOfBalls(ColourOfBalls.YELLOW) < Math.floor(fortyPercent);
    }
}
