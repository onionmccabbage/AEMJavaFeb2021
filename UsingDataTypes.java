// see https://controlc.com/ec4e59a3

import java.util.Scanner;


public class UsingDataTypes {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int num   = in.nextInt();
        int other = in.nextInt();
        // the Array data type
        // int[] myArray; // myArray is now an Array which can hold only int values
        // myArray = new int[5]; // we now have an empty array which may contain 5 int values
        in.close();
        // alternative syntax
        final int ARR_LEN = num; // this is a constant, i.e. immutable, final
        int[] myArray = new int[ARR_LEN];

        // we can loop to create array members
        for (int counter = 0; counter < myArray.length; counter++)
            { // the curly brackets are OPTIONAL if there is only one line
                myArray[counter] = counter*other;
            }

        // we can loop again to print the results
        System.out.printf("%s%8s\n", "Index", "Value");
        for (int counter = 0; counter < myArray.length; counter++)
            System.out.printf("%5d%8d\n", counter, myArray[counter]);

        // one last way to declare an array
        int[] otherArray = {32, 27, 64, 18, 95, 72, 37};
        System.out.println(otherArray); // weird outcome - revisit this!!
    }
}
