package day15_20230314;

public class StudentDTO {
	
	private int StudentNumber;
	private String StudentName;
	private String StudentMajor;
	private String StudentMobile;
	public int getStudentNumber() {
		return StudentNumber;
	}
	
	public void setStudentNumber(int studentNumber) {
		StudentNumber = studentNumber;
	}

	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentMajor() {
		return StudentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		StudentMajor = studentMajor;
	}
	public String getStudentMobile() {
		return StudentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		StudentMobile = studentMobile;
	}
	
	@Override
	public String toString() {
		String str = StudentNumber+"\t"+StudentName+"\t"+StudentMajor+"\t"+StudentMobile;
		return str;
	}		
	
}
