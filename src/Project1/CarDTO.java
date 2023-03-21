package Project1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import day19_20230320.ParentClass;

public class CarDTO extends UserDTO {
	//(받을것: 번호, 색상, 종류, 년식 ,판매가격)**차량고유식별 넘버는 자동적으로 등록
	// * 한 아이디로 여러대를 등록가능 **조회수 cnt++           public class ChildClass extends ParentClass
	
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String carNum;
	private String color;
	private String model;
	private int productionyear;
	private int price;
	private String regoDate;
	
	
	public CarDTO() {
		this.regoDate = DTF.format(LocalDateTime.now());
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

	public String getProductionyear() {
		return productionyear+"년식";
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

	@Override
	public String toString() {
		return "CarDTO [CarNum=" + carNum + ", Model=" + model + ", Productionyear=" + productionyear + ", Color="
				+ color + ", price=" + price + ", regoDate=" + regoDate + "]";
	}
	
}
