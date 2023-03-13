package day5;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "홀길동";
		String name2 = "이순신";
		String name3 = "심청이";
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		String[] name = new String[3]; //문자열이 들어갈 수 있는 배열3칸 만들기
		//int[] i = {34, 4 , 3, 7, 114, 38 , 55, 36, 61, 77}; 배열을 만들면서 초기화 <--배열을 만들때만 가능!
		int[] i = new int[10];  // 정수가 들어갈 수 있는 배열 10칸 만들기
		
		i[0] = 34;
		i[1] = 4;
		i[2] = 3;
		i[3] = 7;
		i[4] = 114;
		i[5] = 38;
		i[6] = 55;
		i[7] = 36;
		i[8] = 61;
		i[9] = 77;
		for(int j=0; j<i.length; j++) {    //i.length = j<10
			System.out.println(i[j]);
		}
//		name[0] = "배열홍길동";
//		name[1]	= "배열이순긴";
//		name[2] = "배열심청이";
//		
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
	}

}
