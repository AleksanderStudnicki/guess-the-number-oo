package app.studnicki.gtn.GuessGame;

import java.util.concurrent.ThreadLocalRandom;

public abstract class GuessGame {
    protected Number startValue;
    protected Number endValue;
    protected Number drawnValue;
    protected Integer amountOfTries;
    protected Integer triesLeft;

    protected ThreadLocalRandom random = ThreadLocalRandom.current();

    protected GuessGame(Number startValue, Number endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
        drawnValue = drawTheValue();
        amountOfTries = calculateAmountOfTries();
        triesLeft = amountOfTries;
    }

    public void play() {
        for (int i = 0; i < amountOfTries; i++) {
            System.out.println(Messages.tries + triesLeft);
            Number choice = getValueFromInput();
            if (checkValue(choice)) {
                System.out.println(Messages.won);
                break;
            } else {
                showComparisionMessage(choice);
            }
            triesLeft--;
        }
        if(triesLeft == 0){
            System.out.println(Messages.sorry);
        }
    }

    abstract void showComparisionMessage(Number choice);

    abstract Integer calculateAmountOfTries();

    abstract Number drawTheValue();

    abstract boolean checkValue(Number choice);

    abstract Number getValueFromInput();
}
