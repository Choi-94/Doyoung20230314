package day2;

public class 조건문_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		switch(a) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
			default:
				System.out.println("1~3까지 입력해주세요");
		}//case는 기본적으로 break; 가 있어야한다 default는 else와 같다
	}    //String aa = "하세요" --> case "하세요" 가 되어야한다. 같은 스트링으로 잡아야한다

}
