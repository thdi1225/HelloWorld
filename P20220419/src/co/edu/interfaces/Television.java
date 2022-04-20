package co.edu.interfaces;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV의 볼륨을 올립니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV의 볼륨을 내립니다.");
	}

}
