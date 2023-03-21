package Project1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day18.BreakdownDTO;
import day18.ClientDTO;

public class CarService {
	private static CarService service = new CarService();

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
		if(loginId != null && loginPassword != null) {
			CarDTO carDTO = new CarDTO();
			System.out.print("자동차 번호를 입력하세요> ");
			carDTO.setCarNum(sc.next());
			System.out.print("자동차 색상을 적어주세요> ");
			carDTO.setColor(sc.next());
			System.out.print("차종을 입력하세요 ex) 아반떼, 소나타, K5 등> ");
			carDTO.setModel(sc.next());
			System.out.print("판매하시는 자동차의 년식의 숫자를 적어주세요 ex) 2002 , 2013 등> ");
			carDTO.setPrice(sc.nextInt());
			System.out.print("원하시는 판매금액을 입력하세요> ");
			carDTO.setPrice(sc.nextInt());
			
			if(repository.carsave(carDTO)) {
				System.out.println("차 등록 성공");
			}else {
				System.out.println("차 등록 실패");
			}
		}else {
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
		} else {
			System.out.println("회원가입실패");
		}
	}
	
	public void carfindnick() {
		System.out.print("검색하실 닉네임을 입력하세요> ");
		String nick = sc.next();
		List<CarDTO> cList = repository.breakList(nick);
		if(repository.nickcheck(nick)) {
			if(cList.size() == 0) {
				System.out.println("등로된 차가 없습니다");
			}else {
				System.out.println(cList);
			}
		}else {
			System.out.println("없는 닉네임입니다");
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
	public void findall() {
		Map<String, UserDTO> usermap = repository.findall();
		System.out.println("\t\t회원번호\t이름\t닉네임\t가입일");                               //return "CarDTO [CarNum=" + carNum + ", Model=" + model + ", Productionyear=" + productionyear + ", Color="
																								//+ color + ", price=" + price + ", regoDate=" + regoDate + "]";
		System.out.println("-------------------------------------------------------");
		for (String key : usermap.keySet()) {
			System.out.println(usermap.get(key).toString());
		}
	}

}
