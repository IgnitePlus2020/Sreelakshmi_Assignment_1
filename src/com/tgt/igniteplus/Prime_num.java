package com.tgt.igniteplus;

import java.util.Scanner;

public class Prime_num
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the range(m,n)");
        m = in.nextInt();
        n = in.nextInt();
        while(m<n)
        {
            boolean flag=false;
            for(int i=2;i<=m/2;++i)
             {
                 if(m%i==0)
                 {
                     flag=true;
                     break;
                 }
             }
            if(!flag)
                System.out.print(m+" ");
            ++m;
        }
    }
}
