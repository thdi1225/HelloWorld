package co.edu.inherit;

public class Taxi extends Car{
	String type;
	
	public Taxi() {
		System.out.println("Taxi() 생성자 호출"); 
	}
	
	public void metering() {
		System.out.println("요금 계기판");
	}
	
	@Override
	public void drive() {
		System.out.println("택시가 운행을 합니다.");
	}
	
	@Override
	public String toString() {
		return "택시의 종류는 " + type + "입니다.";
	}
	
}
