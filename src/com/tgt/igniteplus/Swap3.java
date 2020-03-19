package com.tgt.igniteplus;

import java.util.Scanner;

public class Swap3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enetr three numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        System.out.println("Numbers before swap:"+a+" "+b+" "+c);
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("Numbers after swap:"+a+" "+b+" "+c);
    }
}
