package Project1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarDTO {
	//(받을것: 번호, 색상, 종류, 년식 ,판매가격)**차량고유식별 넘버는 자동적으로 등록
	// * 한 아이디로 여러대를 등록가능 **조회수 cnt++
	
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String CarNum;
	private String Color;
	private String Model;
	private int Productionyear;
	private int price;
	private String regoDate;
	
	
	public CarDTO() {
		this.regoDate = DTF.format(LocalDateTime.now());
	}

	public String getCarNum() {
		return CarNum;
	}

	public void setCarNum(String carNum) {
		CarNum = carNum;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getProductionyear() {
		return Productionyear+"년식";
	}

	public void setProductionyear(int productionyear) {
		Productionyear = productionyear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarDTO [CarNum=" + CarNum + ", Model=" + Model + ", Productionyear=" + Productionyear + ", Color="
				+ Color + ", price=" + price + ", regoDate=" + regoDate + "]";
	}
	
}
