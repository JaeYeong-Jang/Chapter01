package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int insult_num = sc.nextInt();
		System.out.println("숫자 : " + insult_num);
		
		if (insult_num > 0 ) {
			System.out.println("양수입니다.");
		}else if(insult_num < 0) {
			System.out.println("음수입니다.");
		}else { 
			System.out.println("0입니다.");
		}
		
		sc.close();
		
	}
}