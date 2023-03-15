package day15_20230314;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(StudentMajor, StudentMobile, StudentName, StudentNumber);
	}

	@Override
	public boolean equals(Object obj) {        //객체 1과 객체 2랑 값이 같을 때 해쉬코드를 사용 안하면 false가 나온다 hashcode랑 equals를 사용하면 True가 나온다  **두 객체의 필드값이 모두 일치하는지 판단하려면 hashcode(),equals() 매서드를 재정의하자!
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(StudentMajor, other.StudentMajor) && Objects.equals(StudentMobile, other.StudentMobile)
				&& Objects.equals(StudentName, other.StudentName) && StudentNumber == other.StudentNumber;
	}		
	
	
	
	
}
