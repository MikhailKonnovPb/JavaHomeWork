package com.pb.konnov.hw4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Anagram {
    static boolean  Ana(String temp1, String temp2) {
        temp1=temp1.toLowerCase();
        temp2=temp2.toLowerCase();
        int exit2= 0;
        int exit3= 0;
        StringTokenizer temp3 = new StringTokenizer(temp1," ?!:;.,-—");
        while (temp3.hasMoreTokens()) {
            exit3++;
            String  temp5 = temp3.nextToken();;
            StringTokenizer temp4 = new StringTokenizer(temp2," ?!:;.,-—");
            while (temp4.hasMoreTokens()) {
                String temp6 = temp4.nextToken();
                int c1=temp5.length();
                int c2=temp6.length();
                int exit1=0;
                if (c1 == c2) {
                    for (int clc = 0; clc < c2; clc++) {
                        boolean b1=false;
                        b1=temp6.contains(temp5.substring(clc,clc+1));
                        if (b1==true) {
                            exit1++;
                       }
                        if (c2==exit1) {
                            exit2++;
                        }
                    }
                }

            }
        }
        if (exit2==exit3) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите первую строку");
        String str1 = scan.nextLine();
        System.out.println("введите вторую строку");
        String str2 = scan.nextLine();
        boolean bin = Ana(str1, str2);
        System.out.println(bin);
    }
}
