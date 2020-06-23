package exercise2;

import java.util.Arrays;

public class Types {
    //    This class has syntax errors, that will prevent your other classes from running.
//    So... work on this file first to resolve the issues.
    private int number = 8;
    int[] myArray = {3, 4, 5, 6, 76, 12, 2};
    String movieA = "Harry and the Hendersons";
    String movieB = "Star Wars";
    char male = 'm';
    char female = 'f';

    //the above instance variables have mistakes with their data types.
    // Fix the data types so the main method correctly displays the value of all of the variables

    public static void main(String[] args) {
        System.out.println("There are variables that have been declared in this Accessible class.\n" +
                "Fix the code so that all the variables can be accessed by the main method.\n" +
                "print out the values of every variable once the code has been refactored.");

        Types types = new Types();

        System.out.println(types.number);
        System.out.println(Arrays.toString(types.myArray));
        System.out.println(types.movieA);
        System.out.println(types.movieB);
        System.out.println(types.male);
        System.out.println(types.female);
    }
}