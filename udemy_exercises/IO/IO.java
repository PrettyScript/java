package IO;

import java.util.Scanner;

public class IO {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Name: " + name);
    }


}
