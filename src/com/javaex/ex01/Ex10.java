package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		//논리 연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본 &&
		System.out.println(" && 연산자 ------------------------");
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//논리연산자 기본 ||
		System.out.println(" || 연산자 --------------------------");
		System.out.println( true || true);
		System.out.println( true || false);
		System.out.println( false || true);
		System.out.println( false || false);
		
		//논리연산자 응용 
		System.out.println(" 논리 연산자 응용 -----------------------");
		
		System.out.println((a>b) && (a<b)); // (5>7) --> F , (5<7) --> T , F && T --> F
		System.out.println((a>b) && (a>b)); // (5>7) --> F , (5>7) --> F , F && F --> F
		System.out.println((a>b) || (a<b)); // (5>7) --> F , (5<7) --> T , F || T --> T
		System.out.println((a>b) || (a<b) && (a<b)); // (5>7) --> F , (5<7) --> T , (5<7) --> T , F || T --> T , T && T --> T
		System.out.println((a>b) && (a<b) || (a<b)); // (5>7) --> F , (5<7) --> T , (5<7) --> T , F && T --> F , F || T --> T
		
		System.out.println((a>b) && (a<b) && (a<b)); // (5>7) --> F , (5<7) --> T , (5<7) --> T , F && T --> F (이 뒤로 &&연산을 해봤자 F가 나오므로 뒷 연산은 시스템상 하지 않는다.), F && T --> F
													 // if 문 할 떄 설명 --> 모두 true여야 true이다. ( 모두 만족해야 한다.)
		System.out.println("논리 연산자 != --------------------------");
		System.out.println((a<b)); // (5<7) --> T
		System.out.println((a>b) && (a>b)); // (5>7) --> F , (5>7) --> F , F && F --> F
		System.out.println(!((a>b) && (a>b))); // (5>7) --> F , (5>7) --> F , F && F --> F , !(F) --> T
		
		
		System.out.println((a>b) && !(a>b)); // (5>7) --> F , !(5>7) --> T , F && T --> F
		
		System.out.println(!(a>b) && !(a>b)); // !(5>7) --> T , !(5>7) --> T , T && T --> T
		
		System.out.println();
		
		
	}

}
