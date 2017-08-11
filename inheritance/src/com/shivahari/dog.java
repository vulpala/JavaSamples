package com.shivahari;

/**
 * Created by harikannareddy on 8/9/17.
 */
public class dog extends animal{

    private int legs;
    private int speed;

    public dog(int body, int brain, int legs, int speed) {
        super(body, brain);
        this.legs = legs;
        this.speed = speed;
    }

    public int getLegs() {
        return legs;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("dog.move() called, dog moves with a speed of "+ speed);
    }

    @Override
    public void arms() {
        super.arms();
        System.out.println("dog.arms() called, dog has " + legs+ " legs");
    }
}
