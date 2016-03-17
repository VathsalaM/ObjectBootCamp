public class InvalidProbabilityException extends Throwable {
    public InvalidProbabilityException() {
        super("Expected the value to be greater than zero and less than one");
    }
}
