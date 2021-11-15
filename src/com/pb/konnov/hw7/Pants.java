package com.pb.konnov.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    @Override
    public void dressMan(){
        System.out.println("Муж. Размер "+sz+" цвет "+color+" цена "+price);
    }
    @Override
    public void dressWomen(){
        System.out.println("Жен Размер "+sz+"цвет "+color+" цена "+price);
    }
}
