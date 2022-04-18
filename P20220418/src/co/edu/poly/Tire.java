package co.edu.poly;

public class Tire {
	public int maxRotation;
	public int accumulateRotation;
	public String location;

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Tire수명 " + (maxRotation-accumulateRotation) + "회 사용가능합니다.");
			return true;
		}else {
			System.out.println("***" + location + "Trie 펑크 ***");
			return false;
		}
	}

	public int getMaxRotation() {
		return maxRotation;
	}

	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}

	public int getAccumulateRotation() {
		return accumulateRotation;
	}

	public void setAccumulateRotation(int accumulateRotation) {
		this.accumulateRotation = accumulateRotation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
