package co.edu.friend;

// 친구 주소록 : 이름, 연락처
// 학교친구 : 학교친구, 전공과목
// 회사친구 : 회사이름, 부서
public class UnivFriend extends Friend {
	private String company;
	private String department;
	
	public UnivFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "UnivFriend [name= " + super.getName() + ", phone = " + super.getPhone() + ", company=" + company + ", department=" + department + "]";
	}

}
