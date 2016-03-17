import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProbabilityCalculatorTest {
    @Test
    public void getProbabilityOfOccurrence_gives_the_probability_of_getting_tail() throws Exception, InvalidProbabilityException {
        int sampleSpaceOfACoin = 2;
        int numberOfFavourableOccurrenceForTail = 1;
        ProbabilityCalculator probabilityCalculator = new ProbabilityCalculator(sampleSpaceOfACoin);
        assertTrue(Chance.create(0.5).equals(probabilityCalculator.getProbabilityOfOccurrence(numberOfFavourableOccurrenceForTail)));
    }

    @Test
    public void getProbabilityOfNonOccurrence_gives_the_probability_of_not_getting_tail() throws Exception, InvalidProbabilityException {
        int sampleSpaceOfACoin = 2;
        int numberOfFavourableOccurrenceForTail = 1;
        ProbabilityCalculator probabilityCalculator = new ProbabilityCalculator(sampleSpaceOfACoin);
        assertTrue(Chance.create(0.5).equals(probabilityCalculator.getProbabilityOfNonOccurrence(numberOfFavourableOccurrenceForTail)));
    }

    @Test
    public void getProbabilityOfOccurrence_gives_the_probability_of_getting_tails_for_two_coins() throws Exception, InvalidProbabilityException {
        int sampleSpaceOfTwoCoins = 4;
        int numberOfFavourableOccurrenceForBothTails = 1;
        ProbabilityCalculator probabilityCalculator = new ProbabilityCalculator(sampleSpaceOfTwoCoins);
        assertTrue(Chance.create(0.25).equals(probabilityCalculator.getProbabilityOfOccurrence(numberOfFavourableOccurrenceForBothTails)));
    }

    @Test
    public void getProbabilityOfAtLeastOneOccerrence_gives_the_probability_of_single_occurrence() throws Exception, InvalidProbabilityException {
        int sampleSpaceOfTwoCoins = 4;
        int numberOfFavourableOccurrenceForBothTails = 1;
        ProbabilityCalculator probabilityCalculator = new ProbabilityCalculator(sampleSpaceOfTwoCoins);
        assertTrue(Chance.create(0.75).equals(probabilityCalculator.getProbabilityOfAtLeastOneOccurrence()));
    }
}