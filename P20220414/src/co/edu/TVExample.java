package co.edu;

public class TVExample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		
		Television tv = new Television();
		tv.color = "검은색";
		tv.company = "삼성";
		tv.model = "30Inch";
		tv.price = 300000;
		
		tv.turnOn();
		tv.changeChanel(num);
		tv.turnOff();

		Television tv1 = new Television();
		tv.color = "하얀색";
		tv.company = "엘지";
		tv.model = "32Inch";
		tv.price = 350000;
		
		tv.turnOn();
		tv.changeChanel(num);
		tv.turnOff();
		
		System.out.println(tv);
		System.out.println(tv1);
	}
}
