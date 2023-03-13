package day7;

public class Board {
	private long no;
	private String title;
	private int cnt;
	private boolean open;
	
	public Board() {
		System.out.println("기본생성자");
	}
	
	public Board(String title,int cnt,boolean open) {
		this.title = title;
		this.cnt = cnt;
		this.open = open;
	}
	
	public int cntUp() {
		this.cnt++;
		return cnt;
	}
	public void togleOpen() {
		open = !open;
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	
	//생성자
	//1.기본생성자
	//2.전체 다 매개변수 생성자
	
	//메소드
	//1.cnt(조회수) 1씩 올리기 메소드
	//2.open(공개/비공개) 변경 메소드
	//3.전체 get/set 메소드
	
}
