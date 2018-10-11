package com.thirdware;

import java.util.Arrays;
import java.util.Scanner;

public class NextHighest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int length=scanner.nextInt();
		int [] arr1=new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.println("enter array elements");
			arr1[i]=scanner.nextInt();
			
		}
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {

			arr2[i] = arr1[i];

		}

		Arrays.sort(arr2);

		int[] arr3 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j] > arr1[i]) {
					arr3[i] = arr2[j];

					break;
				}

			}
		}

		for (int b : arr3) {
			if (b > 0) {
				System.out.print(b);
			} else if (b == 0) {
				System.out.print("_");
			}
		}

	}

}
