package wizard;

/*
    Job :
        to keep track of the currentSize
        increment currentSize accordingly
        check if the currentSize has reached its maximumValue
 */
public class Size {
    private final int maxSize;
    private int currentSize = 0;

    public Size(int maxSize) {
        this.maxSize = maxSize;
    }

    public void increment() {
        currentSize++;
    }

    public boolean check() {
        return currentSize < maxSize;
    }
}
