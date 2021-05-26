package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		int insult_m = sc.nextInt();
		
		switch(insult_m) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("31일");
		break;
		
		case 2: System.out.println("28일");
		break;
		
		case 4: case 6: case 9: case 11: System.out.println("30일");
		break;
		
		default : System.out.println("잘못된 입력입니다.");
		break;
		}
		
		
		sc.close();
		

	}

}
