package Object;

public class NonPositiveValueException extends Throwable {
    public NonPositiveValueException(String value) {
        super("Expected the value to be greater than zero . But found :"+value);
    }
}
