/*
       Job of class :
        to perform basic operations like and,or,not
 */
public class Chance {
    private double value;

    public static Chance create(double value) throws InvalidProbabilityException {
        if(value<0 || value>1)
            throw new InvalidProbabilityException();
        return new Chance(value);
    }
    private Chance(double value) {
        this.value = value;
    }

    public Chance not() throws InvalidProbabilityException {
        return create(1-this.value);
    }

    public Chance and(Chance otherChance) throws InvalidProbabilityException {
        return create(this.value * otherChance.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance = (Chance) o;
        return Double.compare(chance.value, value) == 0;
    }
}
