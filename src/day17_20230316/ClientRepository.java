package day17_20230316;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day11.BoardDTO;

public class ClientRepository {
	private static ClientRepository repository = new ClientRepository();

	private ClientRepository() {
	}

	public static ClientRepository getInstance() {
		return repository;
	} // 아이디 중복체크 기능추가

	Map<String, ClientDTO> map1 = new HashMap<>();
	List<ClientDTO> cList = new ArrayList<>(); // Map으로
	List<BreakdownDTO> bList = new ArrayList<>();
	Map<String, BreakdownDTO> breakmap = new HashMap<>(); // 거래내역

	public boolean save(String account, ClientDTO clientDTO) {
		map1.put(account, clientDTO);
		boolean a = cList.add(clientDTO);
		return a;
	}

	public boolean idCheck(String id) {
		
			for (String a : map1.keySet()) {
				if (map1.get(a).getId().equals(id)) {
					return false;
				}
			}
		
		return true;

	}

	public boolean loginCheck(String id, String password) {
		for (String keys : map1.keySet()) {
			if (map1.get(keys).getId().equals(id) && map1.get(keys).getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public Map<String, ClientDTO> findAll() {
		return map1;
	}

	public String getAccount(String id, String password) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(id) && c.getPassword().equals(password)) {
				return c.getAccount();
			}
		}
		return null;
	}

	public ClientDTO findById(String id, String password) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(id) && c.getPassword().equals(password)) {
				return c;
			}
		}
		return null;
	}

	public Map<String, BreakdownDTO> breaklist(String account) {
		System.out.println(breakmap.size());
		Map<String, BreakdownDTO> map = new HashMap<>();
		for (String a : breakmap.keySet()) {
			if (account.equals(breakmap.get(a).getAccount())) {
				map.put(a, breakmap.get(a));
			}
		}
		return map;
	}

	public boolean deposit(String account, long money) {
		for (String keys : map1.keySet()) {
			if (map1.get(keys).getAccount().equals(account)) {
				map1.get(keys).setBalance(map1.get(keys).getBalance() + money);
				BreakdownDTO breakdownDTO = new BreakdownDTO();
				breakdownDTO.setAnum(keys);
				breakdownDTO.setAccount(account);
				breakdownDTO.setDivision("입금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(map1.get(keys).getBalance());
				breakmap.put(breakdownDTO.getAnum(), breakdownDTO);
				return true;
			}
		}
		return false;
	}

	public boolean withdraw(String account, long money) {
		for (String keys : map1.keySet()) {
			if (map1.get(keys).getAccount().equals(account)) {
				if (map1.get(keys).getBalance() >= money) {
					map1.get(keys).setBalance(map1.get(keys).getBalance() - money);
					BreakdownDTO breakdownDTO = new BreakdownDTO();
					breakdownDTO.setAnum(keys);
					breakdownDTO.setAccount(account);
					breakdownDTO.setDivision("출금");
					breakdownDTO.setDealMoney(money);
					breakdownDTO.setTotalMoney(map1.get(keys).getBalance());
					breakmap.put(breakdownDTO.getAnum(), breakdownDTO);
					return true;
				} else {
					return false; // 경우가 3개인경우에는 true false로 줄 수 없다
				}
			}
		}
		return false;
	}

	public boolean transferCheck(String transferAccount) {
		for (String keys : map1.keySet()) {
			if (map1.get(keys).getAccount().equals(transferAccount)) {
				return true;
			}
		}
		return false;
	}

	public boolean update(String id, String password, String updatePassword) {
		for (String keys : map1.keySet()) {
			if (map1.get(keys).getId().equals(id) && map1.get(keys).getPassword().equals(password)) {
				map1.get(keys).setPassword(updatePassword);
				return true;
			}
		}
		return false;
	}

	public boolean delete(String id, String password) {
		for (String keys : map1.keySet()) {
			if (map1.get(keys).getId().equals(id) && map1.get(keys).getPassword().equals(password)) {
				cList.remove(map1.get(keys));
				return true;
			}
		}
		return false;
	}
}