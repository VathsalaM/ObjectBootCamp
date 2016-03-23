package wizard.rules;

import wizard.ReadOnlyBalls;
import wizard.ball.Ball;

public interface Rule {
    boolean check(ReadOnlyBalls readOnlyBalls, Ball newBall);
}
