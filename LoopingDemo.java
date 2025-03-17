package com.example;

import java.util.Scanner;

public class LoopingDemo {

	public static void main(String[] args) {
		//Example of fixed loop
//		int i;
//		int a=0;
//		int b = 1;
//		for(i=0;i<10;i++)
//		{
////			System.out.println(i);
//			a = a + b;
//			b = a - b;
//			if(a==21)
//				continue;
//			System.out.println(a); // 1,1,2,3,5
//			
//		}
//		
		for(int k=0;k<3;k++)
		{
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print("*  ");
				}
				System.out.println();
			}
			System.out.println();
		
		}
		
		for(int k=0;k<3;k++)
		{
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println();
		
		}
		
//		int ctr=20;
//		for(;ctr <3;ctr++)
//		{
//			System.out.println(ctr);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		String ch ="n";
//		do
//        {
//		System.out.println("Enter a number");
//		int x = sc.nextInt();
//		System.out.println(x *x);
//		System.out.println("Do u want to continue(y/n)");
//		ch = sc.next();
//        }while(ch.equals("y"));
//		
//		int counter=0;
//		while(true)
//		{
//			counter++;
//			System.out.println(counter);
//			if(counter==100)
//				break;
//			
//		}
//
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("*");
//		}
//		for(int i=0;i<5;i++)
//		{
//			System.out.print("* ");
//		}
//		
		
		int aa=0;
		int bb=1;
		while(aa <=100)
		{
			System.out.println(aa);
			aa = aa + bb;
			bb = aa - bb;
			
		}
	}

}
