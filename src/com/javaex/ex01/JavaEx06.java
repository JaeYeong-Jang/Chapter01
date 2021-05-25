package com.javaex.ex01;

public class JavaEx06 {
	
	public static void main(String[]args){
		
		int sum = 0;
		int num = 1;
		
		while(num <= 10){
			
			sum += num++;
		}
		
		System.out.println("1부터 10까지의 합은"+sum+"입니다.");
	}

}
