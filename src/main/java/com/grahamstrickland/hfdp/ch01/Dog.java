package com.grahamstrickland.hfdp.ch01;

public class Dog extends Animal {
    public void makeSound() {
        bark();
    }

    public void bark() {
        System.out.println("Bark! Bark!");
    }
}
