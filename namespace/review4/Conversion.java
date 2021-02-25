package namespace.review4;
import java.util.Scanner;
import java.util.Arrays;

public class Conversion {

    public static void main(String[] args) {
        // boolean flag = false;
        // String s = "";
        // byte b = 0;
        // int i = 257;
        // double d = 323.142;
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter an integer: ");
        // try {
        //     i = input.nextInt();
        // } catch (Exception e) {
        //     System.out.println("Exception caught " + e);
        // } finally {
        //     input.close();
        // }
        // System.out.println("\nConversion of int to byte.");
        // b = (byte) i;
        // System.out.println("i and b " + i + " " + b);

        // System.out.println("\nConversion of double to int.");
        // i = (int) d;
        // System.out.println("d and i " + d + " " + i);

        // System.out.println("\nConversion of double to byte.");
        // b = (byte) d;
        // System.out.println("d and b " + d + " " + b);

        // now with a loop
        Scanner in= new Scanner(System.in);
        boolean flag = false;
        String s = "";
        byte b = 0;
        int i = 257;
        double d = 323.142;
        int[] arr = {}; // an empty array
        do {
            // store in a new array for each entered byte
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = b;

            System.out.println("Enter a byte: ");
            try {
                b = in.nextByte();
                if (b==(byte)0){
                    flag = true;
                }
            } catch (Exception e) {
                System.out.println("Exception caught " + e);
                flag = true;
            } finally {
                // nothing to see here
            }
            System.out.println("\nConversion of byte to int.");
            i = (int) b;
            System.out.println("b and i " + b + " " + i);
            System.out.println("\nConversion of byte to double.");
            d = (double) b;
            System.out.println("b and d " + b + " " + d);
            System.out.println("\nConversion of byte to string.");
            s = String.valueOf(b);
            System.out.println("b and s " + b + " " + s);
        } while( flag == false );
        in.close();
        // print the array
        for (int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}