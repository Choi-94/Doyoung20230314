package day8;

import java.util.Scanner;

public class Util {
	// 숫자체크 메소드
	private String name;
	private String id;

	public int numberCheck(String str) {
		int result;
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			} else {
				System.out.println(str + "은/는 숫자만 입력> ");
				sc.nextLine();
			}
		}
		return result;
	}
	
	public String lengthCheck(int maxLength) {
	
		Scanner sc = new Scanner(System.in);
		String result;
		while (true) {
			result = sc.next();
			if (result.length() <= maxLength) {
				break;
			}else {
				System.out.println("최대 글자수는"+maxLength+"입니다>");
			}

		}
		// 아이디는 6이내 체크 함수
		return result;
	}
}
//str.length() --숫자 길이 체크