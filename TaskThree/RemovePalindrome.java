package com.thirdware;

import java.util.Scanner;

public class RemovePalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String data");
		String stData = scanner.nextLine();
		String[] sp = stData.split(" ");
		for (int i = 0; i < sp.length; i++) {
			String st1 = sp[i];

			if(st1.length()>1)
			{
				StringBuilder input1 = new StringBuilder();

				input1.append(st1);

				input1 = input1.reverse();
				String st2 = input1.toString();

				if (st1.equals(st2)) {
					System.out.print(" ");
				} else {
					System.out.print(st1 + "  ");
				}
			}else{
			System.out.print(st1+" ");
			}
		}
		scanner.close();
	}

}
