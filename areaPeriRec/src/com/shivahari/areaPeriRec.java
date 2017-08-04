package com.shivahari;

/**
 * Created by harikannareddy on 8/3/17.
 */
public class areaPeriRec {
    public double areaRec(double l, double b)
    {
        double area = l * b;
        System.out.println("Area of the Rectangle = " + area);
        return area;

    }
    public double periRec(double l, double b)
    {
        double peri = 2 * (l + b);
        System.out.println("Perimeter of the Rectangle = " + peri);
        return peri;
    }
}
