package com.tgt.igniteplus;

import java.util.Scanner;

public class Factorial {
   static int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return (n*fact(n-1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num; int result;
        System.out.println("Enter the number");
        num=in.nextInt();
        result=fact(num);
        System.out.println(num+"!="+result);
    }

}
