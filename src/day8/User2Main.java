package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<User2> list = new ArrayList<>();
		Util2 util2 = new Util2();
		boolean login = false;


		while (true) {
			if (login == true) {
				System.out.println("1.비밀번호수정 2.로그아웃 3.리스트 4.회원탈퇴 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			}

			System.out.println("메뉴선택> ");
			int menu = util2.numCheck(null);

			if (menu == 1) {
				if (login == true) {

				} else {
					User2 user = new User2();
					System.out.print("이름입력> ");
					user.setName(sc.next());
					System.out.print("아이디입력> ");
					String id = util2.duCheck(list);
					user.setId(id);
					System.out.print("비밀번호입력> ");
					user.setPw(sc.next());
					list.add(user);
					System.out.println("반갑습니다" + user.getName() + "님 회원가입 완료");
				}

			} else if (menu == 2) {
				if (login == true) {

				} else {

					System.out.print("로그인할 아이디> ");
					String loginId = sc.next();
					System.out.print("로그인할 비밀번호> ");
					String loginPw = sc.next();
					boolean find = false;

					for (User2 u : list) {
						if (loginId.equals(u.getId()) && loginPw.equals(u.getPw())) {
							System.out.println("로그인 성공!");
							login = true;
							find = true;
							break;
						}
					}
					if (!find) {
						System.out.println("로그인 실패");
					}
				}
			} else if (menu == 3) {
				System.out.println("이름\t아이디\t비밀번호\t가입일");
				System.out.println("-----------------------------------------------");
				for (User2 u : list) {
					u.print();
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}

		}
		System.out.println("프로그램 종료");
	}

}
