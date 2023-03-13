package day10;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();
		f.name = "사과";
		f.isSeed = true;
		
		f.removeSeed();
		
		System.out.println(f.name+"/"+f.isSeed);
		Fruit2 f2 = new Fruit();
	}
}
class Fruit{
	String name;
	boolean isSeed;
	String color;
	
	public void removeSeed() {
		isSeed = false;
	}
	
}
class Fruit2 extends Fruit{
	String name;
	boolean isSeed;
	String color;
	
	public void removeSeed() {
		isSeed = false;
	}
	public void calorChange(String color) {
		this.color = color;
	}

}

