package Project1;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarService carservice = new CarService();
		boolean loginOk = false;

		System.out.println("==================●도영중고차●==================");
		System.out.println("1.회원가입 2.로그인 3.회원리스트");
		System.out.println(
				"1.차량등록 2.검색하신 닉네임으로 등록된 차량확인 3.등록한 차량 게시물 삭제 4.등록된 차량 게시물 수정 5.전체 중고차 리스트 6.회원탈퇴 7.로그아웃 0.종료");
		int menu = sc.nextInt();
		while (true) {

			if (menu == 1) {
				if(!loginOk) {
					carservice.save();
				}else {
					carservice.carsave();
				}
			} else if (menu == 2) {
				if(!loginOk) {
					carservice.loginchk();
				}else {
					carservice.carfindnick();
				}
			} else if (menu == 3) {
				if(!loginOk) {
					carservice.findall();
				}else {
					carservice.cardelete();
				}
			} else if (menu == 4) {
				if(!loginOk) {
					System.out.println("존재하지 않는 번호입니다");
					continue;				
				}else {
					carservice.carupdate();
				}
			} else if (menu == 5) {
				if(!loginOk) {
					System.out.println("존재하지 않는 번호입니다");
					continue;	
				}else {
					carservice.carfindall();
				}
			} else if (menu == 6) {
				if(!loginOk) {
					System.out.println("존재하지 않는 번호입니다");
					continue;
				}else {
					carservice.idremove();
				}
			} else if (menu == 7) {
				if(!loginOk) {
					System.out.println("존재하지 않는 번호입니다");
					continue;
				}else {
					carservice.logout();
				}
			} else if (menu == 0) {
				break;
			}
		}
		System.out.println("도영중고차를 방문해주셔서 감사합니다!");
	}
}
