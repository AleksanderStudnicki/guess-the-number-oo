package app.studnicki;

import app.studnicki.gtn.Range;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RangeTest {

    private Range range;

    @BeforeClass
    public void setUp() {
        System.out.println("Setting up range...");
        range = new Range(10, 100);
        System.out.println("Set up range");
    }

    @Test
    public void properlySetStartAndEndValueOfRange() {
        Assert.assertEquals(range.getStartValue(), Integer.valueOf(10));
        Assert.assertEquals(range.getEndValue(), Integer.valueOf(100));
    }

    @Test
    public void drawnRandomNumberInRange() {
        Integer random = range.getRandom();

        Assert.assertTrue(random >= range.getStartValue());
        Assert.assertTrue(random <= range.getEndValue());
    }
}
