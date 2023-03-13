package day10_2;

public class Student extends Person{
	private static int number = 100;
	
	private String sno;
	private String tname;
	private double avg;
	private String dept;
	
	public Student() {
		this.sno = "s"+number++;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print() {
		System.out.printf("%s\t%s\t%c\t%s\t%s\t%s\t%f\t%s\n",getId(),getName(),getGender(),getBirthday(),sno,tname,avg,dept);
	}
}
