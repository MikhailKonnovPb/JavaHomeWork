package com.pb.konnov.hw6;

public class Animal {
    public String food;
    public String location;
    public static void makeNoise(){
        System.out.println("Такое-то издает звук");
    }
    public static void eat(){
        System.out.println("Такое-то животное ест");
    }
    public static void sleep(){
        System.out.println("Такое-то животное спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
