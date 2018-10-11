package com.thirdware;

import java.util.Scanner;

public class Arraysum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int length=scanner.nextInt();
		int [] arr=new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.println("enter array elements");
			arr[i]=scanner.nextInt();
			
		}
				
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=0;
				}
				
							
			}
			
		}
	
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			  }
		   }
		}
		for (int arr1 : arr) {
			System.out.print(arr1);	
		}
	}

}
