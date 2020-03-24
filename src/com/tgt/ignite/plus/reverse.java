package com.tgt.ignite.plus;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        int num,i,rev=0;
        Scanner read = new Scanner(System.in);
        System.out.println("enter number");
        num = read.nextInt();
        while(num>0){
            rev = rev*10 + num%10;
            num=num/10;
        }
        System.out.println("reverse number =" +rev);
    }
}
