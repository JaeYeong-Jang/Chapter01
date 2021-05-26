package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무 시간 : ");
		int W_time = sc.nextInt();
		
		if ( W_time < 0 ) {
			System.out.println("잘못된 입력입니다.");
		} else if ( W_time <= 8 ) {
			System.out.println("임금은 " + (W_time*10000) +"원 입니다.");
		} else if ( W_time > 8 ) {
			System.out.println("임금은 " + ((10000*8)+((W_time-8)*((int)(10000*1.5)))) +"원 입니다.");
		}
		
		sc.close();
		

	}

}
