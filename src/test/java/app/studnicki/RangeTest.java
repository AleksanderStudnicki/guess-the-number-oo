package app.studnicki;

import app.studnicki.gtn.Range;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RangeTest {

    @Test
    public void properlySetStartAndEndValueOfRange(){
        Range range = new Range(10, 100);

        Assert.assertEquals(range.getStartValue(), Integer.valueOf(10));
        Assert.assertEquals(range.getEndValue(), Integer.valueOf(100));
    }
}
