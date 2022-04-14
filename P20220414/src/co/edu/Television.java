package co.edu;
//추상화(텔레비전의 모든 속성 -> 필요한 부분의 속성)
public class Television {
	String company;
	String model;
	int price;
	String color;
	
	// 기능. -> 메소드( 반환유형 메소드명(매개변수){...} )
	void turnOn(){
		System.out.println("텔레비전을 켭니다.");
	}
	
	void turnOff(){
		System.out.println("텔레비전을 끕니다.");
	}
	
	void changeChanel(int chanel){
		System.out.println(chanel +"번 채널로 변경합니다.");
	}
}
