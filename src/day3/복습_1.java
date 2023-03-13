package day3;

import java.util.Scanner;

public class 복습_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		boolean check = true;
		long money = 10000;
		while (check) {
			System.out.println("=====자판기=====\t현재잔액 : "+money+"원");
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
			System.out.print("메뉴 선택> ");
			int num = sc.nextInt();
			if (num == 1) {
				money = money - 1000;
				System.out.println("콜라 구입성공!");
			} else if (num == 2) {
				System.out.println("사이다 구입성공");
			} else if (num == 3) {
				System.out.println("우유 선택");
			} else {
				check = false; //break;를 쓰는 방법도 있음
			}
		}
		System.out.println("종료");
	}

}

//Scanner sc = new Scanner(System.in);
//System.out.println("=====자판기=====");
//
//boolean check = true;
//long money = 10000;
//while (check) {
//	System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
//	System.out.print("메뉴 선택> ");
//	int num = sc.nextInt();
//	if (num == 1) {
//		System.out.println("콜라 선택");
//	} else if (num == 2) {
//		System.out.println("사이다 선택");
//	} else if (num == 3) {
//		System.out.println("우유 선택");
//	} else {
//		check = false; //break;를 쓰는 방법도 있음
//	}
//}
//System.out.println("종료");
//}