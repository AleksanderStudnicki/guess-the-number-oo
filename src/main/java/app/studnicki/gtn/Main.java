package app.studnicki.gtn;

import app.studnicki.gtn.GuessGame.GuessGame;

public class Main {
    public static void main(String[] args){
        GuessGame guessGame = GuessGameInitializer.init();
        if(guessGame != null){
            guessGame.play();
        }
    }
}
