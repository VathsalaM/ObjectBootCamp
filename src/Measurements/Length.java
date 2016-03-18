/*
        Job of the class :
            compare different units
 */

package Measurements;

public class Length {
    private final Units unit;
    private final double value;

    public Length(Units unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean equals(Length otherLength){
      return unit.convertTo(value) == otherLength.unit.convertTo(otherLength.value);
    }

    public Length add(Length otherLength){
        return null;
    }


}
