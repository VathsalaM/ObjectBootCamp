package wizard.bag;

import Exceptions.LimitExceedExcetion;
import Exceptions.PlacementRuleViolationException;
import wizard.ReadOnlyBalls;
import wizard.ball.Ball;
import wizard.ball.Balls;
import wizard.rules.Rules;
import wizard.summary.Summarizer;
import wizard.summary.Summary;

/*
    Job of class :
        contains balls
        puts balls into container according to the rules
        represents the summary of total balls
 */

public class Bag {
    private Rules rules;
    private Balls balls = new Balls();
    private int max;
    private int size = 0;

    public Bag(int max,Rules rules) {
        this.max = max;
        this.rules = rules;
    }

    public boolean put(Ball newBall) throws PlacementRuleViolationException, LimitExceedExcetion {
        if(size==max)
            throw new LimitExceedExcetion();
        ReadOnlyBalls readOnlyBalls = new ReadOnlyBalls(balls);
        if(rules.isValid(readOnlyBalls,newBall)){
            size++;
            balls.add(newBall);
            return true;
        }
        throw new PlacementRuleViolationException();
    }

    public Summary getSummary(Summarizer summarizer) {
        return balls.summarize(summarizer);
    }
}