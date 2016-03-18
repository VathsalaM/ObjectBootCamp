/*
        Job of class :
            to tell probability of given criteria

      As a math student , I want to represent a chance of :

        1) Getting tail when flipping a coin
        2) NOT getting tails when flipping a coin
        3) Getting tails when flipping two coins
        4) Getting at least one tails when flipping two coins

    Demorgns Law : P(A||B) = !(!P(A) && !P(B))
 */

public class ProbabilityCalculator {

    private int sampleSpace;

    public ProbabilityCalculator(int sampleSpace) {
        this.sampleSpace = sampleSpace;
    }

    public Chance getProbabilityOfOccurrence(int numberOfFavourableOccurrence) throws InvalidProbabilityException {
        return Chance.create((double) (numberOfFavourableOccurrence)/ this.sampleSpace);
    }

    public Chance getProbabilityOfNonOccurrence(int numberOfFavourableOccurrence) throws InvalidProbabilityException {
        return getProbabilityOfOccurrence(numberOfFavourableOccurrence).not();
    }

    public Chance getProbabilityOfAtLeastOneOccurrence(int numberOfFaces) throws InvalidProbabilityException {
        Chance probabilityOfFirstCoin = getProbabilityOfOccurrence(sampleSpace/numberOfFaces);
        Chance probabilityOfSecondCoin = getProbabilityOfOccurrence(sampleSpace/numberOfFaces);
        Chance notOfFirstCoinProbability = probabilityOfFirstCoin.not();
        Chance notOfSecondCoinProbability = probabilityOfSecondCoin.not();
        Chance probabilityOfNonOccurence = notOfFirstCoinProbability.and(notOfSecondCoinProbability);
        return probabilityOfNonOccurence.not();

    }
}
