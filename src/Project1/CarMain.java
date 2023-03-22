package Project1;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarService carservice = CarService.getInstance();
		boolean loginOk = false;

		while (true) {
			System.out.println();
			System.out.println("==================●도영중고차●==================");
			if (loginOk) {
				System.out.println(
						"1.차량등록 2.검색하신 닉네임으로 등록된 차량확인 3.등록한 차량 게시물 삭제 4.등록된 차량 게시물 수정 5.전체 중고차 리스트 6.회원탈퇴 7.로그아웃 8.이벤트 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.회원리스트");
			}
			System.out.print("선택> ");
			int menu = sc.nextInt();
			

			if (menu == 1) {
				if (loginOk) {
					carservice.carsave();
				} else {
					carservice.save();
				}
			} else if (menu == 2) {
				if (loginOk) {
					carservice.carfindnick();
				} else {
					loginOk = carservice.loginCheck();
				}
			} else if (menu == 3) {
				if (loginOk) {
					carservice.cardelete();
				} else {
					carservice.findall(); // 개인정보 보호 ( 닉네임 가입일 회원번호만 보이게)
				}
			} else if (menu == 4) {
				if (loginOk) {
					carservice.carupdate();
				} else {
					System.out.println("존재하지 않는 번호입니다");
					continue;
				}
			} else if (menu == 5) {
				if (loginOk) {
					carservice.carall();
				} else {
					System.out.println("존재하지 않는 번호입니다");
					continue;
				}
			} else if (menu == 6) {
				if (loginOk) {

				} else {
					System.out.println("존재하지 않는 번호입니다");
					continue;
				}
			} else if (menu == 7) {
				if (loginOk) {
					carservice.logout();
					loginOk = false;
				} else {
					System.out.println("존재하지 않는 번호입니다");
					continue;
				}
			} else if (menu == 8) {
				if(loginOk) {
					carservice.carevent();
				}
			} else if (menu == 0){
				break;
			} else {
				System.out.println("잘못된 번호 입니다");
			}
		}
		System.out.println("도영중고차를 방문해주셔서 감사합니다!");
	}
}
