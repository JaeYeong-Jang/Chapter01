package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int insult_num = sc.nextInt();
		
		if ( insult_num < 0 ) {
			System.out.println("잘못된 입력입니다.");
		}
		else if ( insult_num % 3 == 0 ) {
			System.out.println(insult_num + "은(는) 3의 배수입니다.");
		}else if ( insult_num % 3 != 0 ) {
			System.out.println(insult_num + "은(는) 3의 배수가아닙니다.");
		}
		
		sc.close();
		
	}
}
