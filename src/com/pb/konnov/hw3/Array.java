package com.pb.konnov.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[10];
        int temp = 0;
               for (int clc = 0; clc < 10; clc++) {
                    System.out.println("Введите " + (clc+1) + " элемент массива");
                    array1[clc]=Integer.parseInt(scan.next());
                }
        System.out.print("Все элементы введенного массива: ");
        for (int clc = 0; clc < 10; clc++) {
            System.out.print(array1[clc] + " ");
        }
        for (int clc = 0; clc < 10; clc++) {
           temp = temp + array1[clc];
        }
        System.out.println();
        System.out.println("Сумма всех элементов массива: " + temp);
        temp = 0;
        for (int clc = 0; clc < 10; clc++) {
            if (array1[clc]>0) {
            temp++;}
            }
        System.out.println("Количество положительных элементов массива: " + temp);
        for (int clch = 0; clch < 9; clch++) {
            for (int clc = 0; clc < 9; clc++) {
                if (array1[clc] > array1[clc + 1]) {
                    temp = array1[clc];
                    array1[clc] = array1[clc + 1];
                    array1[clc + 1] = temp;
                }
            }
        }
        System.out.print("Все элементы введенного массива: ");
        for (int clc = 0; clc < 10; clc++) {
            System.out.print(array1[clc] + " ");
        }

    }
}
