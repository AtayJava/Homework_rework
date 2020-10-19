package com.company;

public class Horse extends Animal{
    private int heightHorse;

    public Horse(int heightHorse) {
        super.setName("Igor");
        this.heightHorse = heightHorse;
    }

    public int getHeightHorse() {
        return heightHorse;
    }


    @Override
    public void print() {
        System.out.println("Horse : "+
                "\nName = " + getName()+
                "\nHeight horse = " +heightHorse + "m");
    }
}
