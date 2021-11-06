package com.pb.konnov.hw6;

import java.util.Objects;

public class Horse extends Animal{
    public int Number;
    public static void makeNoise(){
        System.out.println("Лошадь издает звук");
    }
    public static void eat(){
        System.out.println("Лошадь ест");
    }
    public static void sleep(){
        System.out.println("Лошадь спит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return food == horse.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(food);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food=" + food +
                "Number=" + Number +
                '}';
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
}
