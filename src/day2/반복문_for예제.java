package day2;

public class 반복문_for예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = 6;
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		//1~100까지의 합을 출력
		/*int sum = 0;
		for(int i=2; i<=100; i=i+2) {
			sum = sum+i;
		}
		System.out.println(sum);*/

		
//		for(int i=1; i<=100; i++) {
//			System.out.println(sum=sum+i); //내가 틀린 예시
//		}
//		
		//1~10까지 가로로 출력
		/*for(int i=1; i<=10; i++) {
			System.out.print(i+"\t");
			
//			System.out.print(i);  // (\t는 탭) (\n는 줄바꿈)
		}System.out.println("\n안 \t녕");*/
	}

}
