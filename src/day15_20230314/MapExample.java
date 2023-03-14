package day15_20230314;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {  //map은 인덱스의 개념이 없다 . key,value가 있음 key를 기준으로 찾는다 key는 마음대로 지정할 수 있다! 
		                                      //key와 value는 한쌍이다 !!
		Map<Integer,String> map1 = new HashMap<>();        //HashMap이란 생성자를 사용한다  Integer = int 와 같다 //<Integer>은 Key를 위한 타임
		List<String> list1 = new ArrayList<>();
		String a = "안녕하세요";
		map1.put(1, "안녕하세요");
		int b = 0;
		map1.put(2, "이이이이");
		
		System.out.println(map1.get(1));
		
		if(a == map1.get(1)) {                                   //키로 가져오는 값은 참조변수로 가져온 주소값이 아닌가?  String a로 준 값과 ==으로 비교 했을 때 참이 나옴 why?
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		map1.remove(2);
		System.out.println(map1.get(2));
		
		for(int key : map1.keySet()) {
			System.out.println(key);
			System.out.println(map1.get(key));
		}
		
	}

}
