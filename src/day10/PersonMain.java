package day10;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("홍길동",99,false);
		Student s = new Student("홍길동",99,false,"5100");
	}
}
class Person{
	String name;
	int age;
	boolean isFull;
	
	public Person() {
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, boolean isFull) {
		this(name,age);	
		this.isFull = isFull;
	}
}
class Student extends Person{         //extends 상속받는개념
	String sno;
	public Student() {
		super("");
	}
	public Student(String name, int age, boolean isFull, String sno) {
		super(name,age,isFull);   //super은 자기의 부모
		this.sno = sno;   //this 자기자신
	}
}
