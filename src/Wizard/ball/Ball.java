package wizard.ball;

public class Ball {
    private ColourOfBalls colour;

    public Ball(ColourOfBalls colour) {
        this.colour = colour;
    }


    public boolean isSameColour(ColourOfBalls expectedColour) {
        return colour.equals(expectedColour);
    }

    public ColourOfBalls getColour() {
        return colour;
    }
}
