/*
    Data related to rectangle -
        - Contains length and breadth

    Job of rectangle -
        - calculate area, perimeter
 */

public class Rectangle {
    private final Length length;
    private final Length width;

    public static Rectangle create(Length length, Length width){
        if(length.isPositive() && width.isPositive() )
            return new Rectangle(length,width);
        throw new RuntimeException("Only positive values allowed");
    }

    private Rectangle(Length length, Length width) {
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
