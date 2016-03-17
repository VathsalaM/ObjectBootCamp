/*
Data related to rectangle -
- Contains length and breadth

Job of rectangle -
- calculate area, perimeter
 */

public class Rectangle implements Shape {
    private final Length length;
    private final Length width;

    public Rectangle(Length length, Length width) {

        this.length = length;
        this.width = width;
    }

    @Override
    public Length calculateArea() {
        return (length.multiply(width));
    }

    @Override
    public Length calculatePerimeter() {
        Length sum = (length.add(width));
        return sum.multiply(2);
    }
}
