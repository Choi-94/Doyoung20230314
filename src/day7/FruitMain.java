package day7;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit();	
		apple.setName("사과");
		
		apple.color = "빨강";
		apple.isSeed = true;
		System.out.println(apple.getName()+apple.color+apple.isSeed);
		
		Fruit apple1 = new Fruit("사과","빨강", true);
		System.out.println(apple1.getName()+apple1.color+apple1.isSeed);
		
		
		Fruit melon = new Fruit("멜론","초록", false);
		System.out.println(melon.getName()+melon.color+melon.isSeed);
		
		Fruit orange = new Fruit();
		orange.setName("오렌지");
		orange.color = "주황색";
		orange.isSeed = false;
		
		
//		Fruit banana = new Fruit();
//		banana.name = "바나나";
//		banana.color = "노랑";
//		banana.isSeed = false;
		
	}

}
