package home_practice;

import java.util.Scanner;

public class Java13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.println("Enter third number: ");
        double third = scanner.nextDouble();

        double result = (first+second+third)/3;

        System.out.println("Result of expression is: "+result);
        scanner.close();
    }
}
