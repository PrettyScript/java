package exercise2;

import java.util.ArrayList;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    public static void printNums(int[] nums) {
        ArrayList<Integer> numsList = new ArrayList<>();
        for(int num : nums) {
            numsList.add(num);
        }
        numsList.forEach(num -> System.out.println(num));
    }

    public static void printGreetings(String[] greetings) {
        ArrayList<String> greetingList = new ArrayList<>();
        for(String greeting: greetings) {
            greetingList.add(greeting);
        }
        greetingList.forEach(greeting -> System.out.println(greeting));
    }

    public static void printBinaries(int[] binaries) {
        ArrayList<Integer> binariesList = new ArrayList<>();
        for(int binary : binaries) {
            binariesList.add(binary);
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









