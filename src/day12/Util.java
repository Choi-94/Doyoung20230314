package day12;

import java.util.List;
import java.util.Scanner;

public class Util {
	static Scanner sc = new Scanner(System.in);
	
	public static int numberCheck() {   //숫자만 입력체크
		if(sc.hasNextInt()) {
			return sc.nextInt();
		}else {
			sc.nextLine();
			return -1;
		}
	}
	public static String overlapCheck(List<UserDTO> list, String str) {
		while(true) {
			System.out.print(str+"> ");
			String email = sc.next();        //아이디 중복체크
			boolean find = false;
			for(UserDTO u : list) {
				if(u.getEmail().equals(email+"@"+UserDTO.getDomain())) {
					System.out.println("중복된 "+str);
					find = true;
					break;
				}
			}
			if(find) {
				continue;
			}
			return email;
		}
	}
	public static char genderCheck() {
		do {
			System.out.print("성별(1.남자 2.여자)> ");
			String gender = sc.next();
			if(gender.equals("1")) {
				return 'M';
			}else if(gender.equals("2")) {
				return 'F';
			}else {
				System.out.println("잘못된 성별입니다");
			}
		}while(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public String overlapCheck(List<UserDTO> list, String str) {
//		while(true) {
//			System.out.print(str+"> ");
//			String email = sc.next();
//			boolean find = false;
//			for(UserDTO u : list) {
//				if(u.getEmail().equals(email+"@"+UserDTO.getDomain())) {
//					System.out.println("중복된 "+str);
//					find = true;
//					break;
//				}
//			}
//			if(find) {
//				continue;
//			}
//			return email;
//		}
//	}
}
