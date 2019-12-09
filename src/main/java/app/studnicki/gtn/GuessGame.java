package app.studnicki.gtn;

public class GuessGame {
    private Range range;

    public GuessGame(Range range) {
        this.range = range;
    }

    public Range getRange() {
        return range;
    }

    public Integer getAmountOfTries() {
        return (int) Math.floor((range.getEndValue() - range.getStartValue() + 1) * 0.05);
    }

}
