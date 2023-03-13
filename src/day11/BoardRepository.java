package day11;

import java.util.ArrayList;
import java.util.List;

import day9.Board;

public class BoardRepository {
	private List<BoardDTO> list = new ArrayList<>();
	
	public boolean save(BoardDTO boardDTO) {
		return list.add(boardDTO);
	}
	
	public List<BoardDTO> findAll(){
		return list;
	}
	public BoardDTO findById(String bno) {
		for(BoardDTO b : list) {
			if(b.getBno().equals(bno)) {
				return b;
			}
		}
		return null;
	}
	public boolean update(BoardDTO boardDTO,String bno) {
		for(BoardDTO b : list) {
			if(b.getBno().equals(bno)) {
				b.setTitle(boardDTO.getTitle());
				b.setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}
	public boolean delete(String bno) {
		for(BoardDTO b : list) {
			if(b.getBno().equals(bno)) {
				list.remove(b);
				return true;
			}
		}
		return false;
	}
}
