package com.thirdware;

import java.util.Scanner;

public class FindingGreater {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = scanner.nextInt();
		System.out.println("Enter b value:");
		int b = scanner.nextInt();
		if(a>(b+2))
		{
			System.out.println(a);
		}else if (b>(a+2)) {
			System.out.println(b);
			
		}else{
			System.out.println("INCONCLUSIVE");
		}
		

	}

}
