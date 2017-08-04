package com.shivahari;
import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for n, to check if it is a prime numer:");
        int n = sc.nextInt();
        int flag=0,i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(n + " is not a prime number");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(n + " is a prime number");
        }

    }
}
