package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day9.Board;

public class BoardRepository {
	Map<String, BoardDTO> map1 = new HashMap<>();
	BoardDTO boardDTO = new BoardDTO();
	List<BoardDTO> board = new ArrayList<>();
	
	public boolean save(String bno,BoardDTO boardDTO) {
		map1.put(bno,boardDTO);
		board.add(map1.get(bno));
		return true;
		
	}
	
	public  Map<String, BoardDTO> findAll() {
		return map1;
	}
	
	public Map<String, BoardDTO> findById(String bno) {
		for(String b : map1.keySet() ) {
			if(b.equals(bno)) {
				return map1;
			}
		}
		return null;
	}
	public boolean update(BoardDTO boardDTO,String bno) {
		for(String b : map1.keySet()) {
			if(b.equals(bno)) {
				map1.get(bno).setTitle(boardDTO.getTitle());
				map1.get(bno).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}
	public boolean remove(String bno) {
		for(String b : map1.keySet()) {
			if(b.equals(bno)) {
				map1.remove(bno);
				return true;
			}
		}
		return false;
	}
	public boolean boardfinder(String writer) {
		for(String b : map1.keySet()) {
			if(map1.get(b).getWriter().equals(writer)) {
				System.out.println(map1.get(b));
				return true;
			}
		}
		return false;
	}
	
}
