package com.pb.konnov.hw6;

import java.util.Objects;

public class Cat extends Animal {
    public String breed;


    public static void makeNoise(){
        System.out.println("Котик издает звук");
    }

    public static void eat(){
        System.out.println("Котик ест");
    }

    public static void sleep(){
        System.out.println("Котик спит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                "location='" + location + '\'' +
                "breed='" + breed + '\'' +

                '}';
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
