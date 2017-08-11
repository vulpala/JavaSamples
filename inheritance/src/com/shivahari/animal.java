package com.shivahari;

/**
 * Created by harikannareddy on 8/9/17.
 */
public class animal {

    private int body;

    private int brain;

    public int getBody() {
        return body;
    }



    public int getBrain() {
        return brain;
    }

    public animal(int body, int brain) {
        this.body = body;
        //this.speed = speed;
        this.brain = brain;
    }

    public void move()
    {
        System.out.println("animal.move() called");
    }

    public void arms()
    {
        System.out.println("animal.arms() called");
    }
}
