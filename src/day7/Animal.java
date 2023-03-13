package day7;

public class Animal {
	String test;
	private String name;   //private 는 외부의 접근을 막아야할때 오직 메소드를 통해 접근할 수 있게
	private String sound;
	private int leg;
	private int age;
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() { 
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void getUp() {
		System.out.println("나이를 한살 먹었습니다");
		age += 1;
	}
	
	public void print() {
		System.out.printf("다리가 %d개인 %s는 %s웁니다\n",leg,name,sound);
	}
}
