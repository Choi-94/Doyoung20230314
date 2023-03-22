package Project1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import day19_20230320.ParentClass;

public class CarDTO extends UserDTO {
	//(받을것: 번호, 색상, 종류, 년식 ,판매가격)**차량고유식별 넘버는 자동적으로 등록
	// * 한 아이디로 여러대를 등록가능 **조회수 cnt++           public class ChildClass extends ParentClass
	
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private static int number = 0;
	private static int bnonumber = 1000;
	
	private String bno;
	private String carNum;
	private String color;
	private String model;
	private int productionyear;
	private int price;
	private String regoDate;
	static int event;

	
	public CarDTO() {
		this.regoDate = DTF.format(LocalDateTime.now());
		event = ++number;
		this.bno = "Car"+bnonumber++;
	}

	public String getBno() {
		return bno;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getProductionyear() {
		return productionyear;
	}

	public void setProductionyear(int productionyear) {
		this.productionyear = productionyear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	static int getEvent() {
		return event;
	}
	@Override
	public String toString() {
		return "CarDTO [NickName="+getNickname()+"CarBno="+ bno + ",CarNum=" + carNum + ", Model=" + model + ", Productionyear=" + productionyear+"년식" + ", Color="
				+ color + ", price=" + price + ", regoDate=" + regoDate + "]"+"\n";
	}
	
}
