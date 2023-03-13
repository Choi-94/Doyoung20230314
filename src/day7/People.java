package day7;

public class People {
	private String name;
	private int age;
	
	public People() {
	}
		public People(String name) {
			this.name = name;
	}
		public People(String name, int age) {
			this.name = name;
			this.age = age;
	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void print() {
			System.out.printf("%s의 나이는 %d입니다\n",name ,age);
		}
		public void upAge() {
			this.age++ ;
		}
		public void upAge2(int i) {
			this.age = age+i; 
		}
		public void upAge3() {
			this.age = age*2; 
		}
		public void upAge4(String o,int num) {
			if(o.equals("+")) {
				this.age = age+num;
			}else if(o.equals("-")) {
				this.age = age-num;
			}else if(o.equals("*")) {
				this.age = age*num;
			}else if(o.equals("/")) {
				this.age = age/num;
			}
		}
	//생성자 만들기
	//1. 기본생성자
	//2.매개변수(String)생성자
	//3.매개변수(String,int)생성자
	
	//메소드 만들기
	//1. name의 get,set메소드
	//2. age의 get,set 메소드
}
