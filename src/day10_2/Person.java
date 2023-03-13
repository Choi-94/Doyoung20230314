package day10_2;

public class Person {
	private static int number = 10000;
	
	private String id; // 맨뒤에 한 숫자는 0~9까지 랜덤숫자
	private String name;
	private char gender;
	private String birthday;
	
	public String getId() {
		return id;
	}
	public void setId() {
		if(!(gender == 0 || birthday == null)) {
			int firstNo = (gender == 'M')? 1 : 2;       //삼항 연산자  (조건식)? 참 : 거짓
			int random = ((int)Math.random()*9)+1;
			this.id = birthday+"-"+firstNo+number++ + random;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	
}
