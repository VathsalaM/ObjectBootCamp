package wizard.summary;

import wizard.ball.Ball;

import java.util.ArrayList;

public interface Summarizer {
    Summary getSummary(ArrayList<Ball> balls);
}
