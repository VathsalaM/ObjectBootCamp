/*
        Add the values of other length and return length

        Multiply the value with other length or number

        check for the positivity of value

 */

public class Length {

    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Length multiply(Length other) {
        return new Length(this.value*other.value,this.unit.multiply(other.unit));
    }
    public Length multiply(int other) {
        return new Length(this.value*other,this.unit);
    }

    public Length add(Length other) {
        return new Length(this.value+other.value,this.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return value == that.value && (unit != null ? unit.equals(that.unit) : that.unit == null);
    }

    public boolean isPositive() {
        return value>0;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
