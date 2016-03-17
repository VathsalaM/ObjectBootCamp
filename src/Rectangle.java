/*
    Data related to rectangle -
        - Contains length and breadth

    Job of rectangle -
        - calculate area, perimeter
 */

public class Rectangle {
    private final Length length;
    private final Length width;

    public static Rectangle create(Length length, Length width) throws NonPositiveValueException {
        if(!length.isPositive())
            throw new NonPositiveValueException(length.toString());
        if(!width.isPositive())
            throw new NonPositiveValueException(width.toString());
        return new Rectangle(length,width);
    }

    protected Rectangle(Length length, Length width) {
        this.length = length;
        this.width = width;
    }

    public Length calculateArea() {
        return (length.multiply(width));
    }

    public Length calculatePerimeter() {
        Length sum = (length.add(width));
        return sum.multiply(2);
    }
}
