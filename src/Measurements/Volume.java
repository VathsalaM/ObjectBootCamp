package Measurements;
public class Volume {
    private final Units unit;
    private final double value;

    public Volume(Units unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    private double convert(Units unit,double value){
        return unit.convertTo(value);
    }
    public boolean equals(Volume otherLength){
        return convert(unit,value)==convert(otherLength.unit,otherLength.value);
    }
}
