//package Object;
//
///*
//    Data related to rectangle -
//        - Contains length and breadth
//
//    Job of rectangle -
//        - calculate area, perimeter
// */
//
//public class Rectangle {
//    private final Measurements length;
//    private final Measurements width;
//
//    public static Rectangle create(Measurements length, Measurements width) throws Object.NonPositiveValueException {
//        if(!length.isPositive())
//            throw new Object.NonPositiveValueException(length.toString());
//        if(!width.isPositive())
//            throw new Object.NonPositiveValueException(width.toString());
//        return new Rectangle(length,width);
//    }
//
//    protected Rectangle(Measurements length, Measurements width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Measurements calculateArea() {
//        return (length.multiply(width));
//    }
//
//    public Measurements calculatePerimeter() {
//        Measurements sum = (length.add(width));
//        return sum.multiply(2);
//    }
//}
