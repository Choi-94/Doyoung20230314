package day1;

import java.util.Scanner;

public class 조건문_if예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 문자입력을 받을땐 sc.next(),sc.nextLine()
		
		if(a == 0 || (a % 3 != 0 && a % 5 != 0)) {
			System.out.println("3,5의 배수가 아닙니다");
		}else if(a % 3 == 0 && a % 5 == 0) {
			System.out.println("3과 5의 배수입니다");
		}else if(a % 3 == 0) {
			System.out.println("3의 배수");
		}else if(a % 5 == 0) {
			System.out.println("5의 배수");
		}
		
		
		
	}	
		//문제) 변수 a가 3의배수이면 3의배수, 5의배수이면 5의배수 3,5 둘다의 배수이면 둘다의 배수
//		int a = 16;
//		
//		if(a % 3 == 0 && a % 5 == 0) {
//			System.out.println("3과5의 둘다의 배수");
//		}
//		else if(a % 3 == 0) {
//			System.out.println("3의 배수");
//		}else if(a % 5 == 0) {
//			System.out.println("5의 배수");
//		}else {
//			System.out.println("둘 다 아니다");
//		}
//	}

//		Scanner sc = new Scanner(System.in);
//		String id = "test";
//		String pw = "1234";  //if(id == pw) << 안됨  id.equals(pw)됨
//		
//		System.out.println("=====로그인=====");
//		System.out.print("id를 입력하세요");
//		
//		
//		String loginID = sc.next();
//		System.out.print("비밀번호를 입력하세요");
//		String loginpw = sc.next();
//		
//		if(loginID.equals(id)){
//			if(loginpw.equals(pw)) {
//				System.out.println("로그인 성공하였습니다");
//			}else {
//				System.out.println("비밀번호가 틀렸습니다");
//			}
//		}else{
//			System.out.println("아이디 틀림");
////		}
//	}
//}
////
//		
//			
//		
////		System.out.print("비밀번호를 입력하세요");
////		String loginPw = sc.next();
////		
////		if(loginID.equals(id) && loginPw.equals(pw)){
////			System.out.println("로그인성공!");
////		}else {
////			System.out.println("로그인실패");
////		}
//	
//		
//		
//		//		Scanner sc = new Scanner(System.in);
////		System.out.println("====계산기====");
////		System.out.print("첫번째 숫자입력>");
////		int num1 = sc.nextInt();
////		System.out.print("두번째 숫자입력>");
////		int num2 = sc.nextInt();
////		System.out.println("1.더하기 2.뺴기 3.곱하기 4.나누기 5.나머지");
////		System.out.print("메뉴선택>");
////		int menu = sc.nextInt();  
////		
////		if(menu==1) {
////			System.out.println(num1+"+"+num2+"="+(num1+num2));
////		}
////		else if(menu==2) {
////			System.out.println(num1+"-"+num2+"="+(num1-num2));
////		}
////		else if(menu==3) {
////			System.out.println(num1+"*"+num2+"="+(num1*num2));
////		}
////		
////		else if(menu==4) {
////			System.out.println(num1+"/"+num2+"="+(num1/num2));
////		}
////		
////		else if(menu==5) {
////			System.out.println(num1+"%"+num2+"="+(num1%num2));
////		}
////		String a = "결과값";
////			System.out.println(a);   //Scanner (S대문자 주의) 
//		
//		
//		
//		
//		
//		//ln을 지우면 옆에 바로 써진다 ln은 줄바꿈
//		
////		System.out.println("메뉴선택>");
////		int menu = sc.nextInt(); 
////		
//		
//		
//		
////		int num = 0;
////		if(num ==0) {
////			System.out.println("0입니다");
////		}
////		else if(num % 2 == 0) {
////			System.out.println("짝수");
////		}else if(num % 2 != 0 ) {
////			System.out.println("홀수");
//			
//			
//			
//////		}else {
//////			System.out.println("0입니다");
////		} //위에서부터 아래로 프로그램이 실행되기 떄문에 틀린 예제
////}
//
//	
//	////		int a = 60;
//////		if(a >= 90) {
//////			System.out.println("A");
//////		}else if(a >= 80) {
//////			System.out.println("B");
//////		}else if(a >= 70) {
//////			System.out.println("C");
//////		}else if(a >= 60) {
//////			System.out.println("D");
//////		}else if(a < 60) {
//////			System.out.println("F");
//////		}
////	}
//		
//		
//		
////		int a = 0;
////		if(a < 0) {
////			System.out.println("음수입니다");
////		}else if(a > 0) {
////			System.out.println("양수입니다");
////		}else {
////			System.out.println("0입니다");
////		}
////	}
//
//		
//}