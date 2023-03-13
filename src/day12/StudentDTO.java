package day12;

public class StudentDTO {
	private static int number = 100;
	private String sno;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private char grade;

	public StudentDTO() {
		this.sno = "S"+number++;
	}
	public String getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		this.total = kor+eng+mat;
		this.avg = total/(double)3;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		this.total = kor+eng+mat;
		this.avg = total/(double)3;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		this.total = kor+eng+mat;
		this.avg = total/(double)3;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}

	public char getGrade() {
		return grade;
	}
	public void setGrade() {
		if(avg >= 90) {
			this.grade = 'A';		
		}else if(avg >= 80) {
			this.grade = 'B';
		}else if(avg >= 70) {
			this.grade = 'C';
		}else if(avg >= 60) {
			this.grade = 'D';
		}else {
			this.grade = 'F';
		}
	}
	@Override
	public String toString() {
		String str = sno+"/"+name+"/"+kor+"/"+eng+"/"+mat+"/"+total+"/"+avg+"/"+grade;
		return str;
	}
	
}
