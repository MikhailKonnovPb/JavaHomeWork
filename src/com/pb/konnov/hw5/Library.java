package com.pb.konnov.hw5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Library {


    public static void main(String[] args) {
       Book book1 = new Book();
       Reader reader1 = new Reader();
       Book book2 = new Book();
       Reader reader2 = new Reader();
       Book book3 = new Book();
       Reader reader3 = new Reader();
       book1.author = "Кравчук Л.М.";
       book2.author = "Кучма Л.Д.";
       book3.author = "Ющенко В.А.";
       book1.title = "Подвійне коло";
       book2.title = "Я - романтика";
       book3.title = "Україна в огні";
       book1.year = 1991;
       book2.year = 1996;
       book3.year = 2005;
       reader1.name = "Коннов М.С.";
       reader2.name = "Ріг Д.П.";
       reader3.name = "Гора І.В.";
       reader1.birth = "1997";
       reader2.birth = "1999";
       reader3.birth = "1998";
       reader1.faculty = "ТК";
       reader2.faculty = "М";
       reader3.faculty = "В";
       reader1.lib_number = 15656;
       reader2.lib_number = 23157;
       reader3.lib_number = 95123;
       reader1.phone_number = "0504204488";
       reader2.phone_number = "0667316655";
       reader3.phone_number = "0954305131";
       reader1.takeBook(3);
       reader2.takeBook(2);
       reader3.takeBook(1);
       reader1.takeBook(book1.title,book2.title,book3.title);
       reader2.takeBook(book2.title,book3.title,book1.title);
       reader3.takeBook(book3.title,book1.title,book2.title);
       reader1.takeBook(book1,book2,book3);
       reader2.takeBook(book2,book1,book2);
       reader3.takeBook(book3,book2,book1);
       reader1.returnBook(3);
       reader2.returnBook(2);
       reader3.returnBook(1);
       reader1.returnBook(book1.title,book2.title,book3.title);
       reader2.returnBook(book2.title,book3.title,book1.title);
       reader3.returnBook(book3.title,book1.title,book2.title);
       reader1.returnBook(book1,book2,book3);
       reader2.returnBook(book2,book1,book2);
       reader3.returnBook(book3,book2,book1);
    }
}
