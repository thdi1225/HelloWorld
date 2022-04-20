package co.edu.collection;

// 친구 주소록 : 이름, 연락처
// 학교친구 : 학교친구, 전공과목
// 회사친구 : 회사이름, 부서
public class Friend {
	private String name;
	private String phone;
	
	protected Friend() {
		
	}
	
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	
}
