package co.edu;

public class Member {
	private String memberId;
	private String memberName;
	private String memberPhone;
	private int memberAge;
	
	
	
	public Member(String memberId, String memberName, String memberPhone, int memberAge) {
		super();
		if(memberAge >= 0) {
			this.memberId = memberId;
			this.memberName = memberName;
			this.memberPhone = memberPhone;
			this.memberAge = memberAge;	
		}else {
			System.out.println("나이가 0살보다 작을 수 없습니다.");
		}
		
	}
	
	void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	String getMemberId() {
		return memberId;
	}
	
	int getMemberAge() {
		return memberAge;
	}
	
	void setMemberAge(int age) {
		if(age >= 0) {
			this.memberAge = age;
		}else {
			this.memberAge = 10;
		}
	}
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	void showInfo() {
		System.out.printf("회원이름 %s \n연락처 %s \n나이 %d", memberName, memberPhone, memberAge);
	}
}
