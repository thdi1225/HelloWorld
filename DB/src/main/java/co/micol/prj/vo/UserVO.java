package co.micol.prj.vo;

import java.sql.Date;

public class UserVO {
	private int userNum;
	private String userId;
	private String userPassword;
	private String userName;
	private String userPhone;
	private String userAddress;
	private String userEmail;
	private Date userInsertDay;
	private Date userLoginDay;
	
	public UserVO() {
		// TODO Auto-generated constructor stub
	}

	public UserVO(String id, String password) {
		this.userId = id;
		this.userPassword = password;
	}

	public UserVO(String id, String password, String name, String phone, String address, String email) {
		this.userId = id;
		this.userPassword = password;
		this.userName = name;
		this.userPhone = phone;
		this.userAddress = address;
		this.userEmail = email;
	}

	public int getUserNum() {
		return userNum;
	}
	
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	public String getUserAddress() {
		return userAddress;
	}
	
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public Date getUserInsertDay() {
		return userInsertDay;
	}
	
	public void setUserInsertDay(Date userInsertDay) {
		this.userInsertDay = userInsertDay;
	}
	
	public Date getUserLoginDay() {
		return userLoginDay;
	}
	
	public void setUserLoginDay(Date userLoginDay) {
		this.userLoginDay = userLoginDay;
	}
	
}
