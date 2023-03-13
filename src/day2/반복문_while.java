package day2;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력>");
//		int num = sc.nextInt();
//		while(num !=0) {
//			if(num/15 == 1) {
//				System.out.println("3과 5의 배수입니다");
//			}else if(num%3 == 0) {
//				System.out.println("3의 배수입니다");
//			}else if(num%5 == 0){
//				System.out.println("5의 배수입니다");
//			}else {
//				System.out.println("3과 5의 배수 둘 다 아닙니다");
//			}break;
//				
//		}
//	         if(num == 0) {
//	        	 System.out.println("0입니다");
//	         }
	//문제1) 숫자를 계속 입력받으면서 3의배수,5의배수,3과 5의배수를 출력하는데 0이 입력되면 반복문을 끝내시오	
	         Scanner sc = new Scanner(System.in);
	         boolean check = true;
	         while(check) {
	        	 System.out.println("숫자입력>");
	        	 int num = sc.nextInt();
	        	 if(num == 0) {
	        		 check = false;
	        	}else if(num % 3 == 0 && num % 5 == 0) {
	        		System.out.println("3과 5의 배수");
	        	}else if(num % 5 == 0) {
	        		System.out.println("5의 배수");
	        	}else if(num % 3 == 0) {
	        		System.out.println("3의 배수");
	        	}else {
	        		System.out.println("둘다 아님");
	        	}
	        	 
	         }
	

	         System.out.println("끝");
	}
}
	         //		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력>");
//		int num = sc.nextInt();
//		while (num != 0) {
//			System.out.print("숫자입력>");
//			num = sc.nextInt();
//		}
//		System.out.print("끝"); //boolean check=true; <<로 하느 방법도 있음

		// int sum = 0;
//		int a = 1;
//		while(a<=10000) {
//			sum = sum+a;
//			a++;
//		}
//		System.out.println(sum);

		// int a = 5;
//		while(a <= 10) {
//			System.out.println("안녕");
//			a++;
//		}


// while(true)이면 계속 반복실행