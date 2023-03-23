package Project1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CarService {
	private static CarService service = new CarService();
	private boolean result = false;

	private CarService() {

	}

	public static CarService getInstance() {
		return service;
	}

	private Scanner sc = new Scanner(System.in);
	private CarRepository repository = CarRepository.getInstance();
	private String loginId = null;
	private String loginPassword = null;

	public void carsave() {
		if (loginId != null && loginPassword != null) {
			CarDTO carDTO = new CarDTO();
			repository.eventcheck(loginId, loginPassword);
			System.out.print("자동차 번호를 입력하세요> ");
			carDTO.setCarNum(sc.next());
			System.out.print("자동차 색상을 적어주세요> ");
			carDTO.setColor(sc.next());
			System.out.print("차종을 입력하세요 ex) 아반떼, 소나타, K5 등> ");
			carDTO.setModel(sc.next());
			System.out.print("판매하시는 자동차의 년식의 숫자를 적어주세요 ex) 2002 , 2013 등> ");
			carDTO.setProductionyear(sc.nextInt());
			System.out.print("원하시는 판매금액을 입력하세요> ");
			carDTO.setPrice(sc.nextInt());
			if (repository.carsave(carDTO, loginId, loginPassword)) {
				System.out.println("차 등록 성공");
				System.out.println();
			} else {
				System.out.println("차 등록 실패");
			}
		} else {
			System.out.println("로그인 확인 필요");
		}
	}

	public void save() {
		UserDTO userDTO = new UserDTO();
		boolean checkResult = true;
		boolean NickResult = true;
		String id = null;
		String nick = null;
		do {
			System.out.print("id> ");
			id = sc.next(); // String Id 로 주게되면 밑에 id는 적용이 안됨
			if (repository.checkId(id)) {
				System.out.println("사용가능 아이디 입니다.");
				checkResult = false;
			} else {
				System.out.println("이미 사용중인 id 입니다.");
			}
		} while (checkResult);
		userDTO.setId(id);
		System.out.print("password> ");
		userDTO.setPassword(sc.next());
		System.out.print("이름> ");
		userDTO.setName(sc.next());
		do {
			System.out.print("닉네임> ");
			nick = sc.next();
			if (repository.checkNickname(nick)) {
				System.out.println("사용 가능한 닉네임입니다");
				NickResult = false;
			} else {
				System.out.println("이미 사용중인 닉네임 입니다.");
			}
		} while (NickResult);

		userDTO.setNickname(nick);
		if (repository.save(userDTO)) {
			System.out.println("회원가입성공");
			result = true;
		} else {
			System.out.println("회원가입실패");
		}
	}

	public void carfindnick() {
		System.out.print("검색하실 차종을 입력하세요> ");
		String model = sc.next();
		List<CarDTO> cList = repository.breakList(model);
		if (repository.breakList(model).size() == 0) {
			System.out.println("등록된 차종이 없습니다");
		} else {
			System.out.println("\t\t글번호\t차번호\t차종\t\t년식\t색상\t가격");
			System.out.println(cList);
		}
	}

	public void cardelete() {
		System.out.println("삭제 하실 글번호를 입력하세요> ");
		String deletebno = sc.next();
		if (repository.cardelete(loginPassword, loginId, deletebno)) {
			System.out.println("게시물 삭제가 완료되었습니다");
		} else {
			System.out.println("게시물 삭제가 실패하였습니다");
		}
	}

	public boolean loginCheck() {
		System.out.print("id> ");
		String id = sc.next();
		System.out.print("password> ");
		String password = sc.next();

		if (repository.loginCheck(id, password)) {
			loginId = id;
			loginPassword = password;
			System.out.println("로그인성공");
			return true;
		} else {
			System.out.println("로그인실패");
			return false;
		}
	}

	public void carall() {
		List<CarDTO> CList = repository.carall();
		if (repository.carall() == null) {
			System.out.println("등록된 중고차가 없습니다");
		} else {
			System.out.println(CList);
		}
	}

	public void findall() {
		Map<String, UserDTO> usermap = repository.findall();
		System.out.println("\t회원번호\t아이디\t\t비밀번호\t이름\t\t닉네임\t가입일"); // return "CarDTO [CarNum=" + carNum + ", Model=" + model + ",													// Productionyear=" + productionyear + ", Color="														// + color + ", price=" + price + ", regoDate=" + regoDate +														// "]";
		System.out.println("-------------------------------------------------------");
		for (String key : usermap.keySet()) {
			System.out.println(usermap.get(key).toString());
		}
	}

	public void carupdate() {
		System.out.print("수정하실 글번호를 입력해주세요> ");
		String bnonum = sc.next();
		CarDTO c = repository.findBybno(bnonum);
		if (c == null) {
			System.out.println("조회할 수 없는 글번호 입니다");
		} else {
			CarDTO carDTO = new CarDTO();
			System.out.print("자동차 번호를 수정해주세요> ");
			carDTO.setCarNum(sc.next());
			System.out.print("자동차 색상을 수정해주세요> ");
			carDTO.setColor(sc.next());
			System.out.print("차종을 수정해주세요> ");
			carDTO.setModel(sc.next());
			System.out.print("년식을 수정해주세요> ");
			carDTO.setProductionyear(sc.nextInt());
			System.out.print("판매금액을 수정해주세요> ");
			carDTO.setPrice(sc.nextInt());
			if (repository.carupdate(loginPassword, loginId, bnonum, carDTO)) {
				System.out.println("수정 완료");
			} else {
				System.out.println("수정 실패");
			}
		}

	}

	public void logout() {
		loginId = null;
		loginPassword = null;
		System.out.println("로그아웃");
	}

	public boolean delete() {
		if (repository.delete(loginId, loginPassword)) {
			System.out.println("삭제 성공");
			return false;
		} else {
			System.out.println("삭제 실패");
			return true;
		}
	}

	public void carevent() {
		if (result) {
			System.out.println("회원 가입 시 한 번 이용가능");
			System.out.print("| ");
			double randombox;
			for (int i = 1; i <= 9; i++) {
				randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
				if (1 <= randombox && randombox <= 1) {
					System.out.print("**자동차 키링**");
				} else if (2 <= randombox && randombox <= 3) {
					System.out.print("*스타벅스 텀블러*");
				} else if (4 <= randombox && randombox <= 7) {
					System.out.print("*스타벅스 커피*");
				} else {
					System.out.print("꽝");
				}
				System.out.print(" | ");
			}
			randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
			if (1 <= randombox && randombox <= 5)
				System.out.print("**스타벅스 텀블러**");
			else if (6 <= randombox && randombox <= 100)
				System.out.print("*스타벅스 커피*");
			System.out.print(" |");
			result = false;
		} else {
			System.out.println("ㅠㅠ 다음 이벤트를 참여해주세요");
		}
	}
}
