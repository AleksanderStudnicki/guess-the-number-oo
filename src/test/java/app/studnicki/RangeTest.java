package app.studnicki;

import app.studnicki.gtn.Range;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RangeTest {

    private Range range;

    @BeforeClass
    public void setUp() {
        range = new Range(10, 100);
    }

    @Test
    public void properlySetStartAndEndValueOfRange() {
        assertEquals(range.getStartValue(), Integer.valueOf(10));
        assertEquals(range.getEndValue(), Integer.valueOf(100));
    }

    @Test
    public void drawnRandomNumberInRange() {
        Integer random = range.getRandom();

        assertTrue(random >= range.getStartValue());
        assertTrue(random <= range.getEndValue());
    }

    @Test
    public void endValueMustBeEqualsOrHigherThanStartValueEvenWhenStartValueIsHigherInConstructor(){
        Range anotherRange = new Range(20, 10);

        assertTrue(anotherRange.getEndValue() > anotherRange.getStartValue());
    }
}
