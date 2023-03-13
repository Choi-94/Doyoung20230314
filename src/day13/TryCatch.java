package day13;

public class TryCatch {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		try {
			int[] array = new int[5];
			System.out.println(array[5]);          //예외가 발생할 수 있는 문구 ==>예외가 발생하면 캐치로 들어감
		}catch(Exception e) {        				//예외가 없을경우 catch실행문구는 실행되지 않음
			System.out.println("인덱스 초과");			//예외가 발생하면 catch(1) 1번에 있는것을 확인하고 맞는 오류면 실행문구를 찍고
													//밑에있는 catch는 실행하지 않음
		}finally {
													//finally는 무조건 실행된다
		}
		System.out.println("프로그램 끝");
	}

}
