// see https://controlc.com/bf893909
import java.util.Scanner; 

public class Review1 { // the filename MUST match the class name

    public static void main( String []args ) { 
        System.out.println("Please enter two integers"); // println will always terminate with a new line
        Scanner input = new Scanner( System.in ); // we instantiate a copy of the Scanner class
        float first, second, difference, product, ratio;
        double r; // we need a double to avoid a compile warning about loss of precision
        first      = input.nextFloat();
        second     = input.nextFloat();
        difference = first-second;
        product    = first*second;
        ratio      = first/second;
        r = Math.sqrt( (first*first) + (second*second) );
        // %d digit (int) %s string %f for all floating points
        System.out.printf("\nThe results are in:\n\tdifference is %f\n\tproduct is %f\n\tRatio is %f\n\thypotenuse is %f ", difference, product, ratio, r);
        input.close();
    }

} // end of class