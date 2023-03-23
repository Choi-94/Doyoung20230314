package Project1;

import java.util.Scanner;

public class ControlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounselingService service = CounselingService.getInstance();
		CarService carservice = CarService.getInstance();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("중고차 회원 관리자 페이지");
			System.out.println("1.회원정보 2.상담신청내역 3.돌아가기");
			int menu2 = sc.nextInt();
			if (menu2 == 1) {
				carservice.findall();
			} else if (menu2 == 2) {
				service.Counselingfind();
			} else if (menu2 == 3) {
				CarMain.main(args);
			} else {
				System.out.println("없는 번호입니다 다시 입력해주세요");
			}
		}

	}

}
