package com.tgt.igniteplus;

import java.util.Scanner;

public class Swap2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enetr two numbers");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Numbers before swap:"+a+" "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after swap:"+a+" "+b);
    }
}
