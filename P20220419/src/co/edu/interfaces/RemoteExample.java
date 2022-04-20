package co.edu.interfaces;

public class RemoteExample {
	public static void main(String[] args) {
		// 상속관계에서 부모클래스의 참조변수 자식클래스의 인스턴스가 할당.
		RemoteControl remoteControl = null;
		
		remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		remoteControl.volumeUp();
		remoteControl.volumeDown();
		remoteControl.adjustScreen();
		
		remoteControl = new Audio();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		remoteControl.volumeUp();
		remoteControl.volumeDown();
		
		RemoteControl.changeBattery();
	}
}
