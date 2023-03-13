package day2;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0; j<10; j++) {
		
			for(int i=2; i<10; i++) {
				if(j==0) {
					System.out.print(i+"단\t\t");
				}else {
					System.out.printf("%d * %d = %d\t" , i , j , (j*i));
				}
			
			}
			System.out.println();
		
		//		for (int j = 0; j <= 9; j++) {
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %d\t", i, j, (j * i));
//			} 
//			System.out.println();
//			
//			
			 

//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			if(i == 5) {
//				break;
//			}
//		}
//		System.out.println("끝");
//	}

	 }
 }
}
