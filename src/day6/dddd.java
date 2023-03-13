package day6;

import java.util.Scanner;

public class dddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] id = new String[100];
		String[] pw = new String[100];
		int cnt = 0;		
		while (true) {
			System.out.println("======회원가입======");
			System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("이름을 적어주세요> ");
				name[cnt] = sc.next();
				System.out.println("사용하실 아이디를 입력해주세요> ");
				id[cnt] = sc.next();
				System.out.println("사용하실 패스워드를 입력해주세요> ");
				pw[cnt] = sc.next();
				System.out.println("회원가입이 완료되었습니다" + name[cnt] + "님 회원가입을 축하드립니다");
				cnt++;

			} else if (menu == 2) {
				System.out.println("본인의 아아디를 입력해주세요");
				String loginId = sc.next();
				System.out.println("본인의 패스워드를 입력해주세요");
				String loginPw = sc.next();
				for (int i = 0; i < cnt; i++) {
					if (loginId.equals(id[i]) && loginPw.equals(pw[i])) {
						System.out.println(name[i] + "님 로그인 성공!");
						break;
					}else if( i == cnt-1) {
						System.out.println("로그인 실패");
					}
				}
				System.out.println();
			} else if (menu == 3) {
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println("=================================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s\n", name[i], id[i], pw[i]);
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}

		}
	}
}