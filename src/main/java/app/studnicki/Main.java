package app.studnicki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GuessGame game = GameInitializer.init();
        game.play();
    }
}
