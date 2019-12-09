package app.studnicki;

import app.studnicki.gtn.GuessGame;
import app.studnicki.gtn.Range;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GuessGameTest {

    GuessGame guessGame;

    @BeforeClass
    public void setUp() {
        System.out.println("Setting up GuessGame...");
        guessGame = new GuessGame(new Range(10, 100));
        System.out.println("GuessGame set up");
    }

    @Test
    public void getProperRange() {
        Assert.assertEquals(guessGame.getRange(), new Range(10, 100));
    }

    @Test
    public void checkNotEquals() {
        Assert.assertNotEquals(guessGame.getRange(), new Range(20, 250));
    }

    @Test
    public void amountOfTriesShouldBeEqual4(){
        Assert.assertEquals(guessGame.getAmountOfTries(), Integer.valueOf(4));
    }

    @Test
    public void amountOfTriesShouldBeEqual5(){
        GuessGame anotherGuessGame = new GuessGame(new Range(1, 100));

        Assert.assertEquals(anotherGuessGame.getAmountOfTries(), Integer.valueOf(5));
    }
}
