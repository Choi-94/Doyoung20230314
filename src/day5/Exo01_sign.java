package day5;

import java.util.Scanner;

public class Exo01_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("======회원가입======");
		String Id = "test";
		String Pw = "1234";
		String name = "홍길동";

		boolean check = true;
		boolean loginsu = false;

		while (check) {
			if (loginsu) {
				System.out.println("1.비밀번호 수정 2. 로그아웃");
			} else if (loginsu) {
				System.out.println("1.회원가입 2.로그인 3.종료");
				int menu = sc.nextInt();

				if (menu == 1) {
					System.out.print("아이디를 입력하세요> ");
					Id = sc.next();
					System.out.print("비밀번호를 입력하세요> ");
					Pw = sc.next();
				} else if (menu == 2) {
					String loginId = "";
					String loginPw = "";
					System.out.print("아이디를 입력하세요> ");
					loginId = sc.next();
					System.out.println("비밀번호를 입력하세요");
					loginPw = sc.next();
					if (Id.equals(loginId) && Pw.equals(loginPw)) {
						System.out.println("로그인 성공!");
							loginsu = true;
						}
					}
				}
			}

		}
	}

