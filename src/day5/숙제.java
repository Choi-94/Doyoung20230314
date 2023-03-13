package day5;

public class 숙제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제) 배열 num의 값을 앞으로 한칸씩 당기시오
		int[] num = { 5,15,17,51,61,11,15,14,8,7 };
		int temp = num[0];
		for (int i = 0; i < num.length; i++) {
			if(i<num.length-1) {                    //if(1 ==num.length-1){
				                             //num[i] = temp;
					num[i] = num[i + 1];       //break;
			}else {		                           //} num[i]=num[i+1]
				num[9]=temp;
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
