package com.pb.konnov.hw5;

import java.security.PublicKey;

public class Reader {
    String name;
    String faculty;
    int lib_number;
    String birth;
    String phone_number;

    public void takeBook(int s) {
        System.out.println(name + " узяв " + s + " книги");
    }
    public void takeBook(String... titles) {
        System.out.println(name+" узяв книги: "+titles[0]+", "+titles[1]+", "+titles[2]);
    }
    public void takeBook( String[] temp, int[] args ) {
        System.out.println(name+" узяв книги: "+temp[0]+" ("+temp[3]+" "+args[0]+" р.) "+temp[1]+" ("+temp[4]+" "+args[2]+" р.), "+temp[2]+" ("+temp[5]+" "+args[2]+" р.)");
    }
    public void returnBook(int s) {
        System.out.println(name + " повернув " + s + " книги");
    }
    public void returnBook(String... titles) {
        System.out.println(name+" повернув книги: "+titles[0]+", "+titles[1]+", "+titles[2]);
    }
    public void returnBook( String[] temp, int[] args ) {
        System.out.println(name+" повернув книги: "+temp[0]+" ("+temp[3]+" "+args[0]+" р.) "+temp[1]+" ("+temp[4]+" "+args[2]+" р.), "+temp[2]+" ("+temp[5]+" "+args[2]+" р.)");
    }
}
