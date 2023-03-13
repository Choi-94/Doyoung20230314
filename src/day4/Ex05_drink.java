package day4;

import java.util.Scanner;

public class Ex05_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		int sum = 0;

		while (true) {

			System.out.printf("======자판기====== 현재잔액: %,d원\n", +balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			if (menu == 0) {
				System.out.println("종료되었습니다");
				System.out.printf("남은 금액은" + balance + "원 입니다");
				break;
			}
			if (menu == 4) {
				System.out.println("충전 금액을 입력하시오");
				int pay = sc.nextInt();
				balance = balance + pay;
				continue;
			}
			System.out.println("수량> ");
			int quantity = sc.nextInt();
			if (menu == 1) {
				sum = quantity * 1000;
				if (balance < sum) {
					System.out.println("잔액이 부족합니다");
					continue;
				}
				balance = balance - sum;
				System.out.println(sum + "원 구매성공");
			} else if (menu == 2) {
				sum = quantity * 1200;
				if (balance < sum) {
					System.out.println("잔액이 부족합니다");
					continue;
				}
				balance = balance - sum;
				System.out.println(sum + "원 구매성공");
			} else if (menu == 3) {
				sum = quantity * 1000;
				if (balance < sum) {
					System.out.println("잔액이 부족합니다");
					continue;
				}
				balance = balance - sum;
				System.out.println(sum + "원 구매성공");
			}
		}
	}

}
