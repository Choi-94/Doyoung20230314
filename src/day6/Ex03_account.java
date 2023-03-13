package day6;

import java.util.Scanner;

public class Ex03_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] account = new String[100];
		int[] balance = new int[100];
		int cnt = 0;
		int sum = 0;

		while (true) {
			System.out.println("======인천일보은행======");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌이체 5.계좌 목록 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("예금주명> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("초기입금금액> ");
				balance[cnt] = sc.nextInt();
				System.out.println(name[cnt] + "님 계좌가 개설되었습니다!");
				cnt++;
			} else if (menu == 2) {
				System.out.print("입금할계좌> ");
				String putaccount = sc.next();
				System.out.print("입금 금액> ");
				int putbalance = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (putaccount.equals(account[i])) {
						balance[i] += putbalance;
						System.out.println("입금완료!");
						break;
					} else if (i == cnt - 1) {
						System.out.println("잘못된 계좌입니다");
					}
				}

			} else if (menu == 3) {
				System.out.println("출금할계좌> ");
				String outaccount = sc.next();
				System.out.println("출금금액> ");
				int outbalance = sc.nextInt();
				boolean accountcheck = false;
				for (int i = 0; i < cnt; i++) {
					if (outaccount.equals(account[i])) {
						if (balance[i] >= outbalance) {
							balance[i] -= outbalance;
							System.out.println("출금완료!");

						} else {
							System.out.println("잔액부족");
						}
						accountcheck = true;
						break;
					}
				}
				if (!accountcheck) {
					System.out.println("잘못된 계좌번호입니다");
				}
			} else if (menu == 4) {
				System.out.print("출금할 계좌> ");
				String putaccount = sc.next();
				System.out.print("입금할계좌> ");
				String outaccount = sc.next();
				System.out.println("계좌이체 금액> ");
				int money = sc.nextInt();
				int out = -1;
				int in = -1;

				for (int i = 0; i < cnt; i++) {
					if (putaccount.equals(account[i])) {
						in = 1;
					}
					if (outaccount.equals(account[i])) {
						out = 1;
					}
				}
					if (in != 1 || out != -1) {
						System.out.println("입출금 계좌가 틀렸습니다");
					} else if (in == 1 && out == 1) {
						if (balance[i] >= money) {
						balance[i]=balance[i] - money;
							
						}
						if (balance[i] < money) {
							System.out.println("계좌 잔액이 부족합니다");
						}

						
				}
			
			} else if (menu == 5) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("----------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i], account[i], balance[i]);
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}

		}
}

}
