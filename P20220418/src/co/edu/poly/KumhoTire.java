package co.edu.poly;

public class KumhoTire extends Tire{

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " 금호 Tire수명 " + (maxRotation-accumulateRotation) + "회 사용가능합니다.");
			return true;
		}else {
			System.out.println("***" + location + "금호 Trie 펑크 ***");
			return false;
		}
	}
	
	
}
