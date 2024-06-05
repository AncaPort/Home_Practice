package home_practice;

import java.util.Scanner;

public class Java15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value: ");
        int first = scanner.nextInt();

        System.out.println("Enter second value: ");
        int second = scanner.nextInt();

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After swapping: ");
        System.out.println("First variable: "+first);
        System.out.println("Second variable: "+second);
        scanner.close();

    }
}
