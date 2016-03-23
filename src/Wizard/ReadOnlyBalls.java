package wizard;

import wizard.ball.Balls;
import wizard.ball.ColourOfBalls;

public class ReadOnlyBalls extends Balls{
    private Balls balls;

    public ReadOnlyBalls(Balls balls) {
        this.balls = balls;
    }

    public int getNoOfBalls(ColourOfBalls colour) {
        return balls.getNoOfBalls(colour);
    }

    public int size() {
        return balls.size();
    }
}
