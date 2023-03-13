package day1;

public class 타입_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double b = a;
		double c = 10.3;
		int d = (int)c;

	}
//타입변환에는 두 가지가 있다 (자동타입변환,강제타입변환)
	//byte<short<int<long<float<double (자동형변환 double b = a;)
	// int d = (int)c; 큰것은 작은것으로 강제 변환 (작은것을 앞에 써준다 << 강제형변환)
}
