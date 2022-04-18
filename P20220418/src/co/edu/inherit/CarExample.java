package co.edu.inherit;

public class CarExample {
	public static void main(String[] args) {
		Bus bus = new Bus();
		
		bus.model = "45인승 버스";
		bus.drive();
		
		bus.busNo = "240";
		bus.fee();
		
		Taxi taxi = new Taxi();
		taxi.model = "SonataTaxi";
		taxi.drive();
		
		taxi.type = "개인택시";
		taxi.metering();
		
		//자식클래스의 인스턴스 => 부모 참조변수 할당가능.
		Bus[] buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];
		
		Car[] cars = new Car[10];
		cars[0] = bus; // 자동형변환
		cars[1] = taxi; // 자동형변환
		System.out.println(bus.toString());
		System.out.println(taxi.toString());
	}
}
