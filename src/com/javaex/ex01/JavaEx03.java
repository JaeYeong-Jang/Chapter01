package com.javaex.ex01;

public class JavaEx03 {
	
	public static void main(String[]args) {
		
		int score;
		char grade;
		
		score = 83;
		
		if (score > 90) {
			
			 grade = 'A';
			 
		}
		else if (score > 80) {
			
			grade = 'B';
			
		}
		else if (score > 70) {
			
			grade = 'C';
			
		}
		else if (score > 60) {
			
			grade = 'D';
		}
		else {
			
			grade = 'F';
		}
		
		System.out.println("점수는" +score+ "점이고");
		System.out.println(grade+"등급입니다.");
	}
}
