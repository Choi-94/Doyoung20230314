package day2;

public class 반복문_연습_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<10; i++) {
			if(i <= 3) {
				continue;
			}else if(i == 9) {
				break;
			}
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}     //continue는 밑에 있는 실행문을 건너뜀 , break는 묶여있는 실행문을 멈춤
	}

}
