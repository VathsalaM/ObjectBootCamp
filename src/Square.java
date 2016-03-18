/*
        Job of square is same as its parent(Rectangle)
 */

public class Square extends Rectangle{
    protected Square(Length length, Length width) {
        super(length, width);
    }

    public static Square create(Length length) throws NonPositiveValueException {
        if(length.isPositive())
            return new Square(length,length);
        throw new NonPositiveValueException(length.toString());
    }


}
