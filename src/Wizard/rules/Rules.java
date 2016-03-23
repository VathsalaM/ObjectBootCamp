package wizard.rules;

import wizard.ReadOnlyBalls;
import wizard.ball.Ball;

import java.util.ArrayList;

public class Rules{

    private ArrayList<Rule> rulesList = new ArrayList<>();

    public void add(Rule rule){
        rulesList.add(rule);
    }

    public boolean isValid(ReadOnlyBalls readOnlyBalls, Ball newBall) {
        for (Rule rule : rulesList) {
            if(rule.check(readOnlyBalls,newBall))
                return true;
        }
        return false;
    }
}
