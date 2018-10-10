package com.thirdware;

public class Pattern {

	public static void main(String[] args) {
		String st="JAVAJ2EE";
		char[] charArray = st.toCharArray();
		for(int i=0;i<=charArray.length;i++){
			 
			for(int j=0;j<i;j++){
				System.out.print(charArray[j]);
			}
			System.out.println();
		}
		for(int i=charArray.length;i>=0;i--){
			 
			for(int j=0;j<i-1;j++){
				System.out.print(charArray[j]);
			}
			System.out.println();
		}


	}

}
