package com.pb.konnov.hw7;

import com.pb.konnov.hw5.Book;

import java.util.PrimitiveIterator;

public class Atelier {
    static void dressMan(Clothes... clothes){
        int i=0;
        for (Clothes price : clothes) {
            if (clothes[i] instanceof Pants || clothes[i] instanceof Tshirt || clothes[i] instanceof Tie) {
                ((ManClothes) clothes[i]).dressMan();
            }
            i++;
        }
    }
    static void dressWomen(Clothes... clothes){
        int i=0;
        for (Clothes price : clothes) {
            if (clothes[i] instanceof Pants || clothes[i] instanceof Tshirt || clothes[i] instanceof Skirt) {
                ((WomenClothes) clothes[i]).dressWomen();
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt();
        tshirt1.sz = Size.S;
        tshirt1.color = "red";
        tshirt1.price = 15;
        Tshirt tshirt2 = new Tshirt();
        tshirt2.sz = Size.L;
        tshirt2.color = "blue";
        tshirt2.price = 13;
        Pants pants1 = new Pants();
        pants1.sz = Size.XXS;
        pants1.color = "green";
        pants1.price = 14;
        Pants pants2 = new Pants();
        pants2.sz = Size.M;
        pants2.color = "black";
        pants2.price = 11;
        Tie tie1 = new Tie();
        tie1.sz = Size.XS;
        tie1.color = "brown";
        tie1.price = 18;
        Tie tie2 = new Tie();
        tie2.sz = Size.XS;
        tie2.color = "yellow";
        tie2.price = 20;
        Skirt skirt1 = new Skirt();
        skirt1.sz = Size.M;
        skirt1.color = "orange";
        skirt1.price = 9;
        Skirt skirt2 = new Skirt();
        skirt2.sz = Size.XXS;
        skirt2.color = "white";
        skirt2.price = 7;
        Clothes[] clothes = {tshirt1,tshirt2,pants1,pants2,tie1,tie2,skirt1,skirt2};
        dressMan(clothes);
        dressWomen(clothes);
        String temp = new String();
        temp=Size.getDescription(String.valueOf(pants2.sz));
        System.out.println(temp);
        int a;
        a=Size.getEuroSize(String.valueOf(pants2.sz));
        System.out.println(a);
    }
}
