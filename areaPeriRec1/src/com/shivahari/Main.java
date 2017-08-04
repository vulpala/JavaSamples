package com.shivahari;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter l and b value");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double area = l * b;
        System.out.println("Area of the rectangle = " + area);
        double peri = 2*(l+b);
        System.out.println("Perimeter of the rectangle = " + peri);
    }
}



