package home_practice;

import java.util.Scanner;

public class Java9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String in Uppercase: ");
        String uppercase = scanner.nextLine();

        String lowercase = uppercase.toLowerCase();
        System.out.println("The String in lowercase is: "+lowercase);

        scanner.close();
    }
}
