package Project1;

import java.util.ArrayList;
import java.util.List;

public class CounselingRepository {

	private static CounselingRepository repository = new CounselingRepository();

	private CounselingRepository() {
	}

	public static CounselingRepository getInstance() {
		return repository;
	}
	
	private List<CounselingDTO> list = new ArrayList<>();
	
	
	public boolean save(CounselingDTO counselingDTO) {
		boolean a = list.add(counselingDTO);
		return a;
	}

}
