package day17_20230316;

public class SchoolDTO {
	
	private static int number = 100;
	
	private String studentName;
	private String studentNumber;
	private int Kor;
	private int Eng;
	private int Mat;
	private int total;
	private char grade;
	private double avg;
	

	public SchoolDTO() {
		this.studentNumber = "S"+number++;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
		total = kor+Eng+Mat;
		avg = (double)(kor+Eng+Mat)/3;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
		total = Kor+eng+Mat;
		avg = (double)(Kor+eng+Mat)/3;
	}
	public int getMat() {
		return Mat;
	}
	public void setMat(int mat) {
		Mat = mat;
		total = Kor+Eng+mat;
		avg = (double)(Kor+Eng+mat)/3;
	}
	public int getTotal() {
		return total;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade() {
		if(avg>=90) {
			grade = 'A';			
		}
		if(avg>=80) {
			grade = 'B';
		}
		if(avg>=70) {
			grade = 'C';
		}
		if(avg>=60) {
			grade = 'D';
		}
		if(avg<60) {
			grade = 'F';
		}
	}
	public double getAvg() {
		return avg;
	}
	
	public void print() {
		
	}

	@Override
	public String toString() {
		return "SchoolDTO [studentNumber=" + studentNumber + ", Kor=" + Kor + ", Eng=" + Eng + ", Mat=" + Mat
				+ ", grade=" + grade + ", avg=" + avg + "]";
	}
	
	
}
