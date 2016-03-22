package wizard;

public class LimitExceedExcetion extends Throwable{
    public LimitExceedExcetion() {
        super("Size exceeded ");
    }
}
