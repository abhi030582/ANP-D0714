package com.example;

public class TwoDExample {

	public static void main(String[] args) {
	int [][]arr= {{1,2,3},{4,5,6},{7,8,9},{4,5,6}};
	System.out.println("Row Length"+"\t"+arr.length);
	System.out.println("Col Length"+"\t"+arr[0].length);
	
	int sum =0;
	
	for(int i=0;i<arr.length;i++)//row
	{
		for(int j=0;j<arr[i].length;j++) //col
		{
			System.out.print(arr[i][j]+" ");
			sum += arr[j][j];
		}
		System.out.println();
	}
	System.out.println("Sum of matrix"+" "+sum);
	
}
}
