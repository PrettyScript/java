package udemy_exercises;

import java.util.Arrays;
import java.util.Scanner;

class Sorting {

    public static int[] sortIntegers(int[] nums) {
        int temp;
        for(int i =0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] > nums[j])
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }return nums;
    }

    public static void printNums(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static int[] getNums() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to be added to array. Enter non-numeric value to quit: ");
        boolean quit = false;
        String input = "";

        while(!quit) {
            String value = scanner.next();
            for(int i = 0; i < value.length(); i++) {
                if (!Character.isDigit(value.charAt(i))){
                    quit = true;
                    System.out.println("Non-numeric value entered. Quiting...");
                    break;
                }
            }
            if (!quit) {
                input += (value + ",");
            }
        }
        String[] strArr = input.split(",");
        int[] nums = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            nums[i] = Integer.parseInt(strArr[i]);
        }

        return nums;
    }

    public static void reverse(int[] numbers) {
        int maxIndex = numbers.length -1;
        int halfLength = numbers.length / 2;

        for(int i=0; i<halfLength; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex - i];
            numbers[maxIndex - i] = temp;
        }

    }


    public static void main(String[] args) {
        System.out.println("This is the Sorting Class");

        int[] myArray = { 45, 60, 345, 29, 3};

        sortIntegers(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));

        printNums(myArray);

        reverse(myArray);
        System.out.println("Reversed array: " + Arrays.toString(myArray));

        System.out.println(Arrays.toString(getNums()));

    }
}
