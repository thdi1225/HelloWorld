package co.edu.collection;

// 친구 주소록 : 이름, 연락처
// 학교친구 : 학교친구, 전공과목
// 회사친구 : 회사이름, 부서
public class Friend {
	private String name;
	private String phone;
	private Gender gender;
	
	protected Friend() {
		
	}
	
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public Friend(String name, String phone, Gender gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", gender=" + gender + "]";
	}

	
}
