package Project1;

import java.util.List;
import java.util.Scanner;

public class CounselingService {
	private static CounselingService service = new CounselingService();
	
	private CounselingService() {

	}
	public static CounselingService getInstance() {
		return service;
	}

	
	private Scanner sc = new Scanner(System.in);
	private CounselingRepository Corepository = CounselingRepository.getInstance();
	
	public void Counselingsave() {
		CounselingDTO counselingDTO = new CounselingDTO();
		System.out.print("상담 받으실 성함을 입력하세요> ");
		counselingDTO.setName(sc.next());
		System.out.print("연락 받으실 휴대폰 번호를 입력하세요>  ex)010-0000-0000 ");
		counselingDTO.setPhone(sc.next());
		System.out.println("원하시는 날짜와 시간을 적어주세요>  ex)00월00일 00시");
		counselingDTO.setDate(sc.next());
		boolean success = Corepository.save(counselingDTO);
		if(success) {
			System.out.println("감사합니다 원하시는 시간에 상담연락 드리겠습니다");
		}else{
			System.out.println("죄송합니다 다시 상담신청 부탁드립니다");
		}
	}
	
	public void Counselingfind() {
		List<CounselingDTO> list = Corepository.Counselingfind();
		System.out.println("\t\t이름\t\t폰번호\t\t신청한시간");
		System.out.println("----------------------------------");
		System.out.println(list.toString());
	}
	
}
