package com.shivahari;

public class Main {

    public static void main(String[] args) {

        animal a = new animal(1, 1);
        a.move();

        System.out.println("***************************");

        dog d=new dog(1,1,2, 40);
        d.arms();

        System.out.println("***************************");

        bird b = new bird(1,1,2,20);
        b.fly();
        b.move();
    }
}
