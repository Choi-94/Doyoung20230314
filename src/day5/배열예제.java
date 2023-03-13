package day5;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제)문자열 배열에 문자열 5개를 할당하고, 전체출력
//		String[] str = {"안녕", "하세요", "반가", "워요", "잘있어요"};
//		System.out.println(str.length);
//		
//		for(int i=0; i<str.length; i++) {
//			System.out.println(str[i]);
//		}
		// 문제)int 배열 10칸에 값을 할당하고 , 총 합 출력

		// 문제)10칸의 정수배열을 만들고, 반복하면서 입력을 받는데 짝수만 배열에 저장 후 출력
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.println("숫자입력> ");
			int number = sc.nextInt();
			if(number % 2 ==0) {
				num[i]=number;
			}else {
				i--;
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
//		
//		while(true) {
//			for(int i=0; i<num.length; i++) {
//				if(i==10) {
//					System.out.println(num[i]);
//					break;
//				}
//			}System.out.println("숫자입력> ");
//			num = sc.nexin
//		}
//		
//		
		
		
		

		//////// //문제) 3과 5의 배수의 개수와 3의배수의 개수 5의배수의 개수를 구하시오
//		Scanner sc = new Scanner(System.in);
//		int sum3 = 0;
//		int sum1 = 0;
//		int sum2 = 0;
//
//		int[] num = new int[10];
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("숫자입력> ");
//			num[i] = sc.nextInt();
//		}
//		for (int j = 0; j < num.length; j++) {
//			if (num[j] % 3 == 0 && num[j] % 5 == 0) {
//				sum3 = sum3 + 1;
//
//			} if (num[j] % 3 == 0) {
//				sum1 = sum1 + 1;
//
//			} if (num[j] % 5 == 0) {
//				sum2 = sum2 + 1;
//
//			}
//		}
//		System.out.println("3과 5의 배수의 개수는" + sum3 + "개");
//		System.out.println("3의 배수의 개수는" + sum1 + "개");
//		System.out.println("5의 배수의 개수는" + sum2 + "개");///////////////

		//////// 문제) 10칸짜리 정수배열 선언 후 값을 입력받고, 값이 3의 배수의 합 출력
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		int sum = 0;
//		for(int i=0; i<num.length; i++) {
//			System.out.println("숫자입력> ");
//			num[i] = sc.nextInt();
//		}
//		for(int i=0; i<num.length; i++) {
//			if(num[i]%3==0) {
//				sum=num[i]+sum;
//			}
//		}
//		System.out.println(sum);///////
//		

		// 문제) 1~10까지 직접 입력해서 넣어놓고 출력해라
//	////	Scanner sc = new Scanner(System.in);
//		
//		int[] num = new int[10];
//		for(int i=0; i<num.length; i++) {
//			System.out.print("숫자를 입력해주세요> ");
//			num[i] = sc.nextInt();
//			
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}//////
//				

		// {{{{{ int[] num = new int[100];
//		for(int i=0; i<num.length; i++) {
//			num[i] = i+1;
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		} }}}}}}
//		
//		{{{{int sum = 0;
//

		// int[] num = { 2, 34, 53, 23, 5, 2, 6, 75, 4, 5 };
//
//		for (int i = 0; i < num.length; i++) {
//			if(num[i]%2==0) {  //num[i] = 2 , 34 ...  [] <--방번호 num은 방
//				sum = sum +num[i];
//			}
//		} System.out.println(sum);
//		
//		
//		//문제)index로 짝수번째의 값}}}}}}

	}
}