package game;

import java.util.Random;

public class GameEngine {
    // constructor
    public GameEngine(int range) {
        gameRange = range;
        generateSecretNumber();
    }

    // properties
    public int gameRange;
    private int secretNumber;
    public String oddOrEven = "even";

    // utility methods
    private int generateSecretNumber(){
        Random randomNumber = new Random();
        secretNumber = randomNumber.nextInt(gameRange);
        // set the clue: odd or even
        if(secretNumber/2 != (int)secretNumber/2){
            oddOrEven = "odd";
        }
        return secretNumber;
    }

    // accessor and mutator methods
    public int getSecretNumber(){
        return secretNumber;
    }
}
