package co.edu.poly;

public class HankookTire extends Tire{
	
	public HankookTire(int maxRotation, String localtion) {
		super(maxRotation, localtion);
	}

	@Override
	public boolean roll() {
		// accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " 한국 Tire수명 " + (maxRotation-accumulateRotation) + "회 사용가능합니다.");
			return true;
		}else {
			System.out.println("***" + location + "한국 Trie 펑크 ***");
			return false;
		}
	}
	
}