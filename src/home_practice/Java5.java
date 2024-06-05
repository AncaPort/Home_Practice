package home_practice;

import java.util.Scanner;

public class Java5 {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods
     */
    //static method
    public static String add(int num1, int num2) {
        return num1 + "+" + num2 + "=" + (num1 + num2);
    }

    public static String subtract(int num1, int num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }

    //Instance method
    public String multiply(int num1, int num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 + "/" + num2 + "=" + (num1 / num2);
        } else {
            return "can not divide by zero!";
        }
    }

    public static void main(String[] args) { //static method call
        Scanner scanner = new Scanner(System.in);
        System.out.println("Static methods: ");
        System.out.println("Enter first number: ");
        int staticNum1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int staticNum2 = scanner.nextInt();
        System.out.println(add(staticNum1,staticNum2));
        System.out.println(subtract(staticNum1,staticNum2));
//instance method calls




    }
}