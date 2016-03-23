package wizard.ball;

import java.util.ArrayList;

public class Balls {
    private ArrayList<Ball> balls = new ArrayList<>();
    public void add(Ball newBall) {
        balls.add(newBall);
    }

    public int getNoOfBalls(ColourOfBalls colour) {
        int count = 0;
        for (Ball ball : balls) {
            if(ball.isSameColour(colour))
                count++;
        }
        return count;
    }

    public int size() {
        return balls.size();
    }
}
