//package Object;
//
///*
//        Job of square is same as its parent(Rectangle)
// */
//
//public class Square extends Rectangle{
//    protected Square(Measurements length, Measurements width) {
//        super(length, width);
//    }
//
//    public static Square create(Measurements length) throws Object.NonPositiveValueException {
//        if(length.isPositive())
//            return new Square(length,length);
//        throw new Object.NonPositiveValueException(length.toString());
//    }
//
//
//}
