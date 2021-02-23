package rand;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Random randomNumber = new Random(); // this is now a random number generator
        // an Array to hold the generated random value counts
        int[] frequency = new int[6];
        // roll the die!!
        for(int roll = 1; roll<6000000; roll++){
            ++frequency[randomNumber.nextInt(6)]; // random int between 0-5 inclusive
        }

        // see the frequency results
        System.out.printf("%s%10s\n", "Face", "Frequency");
        for (int face = 0; face<frequency.length; face++){
            System.out.printf("%4d%10d\n", face+1, frequency[face]);
            /* 
            if( face == 4){
                 break;
            }
            */
            // int myint = (int) 3.456; // cast as an integer
        }
    }
}
