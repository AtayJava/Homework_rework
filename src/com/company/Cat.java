package com.company;

public class Cat extends Animal{
    private String typeWoolCat;

    public Cat(String typeWoolCat) {
        super.setName("Murka");
        this.typeWoolCat = typeWoolCat;
    }

    public void setTypeWoolCat(String typeWoolCat) {
        this.typeWoolCat = typeWoolCat;
    }


    @Override
    public void print() {
        System.out.println("Cat : "+
                "\nName = " + getName()+
                "\nWool cat = " +typeWoolCat);
    }
}
