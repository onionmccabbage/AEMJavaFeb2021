// we need to import any required libraries
import java.util.Scanner; // this can access user input

public class MyFirstJavaProgram { // the filename MUST match the class name

    //                              square backets indicate a collection
    public static void main( String []args ) { // we MUST always declare data-types
        // print, println and printf
        System.out.println("Welcome"); // println will always terminate with a new line
        System.out.print(" to \nJava"); // print does NOT include new line
        System.out.printf("\nNumber %d says %s", 42, "Hello");  // printf is print with formatting

        // we need a scanner to get user input
        Scanner input = new Scanner( System.in ); // we instantiate a copy of the Scanner class
        // now we can grab what the user types

        // nextLine(), nextInt(), nextFloat()...
        String username = input.nextLine(); // this will grab the entire entered line as a string
        // use what they typed in a print statement
        System.out.printf("Welcome %s", username);
        // when we have done, we should clean up
        input.close();

        System.out.println(); // just for a new line!
        // basic maths
        int first  = 3;
        int second = 7;
        int total, division, remainder; // NB we can declare variables without initializing them with any value

        total = first + second;
        division = second / first; // CAREFUL - we askecd for an integer, so the result gets rounded
        remainder = second % first; // this is modulo arithmetic, then show the leftover
        System.out.printf("Fun with integers: %d %d %d", total, division, remainder);
    }

} // end of class