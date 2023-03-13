package day10;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv2 tv2 = new Tv2();
		tv2.power = true;
		tv2.channel = 10;
		tv2.volum = 20;
		tv2.power();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumdown();
		tv2.volumdown();
		
	}

}
class Tv{
	boolean power;
	int channel;
	
	public void power() {
		this.power = !power;
	}
	public void channelUp() {
		this.channel++;		
	}
	public void channelDown() {
		this.channel--;
	}
}

class Tv2 extends Tv{
	int volum;
	
	public void volumup() {
		volum++;
	}
	public void volumdown() {
		volum--;
	}
}