package wizard.summary;

import wizard.ball.ColourOfBalls;

import java.util.HashMap;

public class Summary {
    private HashMap<ColourOfBalls, Integer> summaryList;

    public Summary(HashMap<ColourOfBalls, Integer> summaryList) {

        this.summaryList = summaryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Summary summary = (Summary) o;

        System.out.println(summary.summaryList+"\t"+summaryList);

        return summaryList != null ? summaryList.equals(summary.summaryList) : summary.summaryList == null;

    }

}
