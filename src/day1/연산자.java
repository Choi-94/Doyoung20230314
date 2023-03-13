package day1;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
//		System.out.println(a > b);
//		System.out.println(a >= b);
//		System.out.println(a < b);
//		System.out.println(a <= b);
//		System.out.println(a == b);
//		System.out.println(a != b);
//		!= << 같지 않으냐
		
		int c = 3;
		System.out.println(a > b && a > c);
		System.out.println(a < b && a < c);
		System.out.println(a < b && a == c);
		System.out.println(a > b || a > c);
		System.out.println(a > b || b < c); 
		
		//&& << and , || << or , ! << 부정하는거
	}

}
//대입이 가장 늦게 온다