package home_practice;

import java.util.Scanner;

public class Java10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num1 = scanner.nextInt();

        System.out.println("Multiplication table for " + num1 + ":");

        for (int i = 1; i <= 10; i++) {
            int result = num1 * i;
            System.out.println(num1 + " x " + i + " = " + result);
            scanner.close();
        }
    }
}