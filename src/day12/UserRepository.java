package day12;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	// static 변수로 객체 생성
	private static UserRepository repository = new UserRepository();
	// 외부에서 new로 생성할 수 없게 생성자를 private으로 선언
	private UserRepository() {}
	// 필드로 선언된 객체를 리턴하는 메소드
	public static UserRepository getInstance() {
		return repository;
	}
	
	List<UserDTO> list = new ArrayList<>();
	
	public boolean save(UserDTO userDTO) {
		return list.add(userDTO);
	}
	public boolean loginCheck(String email, String password) {
		for(UserDTO u : list) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	public List<UserDTO> findAll(){
		return list;
	}
	public UserDTO findById(String email, String password) {
		for(UserDTO u : list) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
	}
	public boolean update(String email, String password, UserDTO userDTO) {
		for(UserDTO u : list) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				u.setPassword(userDTO.getPassword());
				u.setName(userDTO.getName());
				u.setAge(userDTO.getAge());
				return true;
			}
		}
		return false;
	}
	public boolean delete(String email, String password) {
		for(UserDTO u : list) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				list.remove(u);
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
//	public boolean update(String loginEmail, String loginPassword, UserDTO userDTO) {
//		for(UserDTO u : list) {
//			if(u.getEmail().equals(loginEmail) && u.getPassword().equals(loginPassword)) {
//				u.setPassword(userDTO.getPassword());
//				u.setName(userDTO.getName());
//				u.setAge(userDTO.getAge());
//				return true;
//			}
//		}
//		return false;
//	}
//	public boolean delete(String loginEmail, String loginPassword) {
//		for(UserDTO u : list) {
//			if(u.getEmail().equals(loginEmail) && u.getPassword().equals(loginPassword)) {
//				list.remove(u);
//				return true;
//			}
//		}
//		return false;
//	}
	public boolean overlapCheck(String email) {
		for(UserDTO u : list) {
			if(u.getEmail().equals(email)) {
				return false;
			}
		}
		return true;
	}
}

