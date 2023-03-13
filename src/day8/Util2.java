package day8;

import java.util.List;
import java.util.Scanner;

public class Util2 {
	Scanner sc = new Scanner(System.in);
	public int numCheck(String str) {
		int result;
		
		while(true) {
			if(sc.hasNextInt()) {
				result = sc.nextInt()	;
				break;
			}else {
				System.out.println("숫자만 입력> ");
				sc.nextLine();
				
			}
		}
		
		return result;
	}
	
	public String lengthck(int MaxLength) {

		String result;		
		while(true) {
			result = sc.next();
			if(result.length()<=MaxLength) {
				break;
			}else {
				
				System.out.println("길이는 최대"+MaxLength+"까지>");
			}
		}
		return result;
		
	}	
	//아이디 중복체크 메소드
	public String duCheck(List<User2> list) {
		String result;
		while(true) {
			result = sc.next();
			boolean find = false;
			for(User2 u : list) {
				if(u.getId().equals(result)) {
					System.out.print("중복된 아이디 입니다 다시입력> ");
					find = true;
					break;
				}
			}
			if(!find) {
				break;
			}			
		}	
		return result;
	}	
}
//아이디 길이체크 메소드
