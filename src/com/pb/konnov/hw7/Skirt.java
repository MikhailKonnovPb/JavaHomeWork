package com.pb.konnov.hw7;

public class Skirt extends Clothes implements WomenClothes {

    @Override
    public void dressWomen(){
        System.out.println("Жен Размер "+sz+" цвет "+color+" цена "+price);
    }
}

