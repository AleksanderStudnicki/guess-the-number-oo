package app.studnicki.gtn;

import java.util.concurrent.ThreadLocalRandom;

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

    public Integer getRandom() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return random.nextInt(startValue, endValue + 1);
    }
}
