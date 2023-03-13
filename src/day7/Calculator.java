package day7;

public class Calculator {
	int num1;
	int num2;


	// 문제
	// 접근제한자:public
	// 리턴타입:없음
	// 메소드명 : sum
	/// 매개변수 :없음
	// 실행문구 : 필드 두개를 더한값 출력
	public void sum() {
		System.out.println(num1 + num2 + "은 필드 두 개를 더한 값 출력");
	}

	// 문제
	// 접근제한자:public
	// 리턴타입:없음
	// 메소드명 : sub
	// 매개변수:int 두개
    // 실행문구 : 필드 두개를 뺸 값 출력
	public void sub(int n1, int n2) {
		System.out.println(n1-n2);
		
	}

	// 문제
	// 접근제한자:public
	// 리턴타입: int
	// 메소드명 : mul
	/// 매개변수: 없음
	// 실행문구 : 필드 두개를 곱한값 출력
	    public int mul(){
		return num1*num2;
	}
	
	//문제
	//접근제한자:public
	//리턴타입: ?
	//메소드명 : diy
	///매개변수: int 두개
	//실행문구 : 필드 두개를 나눈값 출력
	public double diy(int n1, int n2) {
		return n1 / (double)n2;		
	}
}
