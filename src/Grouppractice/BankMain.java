package Grouppractice;

import java.security.Provider.Service;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loginOK = false;
		BankService bankService = BankService.getInstance();
		
		while (true) {
			System.out.println("=================GroupBankPractice=================");
			if (!loginOK) {
				System.out.println("1.회원가입 2.로그인 3.리스트 4.검색 0.종료");
			} else {
				System.out.println("1.입출금조회 2.입금 3.출금 4.계좌이체 5.계좌추가 6.계좌리스트 7.패스워드변경 8.로그아웃 9.회원탈퇴 0.");
				int menu = sc.nextInt();

				if (menu == 1) {
					if(!loginOk) {
						service.save();
					}else {
						service.
						service.accountfind;
					}
					

				} else if (menu == 2) {
					if(!loginOk) {
						service.loginChk();
					}else {
						
					}

				} else if (menu == 3) {
					if(!loginOk) {
						service.findAll();
					}else {
					
					}

				} else if (menu == 4) {
					if(!loginOk) {
						service.findId();
					}else {
						
					}
				} else if (menu == 5) {

				} else if (menu == 6) {

				} else if (menu == 7) {

				} else if (menu == 8) {

				} else if (menu == 9) {

				} else if (menu == 0) {
					break;
				}
			}
		}
		System.out.println("GroupBank를 이용해주셔서 감사합니다");
	}

}
