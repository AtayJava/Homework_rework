package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Dog");
        System.out.println("________");
        createObject("Cat");
        System.out.println("________");
        createObject("Horse");

    }

    public static void createObject(String className) {
        switch (className) {
            case "Dog":
                Dog dog = new Dog("Pitbull");
                dog.print();
                break;
            case "Cat":
                Cat cat = new Cat("Soft");
                cat.print();
                break;
            case "Horse":
                Horse horse = new Horse(2);
                horse.print();
                break;
            default:
                System.out.println("Not found");
        }

    }

}

