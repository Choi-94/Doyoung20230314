package Project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class CarRepository {
	private static CarRepository repository = new CarRepository();
	private CarRepository() {}
	public static CarRepository getInstance() {
		return repository;
	}

	List<CarDTO> CList = new ArrayList<>();
	Map<String,UserDTO> usermap = new HashMap<String, UserDTO>();
	
	public boolean save(UserDTO userDTO) {
		if(usermap.put(userDTO.getNickname(), userDTO) == null)
			return true;
		else {
			return false;
		}
	}
	
	public boolean loginCheck(String id, String password) {
		if(userCheck(id, password) != null) {
			return true;
		} else {
			return false;
		}
		
	}

	private String userCheck(String id, String password) {
		for(String key: usermap.keySet()) {
			if(id.equals(usermap.get(key).getId()) && 
					password.equals(usermap.get(key).getPassword())) {
				return key;
			}
		}
		return null;
	}
	
	public Map<String, UserDTO> findall() {	
		return usermap;
	}
	
	public boolean carsave(CarDTO carDTO) {
		
		if(CList.add(carDTO)) {
			return true;
		}		
		else {
			return false;
		}
	}
	
	public boolean nickcheck(String nick) {
		for(String key : usermap.keySet()) {
			if(nick.equals(usermap.get(key).getNickname())){
				return true;
			}
		}return false;
	}
	
	
	public List<CarDTO> breakList(String nick) {
		
		List<CarDTO> list = new ArrayList<>();
		for(String key : usermap.keySet()) {
			if(nick.equals(usermap.get(key).getNickname())) {
				for(CarDTO c : CList) {
					list.add(c);
				}
			}
		}
		return list;
	}
	

	
	
	public boolean checkId(String id) {
		for(String key: usermap.keySet()) {
			if(id.equals(usermap.get(key).getId())) {
				return false; 
			}
		}
		return true;
	}
	
	public boolean checkNickname(String nick) {
		for(String key: usermap.keySet()) {
			if(nick.equals(usermap.get(key).getNickname())) {
				return false; 
			}
		}
		return true;
	}
}
