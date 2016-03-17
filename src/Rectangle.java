/*
Data related to rectangle -
- Contains length and breadth

Job of rectangle -
- calculate area, perimeter
 */

public class Rectangle implements Shape {
    private final Measurement length;
    private final Measurement width;

    public Rectangle(Measurement length, Measurement width) {

        this.length = length;
        this.width = width;
    }

    @Override
    public Measurement calculateArea() {
        return (length.multiply(width));
    }

    @Override
    public Measurement calculatePerimeter() {
        Measurement sum = (length.add(width));
        return sum.multiply(2);
    }
}
