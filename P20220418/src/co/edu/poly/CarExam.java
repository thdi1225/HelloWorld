package co.edu.poly;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i < 10; i++) {
			int problemLocation = car.run();
			switch(problemLocation){
				case 0 :
				break;
				case 1 : 
					System.out.println("앞 왼쪽 재생타이어를 교채합니다.");
					car.frontLeft = new Tire(3, "앞 왼쪽");
				break;
				case 2 : 
					System.out.println("앞 오른쪽 중고타이어를 교채합니다.");
					car.frontRight = new Tire(2, "앞 오른쪽");
				break;
				case 3 : 
					System.out.println("뒤 왼쪽 한국타이어를 교채합니다.");
					car.backLeft = new HankookTire(12, "뒤 왼쪽");
				break;
				case 4 : 
					System.out.println("뒤 오른쪽 금호타이어를 교채합니다.");
					car.backRight = new Tire(15, "뒤 오른쪽");
				break;
			}
			System.out.println("--------------------------------------------");		
		}
	}
}