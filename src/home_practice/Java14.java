package home_practice;

import java.util.Scanner;

public class Java14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 5.6;
        double height = 8.5;

        double are = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area is "+width+ " * " +height+ "=" +are);
        System.out.println("perimeter is: "+perimeter);

        scanner.close();


    }
}
