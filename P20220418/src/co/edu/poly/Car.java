package co.edu.poly;

public class Car {
	Tire frontLeft = new Tire(6, "앞 왼쪽");
	Tire frontRight = new Tire(2, "앞 오른쪽");
	Tire backLeft = new Tire(3, "뒤 왼쪽");
	Tire backRight = new Tire(4, "뒤 오른쪽");
	
	public int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeft.roll() == false) {
			stop();
			return 1;
		}else if(frontRight.roll() == false) {
			stop();
			return 2;
		}else if(backLeft.roll() == false) {
			stop();
			return 3;
		}else if(backRight.roll() == false) {
			stop();
			return 4;			
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
