package com.thirdware;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String data");
		String stData = scanner.next();
		char[] charArray = stData.toCharArray();
		for(int i=0;i<=charArray.length;i++){
			 
			for(int j=0;j<i;j++){
				System.out.print(charArray[j]+" ");
			}
			System.out.println();
		}
		for(int i=charArray.length;i>=0;i--){
			 
			for(int j=0;j<i-1;j++){
				System.out.print(charArray[j]+" ");
			}
			System.out.println();
		}
		scanner.close();

	}

}
