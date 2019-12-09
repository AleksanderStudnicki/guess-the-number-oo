package app.studnicki;

import app.studnicki.gtn.GuessGame;
import app.studnicki.gtn.Range;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuessGameTest {

    @Test
    public void createGuessGameAndGetProperRange(){
        GuessGame guessGame = new GuessGame(new Range(10, 100));

        Assert.assertEquals(guessGame.range, new Range(10, 100));
    }
}
