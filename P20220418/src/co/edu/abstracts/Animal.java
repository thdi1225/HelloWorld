package co.edu.abstracts;

public abstract class Animal {
// Animal 클래스의 생성자로 인스턴스 생성 X.
	
	public Animal() {
		
	}
	
	public abstract void eat(); // 강제로 eat()을 하위 클래스에서 구현하도록.
	public abstract void run();
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}
}
