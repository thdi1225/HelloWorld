package co.edu.inherit;

public class Bus extends Car {
	String busNo;
	
	public Bus() {
		super(); // 부모와 자식의 관계 super => 부모.
		System.out.println("Bus() 생성자 호출");
	}
	
	public void fee() {
		System.out.println("요금을 받습니다.");
	}
	
	@Override
	public void drive() {
		System.out.println("버스가 운행을 합니다.");
	}
	
	@Override
	public String toString() {
		return "종류는 "+ super.model +"이고 버스의 번호는 " + busNo + "입니다.";
	}
}
