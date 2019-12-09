package app.studnicki;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessGame {
    private Integer startRange = 1;
    private Integer endRange = 100;
    private Integer drawnValue;

    public GuessGame() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        drawnValue = random.nextInt(startRange, endRange);
    }

    public GuessGame(Integer startRange, Integer endRange) {
        if (startRange > endRange) {
            this.startRange = endRange;
            this.endRange = startRange;
        } else {
            this.endRange = endRange;
            this.startRange = startRange;
        }

        ThreadLocalRandom random = ThreadLocalRandom.current();
        drawnValue = random.nextInt(startRange, endRange);
    }


    public void play() {
        System.out.println("Choose the the number from range (" + startRange + " - " + endRange + ") [exit: -1]: ");
        Scanner scanner = new Scanner(System.in);
        try {
            Integer choice = scanner.nextInt();
            if (choice.equals(drawnValue)) {
                System.out.println("Congratulations! You win!");
            } else if(!choice.equals(-1)) {
                if (choice > drawnValue) {
                    System.out.println("Too high");

                } else {
                    System.out.println("Too low");
                }
                play();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Wrong integer format!");
            play();
        }
    }
}
