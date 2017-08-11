package com.shivahari;

/**
 * Created by harikannareddy on 8/9/17.
 */
public class bird extends animal{
    private int wings;
    private int speed;

    public bird(int body, int brain, int wings, int speed) {
        super(body, brain);
        this.wings = wings;
        this.speed = speed;
    }

    public bird(int body, int brain, int wings) {
        super(body, brain);
        this.wings = wings;
        this.speed=speed;
    }

    public void fly()
    {
        System.out.println("bird.fly() called, bird flies with " +wings + " wings");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Bird flies with a speed of "+speed);
    }
}
