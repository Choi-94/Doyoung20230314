package Project1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private static int Number = 100;
	
	private String Uno;
	private String id;
	private String password;
	private String name;
	private String nickname;
	private String joinDate;
	
	
	public UserDTO() {
		this.Uno = "C"+Number++;
		this.joinDate = DTF.format(LocalDateTime.now());
	}
	
	
}
