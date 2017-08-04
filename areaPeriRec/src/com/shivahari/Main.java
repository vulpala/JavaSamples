package com.shivahari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter l and b value");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        areaPeriRec obj=new areaPeriRec(); //ref n creating class
        obj.areaRec(l,b); //calling method
        //area.areaRec(10,20);

        //areaPeriRec peri=new areaPeriRec();
        obj.periRec(l,b);
        //peri.periRec(20,34);
    }
}
