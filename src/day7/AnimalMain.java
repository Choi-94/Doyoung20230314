package day7;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.test="테스트 입니다";
		Animal dog = new Animal();
		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setLeg(4);
		System.out.println(dog.getName()+"/"+dog.getSound()+"/"+dog.getLeg());
		
		Animal cat = new Animal();
		cat.setName("고양이");
		cat.setSound("야용");
		cat.setLeg(4);
		System.out.println(cat.getName()+"/"+cat.getSound()+"/"+cat.getLeg());
		
		Animal chicken = new Animal();
		chicken.setName("닭");
		chicken.setSound("꼬꼬닥");
		chicken.setLeg(2);
		chicken.print();
		
		Animal elephant = new Animal();
		elephant.setName("코끼리");
		elephant.setSound("뿌우우");
		elephant.setLeg(4);
		elephant.setAge(8);
		elephant.print();
		System.out.println("코끼리나이:"+elephant.getAge());
		
		
		
	}

}
