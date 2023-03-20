package day19_20230320;

public class InheritanceMain {

	public static void main(String[] args) {
		//부모 객체
		ParentClass p1 = new ParentClass();
		p1.name = "name1";
		System.out.println(p1.name);
		p1.hello();
		
		//자식 객체
		ChildClass c1 = new ChildClass();
		c1.name = "자식 name1";
		System.out.println(c1.name);
		c1.hello();
		
		ChildClass c2 = new ParentClass();
		ParentClass p2 = new ChildClass();  //형변환과 같은 타입 부모객체가 데이터가 더 크기때문에 위에는 안되고 아래는 되는 것!
	}

}
