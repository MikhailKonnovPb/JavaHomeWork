package com.pb.konnov.hw4;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;




public class CapitalLetter {
    static String Letter(String temp) {
        String temp3 = new String();
        StringTokenizer temp1 = new StringTokenizer(temp);
        while (temp1.hasMoreTokens()) {
            String temp2 = temp1.nextToken();
            temp2 = temp2.substring(0, 1).toUpperCase() + temp2.substring(1).toLowerCase();
            temp3 = temp3 + temp2 + " ";
        }
        return temp3;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите строку");
        String str1 = scan.nextLine();
        str1=Letter(str1);
        System.out.println(str1);
    }
}
