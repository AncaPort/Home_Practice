package home_practice;

import java.util.Scanner;

public class Java7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the tempreture in ferenhaite: ");
        double ferenheit = scanner.nextDouble();

        double celsius = (ferenheit - 32)* 5/9;

        System.out.println("The temperature in celsius is: " +celsius + "'C");
        scanner.close();
    }
}
