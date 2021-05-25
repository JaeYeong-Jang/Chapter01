package com.javaex.ex01;

public class JavaEx02 {
	
	public static void main(String[]args) {
		
		//나이에 따른 요금 출력 
		
		int age = 60;
		
		int charge;
		
		if(age<8) {
			
			charge = 1000;
			
		}
		else if(age<14) {
			
			charge = 2000;
			
		}
		else if(age<19) {
			
			charge = 2500;
		}
		else if(age<60) {
			
			charge = 3000;
		}
		else {
			
			System.out.println("경로우대입니다.");
			
			charge = 0;
			
		}
		System.out.println("요금은 " +charge+ "원 입니다.");
		
	}
	
}
