package com.pb.konnov.hw7;

public class Tie extends Clothes implements ManClothes {
    @Override
    public void dressMan(){
        System.out.println("Муж. Размер "+sz+" цвет "+color+" цена "+price);
    }

}
