package com.company;

public class Dog extends Animal{
    private String breedDog;

    public Dog(String breedDog) {
        super.setName("Rex");
        this.breedDog = breedDog;
    }

    public String getBreedDog() {
        return breedDog;
    }


    @Override
    public void print() {
        System.out.println("Dog : "+
                "\nName = " + getName()+
                "\nBreed dog = " +breedDog);
    }
}
