package org.example.Homework_Java_3;

import java.util.Scanner;

public class Calculate {
    //№2
//    Реализовать программу, выводящую на экран результаты:
//    Сложения двух чисел
//    Вычитания двух чисел
//    Умножения двух чисел
//    Деления двух чисел
//    Каждая из арифметических операций должна быть реализована как отдельный метод.
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        operation = scanner.next();

        switch (operation) {
            case ("+"):
                System.out.println(plus(num1, num2));
                break;
            case ("-"):
                System.out.println(minus(num1, num2));
                break;
            case ("*"):
                System.out.println(multi(num1, num2));
                break;
            case ("/"):
                System.out.println(div(num1, num2));
                break;
            default:
                System.out.println("Неверная операция");
        }
    }

    public static int plus(int x, int y) {
        return x + y;
    }

    public static int minus(int x, int y) {
        return x - y;
    }

    public static int multi(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
}
