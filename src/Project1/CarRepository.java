package Project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRepository {
	private static CarRepository repository = new CarRepository();

	private CarRepository() {
	}

	public static CarRepository getInstance() {
		return repository;
	}

	List<CarDTO> CList = new ArrayList<>();
	Map<String, UserDTO> usermap = new HashMap<String, UserDTO>();

	public boolean save(UserDTO userDTO) {
		if (usermap.put(userDTO.getNickname(), userDTO) == null)
			return true;
		else {
			return false;
		}
	}

	public boolean loginCheck(String id, String password) {
		if (userCheck(id, password) != null) {
			return true;
		} else {
			return false;
		}
	}

	private String userCheck(String id, String password) {
		for (String key : usermap.keySet()) {
			if (id.equals(usermap.get(key).getId()) && password.equals(usermap.get(key).getPassword())) {
				return key;
			}
		}
		return null;
	}

	public Map<String, UserDTO> findall() {
		return usermap;
	}
	
	public List<CarDTO> carall(){
		if(CList.size() == 0) {
			return null;
		}else {
			
		}
		return CList;
		
	}

	public boolean carsave(CarDTO carDTO) {
		
		if (CList.add(carDTO)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean nickcheck(String nick) {
		for (String key : usermap.keySet()) {
			if (nick.equals(usermap.get(key).getNickname())) {
				return true;
			}
		}
		return false;
	}

	public List<CarDTO> breakList(String nick) {

		List<CarDTO> list = new ArrayList<>();
		for (String key : usermap.keySet()) {
			if (nick.equals(usermap.get(key).getNickname())) {
				for (CarDTO c : CList) {
					list.add(c);
				}
			}
		}
		return list;
	}

	public boolean cardelete(String loginPassword, String loginId, String deletebno) {
		for (String key : usermap.keySet()) {
			if (loginPassword.equals(usermap.get(key).getPassword()) && loginId.equals(usermap.get(key).getId())) {
				for (CarDTO c : CList) {
					if(c.getBno().equals(deletebno)) {
						CList.remove(c);
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean checkId(String id) {
		for (String key : usermap.keySet()) {
			if (id.equals(usermap.get(key).getId())) {
				return false;
			}
		}
		return true;
	}

	public boolean checkNickname(String nick) {
		for (String key : usermap.keySet()) {
			if (nick.equals(usermap.get(key).getNickname())) {
				return false;
			}
		}
		return true;
	}

	public CarDTO findBybno(String bnonum) {
		for (CarDTO c : CList) {
			if (c.getBno().equals(bnonum)) {
				return c;
			}
		}
		return null;
	}

	public boolean carupdate(String loginPassword, String loginId, String bnonum, CarDTO carDTO) {
		for (String key : usermap.keySet()) {
			if (loginPassword.equals(usermap.get(key).getPassword()) && loginId.equals(usermap.get(key).getId())) {
				for (CarDTO c : CList) {
					if (c.getBno().equals(bnonum)) {
						c.setCarNum(carDTO.getCarNum());
						c.setColor(carDTO.getColor());
						c.setModel(carDTO.getModel());
						c.setProductionyear(carDTO.getProductionyear());
						c.setPrice(carDTO.getPrice());
						CarDTO.event = CarDTO.getEvent() - 1;
						return true;
					}

				}
			}
		}
		return false;
	}

	public void carevent(String password, String loginTd) {
		for (String key : usermap.keySet()) {
			if (password.equals(usermap.get(key).getPassword()) && loginTd.equals(usermap.get(key).getId())) {

				int numevent = CarDTO.getEvent();
				if (CarDTO.getEvent() >= 5) {
					CarDTO.event = CarDTO.getEvent() - 5;
					System.out.println("과연 두근두근두근");
					System.out.print("| ");
					double randombox;
					randombox = (int) (Math.random() * (100 - 1 + 1) + 1);

					if (1 <= randombox && randombox <= 3) {
						System.out.print("**키링**");
					} else if (4 <= randombox && randombox <= 13) {
						System.out.print("*커피기프티콘*");
					} else {
						System.out.print("꽝");
					}
					System.out.print(" | ");

				} else {
					System.out.println(numevent + "점입니다 포인트 획득을 위해 화이팅!");
				}
			}
		}
	}
}
