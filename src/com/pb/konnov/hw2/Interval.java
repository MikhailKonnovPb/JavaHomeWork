package com.pb.konnov.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int interval;
            System.out.println("введіть число");
            interval = Integer.parseInt(scan.next());
            if (interval>=0 && interval<=14) {
                System.out.println("Ви ввели інтервал між 0 та 14");
            }
            if (interval>=15 && interval<=35) {
                System.out.println("Ви ввели інтервал між 15 та 35");
            }
            if (interval>=36 && interval<=50) {
                System.out.println("Ви ввели інтервал між 36 та 50");
            }
            if (interval>=51 && interval<=100) {
                System.out.println("Ви ввели інтервал між 51 та 100");
            }
            if (interval<0 || interval>100) {
                System.out.println("Число не входить в жодний інтервал");
            }
        }
    }

