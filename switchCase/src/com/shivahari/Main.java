package com.shivahari;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please select your option");
        int switchValue = sc.nextInt();
        if((switchValue<1) || (switchValue>3)) {
            System.out.println("Please enter 1/2/3");
        }
        else {
            System.out.println("Please enter a value for x");
            int x = sc.nextInt();
            System.out.println("Please enter a value for y");
            int y = sc.nextInt();

        switch(switchValue) {
            case 1:
                int add = x + y;
                System.out.println("YOUR ANSWER FOR OPTION NO #" + switchValue + " is : " + add);
                break;
            case 2:
                int subtract = x - y;
                System.out.println("YOUR ANSWER FOR OPTION NO #" + switchValue + " is : " + subtract);
                break;
            case 3:
                int multiply = x * y;
                System.out.println("YOUR ANSWER FOR OPTION NO #" + switchValue + " is : " + multiply);
                break;
            default:
                System.out.println("Please select option 1 or 2 or 3");
                break;
        }
        }

    }
}
