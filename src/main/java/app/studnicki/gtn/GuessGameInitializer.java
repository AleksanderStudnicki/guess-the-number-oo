package app.studnicki.gtn;

import app.studnicki.gtn.GuessGame.GuessGame;
import app.studnicki.gtn.GuessGame.IntegerGuessGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessGameInitializer {
    public static GuessGame init(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose type of game [I - Integer, E - exit]: ");

        String choice = scanner.nextLine();

        switch(choice){
            case "I":
                return createIntegerGame();
            case "E":
                return null;
            default:
                System.out.println("Wrong choice! Try again");
                return init();
        }
    }

    private static GuessGame createIntegerGame(){
        int startRange = readIntValue("Start range: ");
        int endRange = readIntValue("End range: ");
        return new IntegerGuessGame(startRange, endRange);
    }

    private static int readIntValue(String msg){
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextInt();
        } catch (InputMismatchException ex){
            System.err.println("Wrong integer value! Try again.");
            return readIntValue(msg);
        }
    }

}
