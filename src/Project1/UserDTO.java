package Project1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private static int Number = 100;
	
	
	private String uno;
	private String id;
	private String password;
	private String name;
	private String nickname;
	private String joinDate;
	
	
	
	public UserDTO() {
		this.uno = "C"+Number++;
		this.joinDate = DTF.format(LocalDateTime.now());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "UserDTO [uno=" + uno + ", name=" + name + ",Id ="+ id + ",nickname=" + nickname + ", joinDate=" + joinDate + "]";
	}
}
