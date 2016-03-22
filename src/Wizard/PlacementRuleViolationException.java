package wizard;

public class PlacementRuleViolationException extends Throwable {
    public PlacementRuleViolationException() {
        super("Placement rule violated ");
    }
}
