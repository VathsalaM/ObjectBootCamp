/*
        Add the values of other length and return length

        Multiply the value with other length or number

        check for the positivity of value

 */

public class Length {

    private final double value;
    private final String unit;

    public Length(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public Length multiply(Length other) {
        return new Length(this.value*other.value,this.unit+"x"+other.unit);
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
        if (value != that.value) return false;
        return unit != null ? unit.equals(that.unit) : that.unit == null;
    }

    public boolean isPositive() {
        return value>0;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
