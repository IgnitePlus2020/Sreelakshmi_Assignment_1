package com.tgt.igniteplus;

import java.util.Scanner;

public class Simpleinterest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float si,p,t,r;
        System.out.println("Enter principal");
        p=in.nextFloat();
        System.out.println("Enter time");
        t=in.nextFloat();
        System.out.println("Enter rate of interest");
        r=in.nextFloat();
        si=(p*t*r)/100;
        System.out.println("Simple interest="+si);
    }
}
