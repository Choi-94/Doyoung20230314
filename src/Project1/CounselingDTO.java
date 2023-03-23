package Project1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CounselingDTO {
	
	private String name;
	private String phone;
	private String date;
	private String joindate;
	
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	public CounselingDTO() {
		this.joindate = DTF.format(LocalDateTime.now());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CounselingDTO [name=" + name + ", phone=" + phone + ", date=" + date + ", joindate=" + joindate + "]";
	}

	
}
