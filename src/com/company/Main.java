package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введіть кількість сторін в кругу : ");
        long answer1 = k.nextLong();
        System.out.println("Введіть код україні (+***): ");
        long answer2 = k.nextLong();
        System.out.println("Ввеіть кількість областей в Україні:");
        long answer3 = k.nextLong();
        System.out.println("Введіть теперішній рік: ");
        long answer4 = k.nextLong();
        System.out.println("Введіть число пі до 2 знаку після коми : ");
        double answer5 = k.nextDouble();
        System.out.println("Друга світова війна розпочалась в 1939 році?(1/0)(1-так,0-Ні): ");
        double answer6 = k.nextDouble();
        System.out.println("Україна стала незалежною у 1994 році?(1/0)(1-так,0-Ні): ");
        int answer7 = k.nextInt();
        System.out.println("Чечня клас?(true/false): ");
        boolean answer8 = k.nextBoolean();
        System.out.println("Ваша відповідь на перше запитання " + answer1 + ",а правильна відповідь це 0.");
        if (answer1 == 0L) {
            System.out.println("Ваша відповідь є вірною");
        } else {
            System.out.println("Ви помилились");
        }

        System.out.println("Ваша відповідь на друге запитання " + answer2 + ",а правильна відповідь це 380.");
        if (answer2 == 380L) {
            System.out.println("Ваша відповідь є вірною");
        } else {
            System.out.println("Ви помилились");
        }

        System.out.println("Ваша відповідь на запитання номер три  " + answer3 + ",а правильна відповідь це 24.");
        if (answer3 == 24L) {
            System.out.println("Ваша відповідь є вірною");
        } else {
            System.out.println("Ви помилились");
        }
        System.out.println("Ваша відповідь на запитання номер чотири  " + answer3 + ",а правильна відповідь це 2020.");
        if (answer4 == 2020L) {
            System.out.println("Ваша відповідь є вірною");
        } else {
            System.out.println("Ви помилились");
        }

        System.out.println("Ваша відповідь на запитання номер п'ять " + answer5 + ",а правильна відповідь це 3.14.");
        if (answer5 == 3.14D) {
            System.out.println("Ваша відповідь є вірною");
        } else {
            System.out.println("Ви помилились");
        }

        System.out.println("Ваша відповідь на запитання номер щість " + answer6 + ",а правильна відповідь це 1");
        if (answer6 == 1) {
            System.out.println("Ваша відповідь є вірною");
        } else {
            System.out.println("Ви помилились");
        }

        System.out.println("Ваша відповідь на запитання номер сім " + answer7 + ",а правильна відповідь це 0.");
        if (answer7 == 0) {
            System.out.println("Ваша відповідь є вірною");
        } else {
            System.out.println("Ви помилились");
        }

        System.out.println("Ваша відповідь на запитання номер вісім " + answer8 + ",а правильна відповідь це true.");
        if (answer8==true) {
            System.out.println("Ваша відповідь є вірною");
        } else {
            System.out.println("Ви помилились");
        }

    }
}