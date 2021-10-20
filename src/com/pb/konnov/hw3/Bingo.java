package com.pb.konnov.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random  =  new Random();
        Scanner scan = new Scanner(System.in);
        int x = random.nextInt(100);
        System.out.println("Псс, верное число " + x);
        boolean b = false;
        String temp;
        while (!b){
            System.out.println("Введите число от 0 до 100");
            temp=scan.next();
                if (x == Integer.parseInt(temp)) {
                    b = true;
                    System.out.println("Бинго!");
                }
                else {
                    if (x > Integer.parseInt(temp)) {
                        System.out.println("Введеное число меньше загаданого");
                    } else {
                        System.out.println("Введеное число больше загаданого");
                    }
                    System.out.println("Dы хотите закочить Y/N ?");
                    temp=scan.next();
                    if (temp.equals("Y")) {
                        System.out.println("Игра окончена");
                        break;
                    }
                }

        }


    }
}
