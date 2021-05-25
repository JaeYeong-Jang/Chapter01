package com.javaex.ex02;

public class Ex01 {

	public static void main(String[]args) {
		
		int i = 2345;
		double d = 3.14;
		String str = "Good_morning";
		char c = '한';
		String s = "한";
		
		String name = "장재영";
		
		
		
		System.out.println("안녕하세요");
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println(str);
		
		System.out.println(i);
		System.out.println(name);
		System.out.println(c);
		System.out.println(s);
		System.out.println(d);
		
		System.out.println("-----------------------");
		
		System.out.println(i);
		System.out.println(i+i);
		
		System.out.println(str);
		System.out.println(str+str);
		
		System.out.println(str+i); // "Good_morning" + 2345 --> "Good_morning" + "2345" --->>> 정수형, 실수형 등 숫자형들을 문자로 바꾼다.
		System.out.println(str+d); // "Good_morning" + 3.14 --> "Good_morning" + "3.14"
		System.out.println(str + " 이랑 " + i + " 다.");
		
		//주의
		System.out.println(c);
		System.out.println(c+c); // -->> char 형은 단일문자를 숫자취급해서 덧셈 연산을 해버린다. 특별히 주의
		System.out.println(s + s); // --> 문자열형 변수 s는 목표한 대로 출력된다.
		System.out.println(c + s);
		
		//제 이름은 장재영 입니다.
		
		System.out.println("제 이름은 " + name + " 입니다.");
		
		System.out.println("안녕\"하\"세요"); // 큰 따옴표 \"
		System.out.println("안녕\\하\\세요"); // 역슬래쉬 \\
		System.out.println("안녕\n하세요"); // 줄바꿈 \n
		
		
		
		
	}
}
