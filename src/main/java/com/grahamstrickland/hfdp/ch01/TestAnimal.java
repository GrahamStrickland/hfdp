package com.grahamstrickland.hfdp.ch01;

public class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Animal animal = new Dog();
        animal.makeSound();

        Animal a = getAnimal();
        a.makeSound();
    }

    private static Animal getAnimal() {
        return new Dog();
    }
}
