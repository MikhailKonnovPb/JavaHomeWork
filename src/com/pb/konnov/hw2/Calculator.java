package com.pb.konnov.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("введіть перше значення");
        operand1 = Integer.parseInt(scan.next());
        System.out.println("введіть знак");
        sign = scan.next();
        System.out.println("введіть друге значення");
        operand2 = Integer.parseInt(scan.next());
        switch (sign) {
            case "+":System.out.println((operand1)+sign+(operand2)+"="+(operand1+operand2));
                break;
            case "-": System.out.println((operand1)+sign+(operand2)+"="+(operand1-operand2));
                break;
            case "*": System.out.println((operand1)+sign+(operand2)+"="+(operand1*operand2));
                break;
            case "/": System.out.println((operand1)+sign+(operand2)+"="+(operand1/operand2));
                break;
        }
    }
}
