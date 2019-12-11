package app.studnicki.gtn.GuessGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerGuessGame extends GuessGame {

    public IntegerGuessGame(Number startValue, Number endValue) {
        super(startValue, endValue);
    }

    @Override
    protected void showComparisionMessage(Number choice) {
        if (choice.intValue() > drawnValue.intValue()) {
            System.out.println(Messages.th);
        } else if (choice.intValue() < drawnValue.intValue()) {
            System.out.println(Messages.tl);
        }
    }

    @Override
    Integer calculateAmountOfTries() {
        return (int) Math.floor((endValue.intValue() - startValue.intValue() + 1) * 0.5);
    }

    @Override
    Number drawTheValue() {
        return random.nextInt(startValue.intValue(), endValue.intValue() + 1);
    }

    @Override
    boolean checkValue(Number choice) {
        return choice.intValue() == drawnValue.intValue();
    }

    @Override
    Number getValueFromInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = scanner.nextInt();
            if (choice < startValue.intValue() || choice > endValue.intValue()) {
                System.out.println("Value is not in range, try again!");
                return getValueFromInput();
            } else {
                return choice;
            }
        } catch (InputMismatchException ex) {
            System.err.println("Wrong integer value!");
            return getValueFromInput();
        }
    }

    @Override
    boolean reversed(Number startValue, Number endValue) {
        return startValue.intValue() > endValue.intValue();
    }


}
