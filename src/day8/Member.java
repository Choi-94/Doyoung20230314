package day8;

public class Member {
	private int id;
	private String email;
	private String pw;
	private String name;
	private String joindate;
	
	public Member() {
		
	}
	public Member(int id, String email,String pw, String name, String join) {
		this.id = id;
		this.email = email;
		this.pw = pw;
		this.name = name;
		this.joindate = join;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	
	public void print() {
		System.out.printf("%d\t%s\t%s\t%s\t%s\n",id,email,pw,name,joindate);
	}
	
}
