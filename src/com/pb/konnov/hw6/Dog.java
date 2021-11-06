package com.pb.konnov.hw6;

import java.util.Objects;

public class Dog extends Animal{
    public String nickname;
    public static void makeNoise(){
        System.out.println("Собака издает звук");
    }
    public static void eat(){
        System.out.println("Собака ест");
    }
    public static void sleep(){
        System.out.println("Собака спит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(nickname, dog.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "location='" + location + '\'' +
                "nickname='" + nickname + '\'' +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
