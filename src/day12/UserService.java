package day12;

import java.util.List;
import java.util.Scanner;

public class UserService {
	private static UserService service = new UserService();
	
	private UserService() {}
	
	public static UserService getInstance() {
		return service;
	}
	
	Scanner sc = new Scanner(System.in);
	UserRepository repository = UserRepository.getInstance();
	Util util = new Util();
	String loginEmail = null;
	String loginPassword = null;
	
	public void save() {
		UserDTO userDTO = new UserDTO();
		
		String email = util.overlapCheck(repository.findAll(), "이메일");
		userDTO.setEmail(email);
		
		System.out.print("비밀번호> ");
		userDTO.setPassword(sc.next());;
		System.out.print("이름> ");
		userDTO.setName(sc.next());
		System.out.print("나이> ");
		userDTO.setAge(sc.nextInt());
		char gender = Util.genderCheck();
		userDTO.setGender(gender);
		
		if(repository.save(userDTO)) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
	}
	public boolean loginCheck() {
		System.out.print("이메일> ");
		String email = sc.next();
		System.out.print("비밀번호> ");
		String password = sc.next();
		
		if(repository.loginCheck(email, password)) {
			System.out.println("로그인 성공");
			loginEmail = email;
			loginPassword = password;
			return true;
		}else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	public void findAll() {
		List<UserDTO> array = repository.findAll();
		System.out.println("이메일\t\t비밀번호\t이름\t나이\t성별\t가입일");
		System.out.println("--------------------------------------------------------");
		for(UserDTO u : array) {
			System.out.println(u.toString());
		}
	}
	public void findById() {
		if(loginEmail == null || loginPassword == null) {
			System.out.println("로그인 오류");
			return;
		}
		UserDTO userDTO = repository.findById(loginEmail, loginPassword);
		if(userDTO == null) {
			System.out.println("세션오류");
		}else {
			System.out.println("이메일\t\t비밀번호\t이름\t나이\t성별\t가입일");
			System.out.println("--------------------------------------------------------");
			System.out.println(userDTO.toString());
		}
	}
	public void logout() {
		loginEmail = null;
		loginPassword = null;
		System.out.println("로그아웃");
	}
	public void update() {
		UserDTO userDTO = new UserDTO();
		System.out.print("수정할 비밀번호> ");
		userDTO.setPassword(sc.next());
		System.out.print("수정할 이름> ");
		userDTO.setName(sc.next());
		System.out.print("수정할 나이> ");
		userDTO.setAge(sc.nextInt());
		if(repository.update(loginEmail, loginPassword, userDTO)){
			System.out.println("업데이트 성공");
			loginPassword = userDTO.getPassword();
		}else {
			System.out.println("업데이트 실패");
		}
	}
	public boolean delete() {
		if(repository.delete(loginEmail, loginPassword)){
			System.out.println("삭제성공");
			loginEmail = null;
			loginPassword = null;
			return false;
		}else {
			System.out.println("삭제실패");
			return true;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void update() {
//		UserDTO userDTO = new UserDTO();
//		System.out.print("수정할 비밀번호> ");
//		userDTO.setPassword(sc.next());
//		System.out.print("수정할 이름> ");
//		userDTO.setName(sc.next());
//		System.out.print("수정할 나이> ");
//		userDTO.setAge(sc.nextInt());
//		if(repository.update(loginEmail, loginPassword, userDTO)) {
//			System.out.println("수정완료");
//			loginPassword = userDTO.getPassword();
//		}else {
//			System.out.println("수정실패");
//		}
//	}
//	public void delete() {
//		if(repository.delete(loginEmail, loginPassword)) {
//			System.out.println("삭제성공");
//			loginEmail = null;
//			loginPassword = null;
//		}else {
//			System.out.println("삭제실패");
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	public void domainChange() {
		String before = UserDTO.getDomain();
		System.out.print("변경할 도메인> ");
		UserDTO.setDomain(sc.next());
		System.out.println(before+" => "+UserDTO.getDomain()+" 변경완료!");
	}
	
}


