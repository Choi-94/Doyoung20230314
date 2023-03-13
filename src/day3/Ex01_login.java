package day3;

import java.util.Scanner;

public class Ex01_login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원가입 정보
		String id = "test";
		String pw = "1234";
		boolean run = true;
		while(run) {   //while문에 넣은건 로그인이 될 때까지 반복
			System.out.println("======로그인=====");
			System.out.println("아이디입력> ");
			String loginId = sc.next();
			System.out.println("비밀번호 입력> ");
			String loginPw = sc.next();
			
			if(loginId.equals(id) && loginPw.equals(pw)) {
				System.out.println("로그인 성공!");
				run=false;
			}else {
				System.out.println("로그인 실패");
				System.out.println("다시시도(Y/y)");
				String again = sc.next();
				if(!(again.equals("Y") || again.equals("y"))) {
					System.out.println("로그인 성공");
					break;
				}
			}
		}

	}

}
