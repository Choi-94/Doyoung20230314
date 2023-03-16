package day11;

import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day9.Board;

public class BoardRepository {
	Map<String, BoardDTO> map1 = new HashMap<>();
	BoardDTO boardDTO = new BoardDTO();

	public boolean save(String bno, BoardDTO boardDTO) {
		map1.put(bno, boardDTO);
		return true;

	}

	public Map<String, BoardDTO> findAll() {
		List<String> keys = new ArrayList<>(map1.keySet());
		Collections.sort(keys);
		for (String key : keys) {
			System.out.println(String.format("Key : %s, Value : %s", key, map1.get(key)));
		}

		return map1;

	}

	public Map<String, BoardDTO> findById(String bno) {
		for (String b : map1.keySet()) {
			if (b.equals(bno)) {
				return map1;
			}
		}
		return null;
	}

	public boolean update(BoardDTO boardDTO, String bno) {
		for (String b : map1.keySet()) {
			if (b.equals(bno)) {
				map1.get(bno).setTitle(boardDTO.getTitle());
				map1.get(bno).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}

	public boolean remove(String bno) {
		for (String b : map1.keySet()) {
			if (b.equals(bno)) {
				map1.remove(bno);
				return true;
			}
		}
		return false;
	}

	public Map<String, BoardDTO> boardfinder(String writer) {
		List<String> keys = new ArrayList<>(map1.keySet());
		Collections.sort(keys);
		for (String key : keys) {
			if (map1.get(key).getWriter().equals(writer))
				System.out.println(String.format("Key : %s, Value : %s", key, map1.get(key)));
		}

		return map1;

	}

}
