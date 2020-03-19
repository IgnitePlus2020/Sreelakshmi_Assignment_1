package com.tgt.igniteplus;

import java.util.Scanner;

public class Sequence2
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        System.out.println("Enter number");
        N=in.nextInt();
        for(int i=1;i<N;i++)
        {
            if(i%2!=0)
                System.out.print("-"+i+",");
            else
                System.out.print(i+",");
        }
        System.out.println(N);
    }
}

//-1,2,-3,4,-5,6,......