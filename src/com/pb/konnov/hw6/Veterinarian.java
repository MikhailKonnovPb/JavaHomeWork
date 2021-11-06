package com.pb.konnov.hw6;

public class Veterinarian {
    public String doctor;

    public Veterinarian(String doctor) {
        this.doctor = doctor;
    }
    public static void treatAnimal(Animal animal){
    System.out.println("Еда "+animal.food+" Локация "+animal.location);
    }
}
