package day17_20230316;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClientService {
	private static ClientService service = new ClientService();      //싱글톤 패턴
	private ClientService() {}                            //접근제한
	public static ClientService getInstance() {
		return service;
	}
	private Scanner sc = new Scanner(System.in);
	private ClientRepository repository = ClientRepository.getInstance();
	private String loginId = null;
	private String loginPassword = null;
	
	
	public void save() {
		ClientDTO clientDTO = new ClientDTO();
		while(true) {
			System.out.print("Id> ");
			clientDTO.setId(sc.next());
			if(repository.idCheck(clientDTO.getId())) {
				break;
			}else {
				System.out.println("중복된 아이디입니다 다시입력주세요 ");
				System.out.println();
			}
//			if(repository.idCheck(clientDTO.getId()) {
//				System.out.println("사용 가능한 아이디 입니다");
//				break;
//			}else{
//				System.out.print("중본된 아이디입니다 다시 입력주세요> ");
//			}
		}
		System.out.print("password");
		clientDTO.setPassword(sc.next());
		System.out.print("name> ");
		clientDTO.setName(sc.next());
		String account = clientDTO.getAccount();
		repository.save(account,clientDTO);
		boolean check = repository.save(account, clientDTO);
		if(check) {
			System.out.println("회원가입성공");
		}else {
			System.out.println("회원가입실패");
		}
	}
	public boolean loginCheck() {
		System.out.print("id> ");
		String id = sc.next();
		System.out.print("password> ");
		String password = sc.next();
		
		if(repository.loginCheck(id,password)) {
			loginId = id;
			loginPassword = password;
			System.out.println("로그인 성공");
			return true;
		}else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	public void findAll() {
		Map<String, ClientDTO> map1 = repository.findAll();
		System.out.println("계좌번호\t\t아이디\t아이디\t비밀번호\t예금주\t잔액\t가입일");
		System.out.println("----------------------------------------------------------");
		List<String> keys = new ArrayList<>(map1.keySet());
		Collections.sort(keys);
		for(String key : keys) {
			System.out.println(map1.get(key));
		}
	}
	public void findById() {
		ClientDTO clientDTO = repository.findById(loginId,loginPassword);
		if(clientDTO == null) {
			System.out.println("로그인 오류");
		}else {
			System.out.println("계좌번호\t\t아이디\t아이디\t비밀번호\t예금주\t잔액\t가입일");
			System.out.println("----------------------------------------------------------");
			System.out.println(clientDTO);
			System.out.println("-----------------------------------------------------------");
			
			Map<String, BreakdownDTO> map = repository.breaklist(clientDTO.getAccount());
		
			if(map.size() == 0 ) {
				System.out.println("입출금 내역이 없습니다");
			}else {
				System.out.println("★입출금내역★");
				System.out.println("-----------------------------------------------------------");
				System.out.println("계좌번호\t구분\t거래금액\t거래후 잔액\t거래일");
				for(String key : map.keySet()) {
					System.out.println(map.get(key));
				}
			}
			
			System.out.println("-----------------------------------------------------------");
			
		}
		
	}
	
	public void deposit() {
		String account = repository.getAccount(loginId, loginPassword);
		if(account == null) {
			System.out.println("로그인 오류");
		}else {
			System.out.println("입금금액> ");
			long money = sc.nextLong();
			if(repository.deposit(account, money)) {
				System.out.println("입금 성공");
			}else {
				System.out.println("입금 실패");
			}
		}					
	}
	public void withdraw() {
		String account = repository.getAccount(loginId, loginPassword);
		if(account == null) {
			System.out.println("로그인 오휴");
		}else {
			System.out.print("출금금액> ");
			long money = sc.nextLong();
			if(repository.withdraw(account, money)) {
				System.out.println("출금성공");
			}else {
				System.out.println("출금실패");
			}
		}
	}
	
	public void logout() {
		loginId = null;
		loginPassword = null;		
		System.out.println("로그아웃");
	}
	public void transfer() {
		String account = repository.getAccount(loginId, loginPassword);
		if(account == null) {
			System.out.println("로그인 오류");
			return;
		}
		System.out.print("이체할 계좌번호> ");
		String transferAccount = sc.next();
		System.out.print("이체할 금액> ");
		long transferMoney = sc.nextLong();
		if(repository.transferCheck(transferAccount)) {
			if(repository.withdraw(account, transferMoney)) {
				if(repository.deposit(transferAccount, transferMoney)) {
					System.out.println("이체 성공");
				}
				
			}else {
				System.out.println("이체할 잔액부족");
			}
		}else {
			System.out.println("이체할 계좌번호가 없습니다");
		}
	}
	
	public void update() {
		System.out.print("비밀번호 확인> ");
		String password = sc.next();
		if(password.equals(loginPassword)) {
			System.out.println("수정할 비밀번호> ");
			String updatePassword = sc.next();
			if(repository.update(loginId, loginPassword, updatePassword)) {
				loginPassword = updatePassword;
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
			}
		}else {
			System.out.println("비밀번호가 일치하지 않습니다");
		}
	}
	public boolean delete() {
		if(repository.delete(loginId, loginPassword)) {
			System.out.println("삭제 성공");
			return false;
		}else {
			System.out.println("삭제 실패");
			return true;
		}
	}
	
}