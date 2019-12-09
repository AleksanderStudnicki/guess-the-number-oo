package app.studnicki.gtn;

public class Range {
    private Integer startValue;
    private Integer endValue;

    public Range(Integer startValue, Integer endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    public Integer getStartValue() {
        return startValue;
    }

    public Integer getEndValue() {
        return endValue;
    }
}
