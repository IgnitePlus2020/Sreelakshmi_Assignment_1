package com.tgt.igniteplus;

import java.util.Scanner;

public class Sequence6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,ans=1,i=1;
        System.out.println("Enter number");
        n = in.nextInt();
        if(n==1){
            System.out.print(ans);
        }
        else
        {
            System.out.print(ans+",");
            n--;
            while(n!=0)
            {
                 ans=ans+(4*i);
                 System.out.print(ans+",");
                 n--;
                 i++;
                 if(i%3==0)
                     i+=1;

            }
        }

    }
}

//1,5,13,29,49,77


