package com.pb.konnov.hw6;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) throws Exception{
        Cat cat1 = new Cat();
        cat1.food="Вискас";
        cat1.location="Дом 1";
        cat1.breed="Перс";
        Cat cat2 = new Cat();
        cat2.food="Мяумикс";
        cat2.location="Дом 2";
        cat2.breed="Перс";
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat1.toString());
        System.out.println(cat1.equals(cat2));
        Dog dog1 = new Dog();
        dog1.food="Гавчик";
        dog1.location="Будка 1";
        dog1.nickname="Стрелка";
        Dog dog2 = new Dog();
        dog2.food="Гавчик";
        dog2.location="Будка 2";
        dog2.nickname="Белка";
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(dog1.toString());
        System.out.println(dog1.equals(dog2));
        Horse horse1 = new Horse();
        horse1.food="Вискас";
        horse1.location="Стойло 1";
        horse1.Number=1;
        Horse horse2 = new Horse();
        horse2.food="Мяумикс";
        horse2.location="Дом 2";
        horse2.Number=2;
        System.out.println(horse1.hashCode());
        System.out.println(horse2.hashCode());
        System.out.println(horse1.toString());
        System.out.println(horse1.equals(horse2));
        Animal[] array = {cat1,cat2,dog1,dog1,horse1,horse2};
        Class compClazz = Class.forName("com.pb.konnov.hw6.Veterinarian");
        Constructor constr = compClazz.getConstructor(new Class[] {String.class});
        Object obj = constr.newInstance("Доктор Трафальгар Ло");
        for (int clc = 0; clc < 6; clc++) {
           System.out.println("Отправил животное на прием");
           Veterinarian.treatAnimal(array[clc]);
       }

    }
}
