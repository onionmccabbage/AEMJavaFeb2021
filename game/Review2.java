package game;
import java.util.Scanner;

public class Review2 {
    public static void main(String[] args) {
        GameEngine game = new GameEngine(100); // alter this number to change range of guesses
        int numTries = 10;

        System.out.printf("\nYou have %d attempts to guess the number between 0 and %d\n", numTries, game.gameRange);  // printf is print with formatting
        Scanner input = new Scanner( System.in ); // we instantiate a copy of the Scanner class
        // loop ten times for the guesses
        for(int i=10; i>0; i--){
            System.out.printf("Guess %d: ", i);
            int guess = input.nextInt();
            // correct?
            if (guess == game.getSecretNumber()){
                System.out.printf("Correct, the number was %d\n", guess);
                break;
            }
            // clue?
            else if(guess == -1){
                System.out.printf("Hint: the number is %s\n", game.oddOrEven);
            }
            // quit?
            else if(guess == -2){
                System.out.printf("The number was %d\n", game.getSecretNumber());
                break;
            }
            // new game?
            else if ( guess == -3){
                System.out.printf("The number was %d and we'll start a new game\n", game.getSecretNumber()); 
                game = new GameEngine(100);
                i = 11;
            }
            // out of range?
            else if ( guess < -3 || guess > game.gameRange){
                System.out.printf("That's a wasted guess - the number is between 0 and %d\n", game.gameRange);
            }
            // too low?
            else if(guess < game.getSecretNumber() ){
                System.out.println("Too low");
            }
            // too high?
            else if(guess > game.getSecretNumber() ){
                System.out.println("Too high");
            }
        }

        // clean up
        input.close();
    }
}
