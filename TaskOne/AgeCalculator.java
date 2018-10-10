package com.thirdware;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter date of birth");
	  Scanner scanner = new Scanner(System.in);
	  String dateOfBirth = scanner.nextLine();
	  String[] split = dateOfBirth.split("-");
	  int date = Integer.parseInt(split[0]);
	  int year = Integer.parseInt(split[2]);
		LocalDate today = LocalDate.now();                          
		LocalDate birthday = LocalDate.of(year, Month.MARCH, date);  
		 
		Period p = Period.between(birthday, today);
		 
		//Now access the values as below
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());

	}

}
