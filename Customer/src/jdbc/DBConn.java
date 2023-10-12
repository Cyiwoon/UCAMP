package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {

	public static void main(String[] args) {
		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_IP = "localhost";
		final String DB_PORT = "3306";
		final String DB_NAME = "boot_db";
		final String DB_URL = 
				"jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			//1. Driver class Loading
			Class.forName(driver);
			System.out.println("DB_URL = " + DB_URL);
			//2. DB���� ������ ����ϴ� Connection ��ü����
			conn = DriverManager.getConnection(DB_URL, "boot", "boot");
			System.out.println("connecton ClassName = " + conn.getClass().getName());
			if (conn != null) {
				System.out.println("DB ���� ����");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}

		try {
			String sql = "select * from customer";
			// 3. SQL���� DB���� �����ϴ� ������ �ϴ� Statement 
			pstmt = conn.prepareStatement(sql);
			System.out.println("Statement ClassName : " + pstmt.getClass().getName());
			
			//4. SQL�� �������� ��� ������ �ϴ� ResultSet
			rs = pstmt.executeQuery();
			System.out.println("ResultSet ClassName : " + rs.getClass().getName());
			
			String name = null;
			String email = null;
			int age = 0;
			String date = null;
			
			while (rs.next()) {
				// �ش� �÷��� ���� ��������
				name = rs.getString(2);
				email = rs.getString("email");
				age = rs.getInt("age");
				date = rs.getString("entryDate");
				
				System.out.println(name);
				System.out.println(email);
				System.out.println(age);
				System.out.println(date);
				System.out.println();
				
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}