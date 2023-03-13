package day4;

import java.util.Scanner;

public class Ex03_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("======정렬======");
			System.out.println("첫번째 숫자입력> ");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자입력> ");
			int num2 = sc.nextInt();
			
			if(num1>num2) {
				int temp=num1;
				num1=num2;          //temp라는 공간에 num1을 저장해주는것
				num2=temp;
			}

			System.out.println("1.오름차순 2.내림차순");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				for (int i = num1; i <= num2; i++) {
					System.out.println(i);
		 }
	}
//			if (menu == 1) {
//				if (num1 < num2) {
//					for (int i = num1; i <= num2; i++) {
//						System.out.println(i);
//					}
//				} else if (num2 > num1) {
//					for (int i = num2; i <= num1; i++) {
//						System.out.println(i);
//					}
//				}
//			}
//			else if (menu == 2) {
//				if (num1 < num2) {
//					for (int i = num2; i > num1; i--) {
//						System.out.println(i);
//					}
//				}
//			}
//		}
	}
}
}
/*
 * if(menu == 1) { for(int i=1; i<=num; i++) { System.out.println(i); }
 * 
 * }else if(menu == 2) { for(int i=num; i>0; i--) { System.out.println(i); //1.
 * for(int i=0; num>i; num--){ // system.out.println(i); //2. for(int i=0;
 * i<=num; i++){ // system.out.println(num-i); }
 * 
 * }else { System.out.println("다시 입력하세요"); }
 * 
 * } }
 * 
 * }
 */