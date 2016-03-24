package wizard.ball;

import wizard.summary.Summarizer;
import wizard.summary.Summary;

import java.util.ArrayList;
import java.util.HashMap;

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

    public Summary summarize(Summarizer summary) {
        return summary.getSummary(balls);
    }
}
