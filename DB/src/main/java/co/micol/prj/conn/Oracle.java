package co.micol.prj.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Oracle {
	Connection con; // 멤버변수
	Statement stmt;
	ResultSet rs;

	public void getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid =  "hr"; //c##추가
		String pwd = "hr"; //c##추가
	   
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch (ClassNotFoundException e) {
		   e.printStackTrace();
		}
		
		try {
		   System.out.println("데이터베이스 연결 준비 .....");
		   con = DriverManager.getConnection(url,userid,pwd);
		   System.out.println("데이터베이스 연결 성공");
		}catch (SQLException e) {
		   e.printStackTrace();
		}
	}
	
	public void printCustomer(){ 
		String query = "SELECT * FROM employees where last_name = 'King'";
		try {
			stmt = con.createStatement(); //2
			rs = stmt.executeQuery(query); //3
			
			while (rs.next()){				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
