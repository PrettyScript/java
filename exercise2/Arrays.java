package exercise2;

import java.util.Arrays;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    int[] nums = {};
    String[] greetings;
    boolean[] binaries;

    public static void printNums(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static void printGreetings(String[] greetings) {
        for (String g : greetings) {
            System.out.println(g);
        }
    }
    public static void printBinaries(int[] binaries) {
        for(int binary : binaries) {
            if(binary == 0) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,23,3,4,5,2,1};
        printNums(nums);

        String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
        printGreetings(greetings);

        int[] binaries = {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
        printBinaries(binaries);
    }
}









