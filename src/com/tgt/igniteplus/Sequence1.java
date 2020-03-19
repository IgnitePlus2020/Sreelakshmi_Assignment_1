package com.tgt.igniteplus;

import java.util.Scanner;
import java.lang.Math;
public class Sequence1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        System.out.println("Enter number");
        N=in.nextInt();
        for(int i=2;i<N;i+=2)
        {
            System.out.print(i*i+",");
        }
        System.out.println(N*N);

    }
}

//4,16,36,64,........N