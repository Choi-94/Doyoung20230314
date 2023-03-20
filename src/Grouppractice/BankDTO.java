package Grouppractice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd  hh:mm:ss");
	
	private String name;
	private String id;
	private String password;
	private String purpose;
	private int balance;
	private String account;
	private String joindate;
	
	

	public BankDTO() {
		
		this.joindate = DTF.format(LocalDateTime.now());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	
}
