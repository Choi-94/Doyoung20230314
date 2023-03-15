package day11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class BoardService {
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);

	
	public void save() {
		BoardDTO boardDTO = new BoardDTO();
		System.out.print("제목> ");
		boardDTO.setTitle(sc.nextLine());
		System.out.print("작성자> ");
		boardDTO.setWriter(sc.next());
		sc.nextLine();
		String bno = boardDTO.getBno();
		boolean success = br.save(bno, boardDTO);
		if(success) {
			System.out.println("게시글 등록완료!");
		}else {
			System.out.println("게시글 등록실패ㅜ");
		}
	}
	public void findAll() {
		Map<String, BoardDTO> map1 = br.findAll();
		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
		System.out.println("--------------------------------------");
		for(String b : map1.keySet()){
			System.out.println(map1.get(b));
		}
	
	}	
	public void findById() {
		System.out.print("읽을 글번호> ");
		String bno = sc.next();
		Map<String, BoardDTO> map1 = br.findById(bno);
		if(map1 == null) {
			System.out.println("찾을 수 없는 글입니다");
		}else {
			map1.get(bno).increaseCnt();
			System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
			System.out.println("--------------------------------------");
			System.out.println(map1.get(bno).toString());
					
		}
	}
	public void update() {
		System.out.println("수정할 글번호> ");
		String bno = sc.next();
		Map<String, BoardDTO> map1 = br.findById(bno);
		if(map1 == null) {
			System.out.println("조회할 수 없는 글번호 입니다");
		}else {
			BoardDTO boardDTO = new BoardDTO();
			System.out.println("수정할 제목> ");
			boardDTO.setTitle(sc.next());
			System.out.println("수정할 작성자> ");
			boardDTO.setWriter(sc.next());
			sc.nextLine();
			br.update(boardDTO,bno);
			if(br.update(boardDTO, bno)) {
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
			}
		
			
		}
	}
	
	public void remove() {
		System.out.println("삭제할 글번호> ");
		String bno = sc.next();sc.nextLine();
		if(br.remove(bno)) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제실패");
		}
	}
	
	public void boardfinder() {
		System.out.print("검색할 작성자> ");
		String writer = sc.nextLine();
		br.boardfinder(writer);
		System.out.println("검색 성공!");
	}
}

//메스도를 빠져나가는 방법은 return이다