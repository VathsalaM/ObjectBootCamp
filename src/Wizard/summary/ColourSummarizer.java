package wizard.summary;

import wizard.ball.Ball;
import wizard.ball.ColourOfBalls;

import java.util.ArrayList;
import java.util.HashMap;

public class ColourSummarizer implements Summarizer {

    @Override
    public Summary getSummary(ArrayList<Ball> balls) {
        HashMap<ColourOfBalls, Integer> summary = new HashMap<>();
        for (Ball ball : balls) {
            ColourOfBalls colour = ball.getColour();
            Integer value = summary.get(colour);
            if(value!=null)
            summary.put(colour,value+1);
        }
        return new Summary(summary);
    }
}
