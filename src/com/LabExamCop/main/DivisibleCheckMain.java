package com.LabExamCop.main;

import java.util.Scanner;

public class DivisibleCheckMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int num=sc.nextInt();


        int sum=0,r=0;
        int m=num;

        while(m>0) 
        {
            r=m%10;
            sum=sum+r;
            m=m/10;
        }

        if((num%sum)==0)
            System.out.println("The number "+num+" is divisible by the sum of its digits");

        else
            System.out.println("The number "+num+" is not divisible by the sum of its digits");

    }

}
