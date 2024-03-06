package org.example.Homework_Java_3;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    //     1 уровень сложности: №1
//    Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//    Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//            Например:
//    ввод - mama, papa
//    вывод - mapa
//

    public static void main(String[] args) {
        String word1;
        String word2;
        word1 = inputWord();
        word2 = inputWord();
        System.out.println(word1.substring(0, word1.length() / 2) + word2.substring(0, word2.length() / 2));
    }

    public static String inputWord() {
        String word = "";
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово с чётным количеством букв: ");
        while (counter == 0 || counter % 2 != 0) {
            word = scanner.next();
            counter = word.length();

            if (counter % 2 != 0) {
                System.out.println("неверная попытка");

            }
        }


        return word;
    }

}

