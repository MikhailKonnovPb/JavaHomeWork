package com.pb.konnov.hw5;

import java.security.PublicKey;

public class Reader {
    String name;
    String faculty;
    int lib_number;
    String birth;
    String phone_number;

    public void takeBook(int bookCount) {
        System.out.println(name + " узяв " + bookCount + " книги");
    }
    public void takeBook(String... bookNames) {
          System.out.println(name+" узяв книги: "+bookNames[0]+", "+bookNames[1]+", "+bookNames[2]);
      }
    public void takeBook(Book... books) {
        int i=0;
        String temp = new String();
        for (Book title : books) {
            temp = temp + books[i].title + " (" + books[i].author + " " + books[i].year + "р.), ";
            i++;
        }
        temp = temp.substring(0,(temp.length()-2))+".";
        System.out.println(name + " узяв книги: " + temp);
    }
    public void returnBook(int bookCount) {

        System.out.println(name + " повернув " + bookCount + " книги");
    }
    public void returnBook(String... bookNames) {
        System.out.println(name+" повернув книги: "+bookNames[0]+", "+bookNames[1]+", "+bookNames[2]);
    }
    public void returnBook( Book... books ) {
        int i=0;
        String temp = new String();
        for (Book title : books) {
            temp = temp + books[i].title + " (" + books[i].author + " " + books[i].year + "р.), ";
            i++;
        }
        temp = temp.substring(0,(temp.length()-2))+".";
        System.out.println(name + " повернув книги: " + temp);
    }
}
