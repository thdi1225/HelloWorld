package co.edu.friend;

// 친구 주소록 : 이름, 연락처
// 학교친구 : 학교친구, 전공과목
// 회사친구 : 회사이름, 부서
public class ComFriend extends Friend {
	private String univ;
	private String major;
	
	public ComFriend() {
		super();
	}
	
	public ComFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "ComFriend [name= " + super.getName() + ", phone = " + super.getPhone() + ", univ=" + univ + ", major=" + major + "]";
	}
	
}
