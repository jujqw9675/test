import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class SQL_update {
	
	public void sub_input(String sub) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pass = "1111";
		String sql = "";
		PreparedStatement pst = null;
		
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		sql = "select * from student";
		
		pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()){
			String score = new Scanner(System.in).nextLine();											//test
			sql = "update student set " + sub + " = '" + score + "' where num = '" + rs.getString(1) + "'";
			
			Statement st = conn.createStatement();		
//			pst = conn.prepareStatement(sql);
//			pst.setString(1, score);
//			pst.setString(2, rs.getString(1));
//			int cnt = pst.executeUpdate();
			int cnt = st.executeUpdate(sql);
			if(cnt > 0) {
				System.out.println("성공!");
			} else {
				System.out.println("실패...");
			}
		}
	}
	
	public void search_input(String sub) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pass = "1111";
		String sql = "";
		PreparedStatement pst = null;
		
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		System.out.print("수정할 학생의 이름 >> ");
		String name = new Scanner(System.in).nextLine();
		
		sql = "select * from student where name = ?";
		
		pst = conn.prepareStatement(sql);
		pst.setString(1, name);
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()){
			System.out.print("점수 입력 >> ");
			String score = new Scanner(System.in).nextLine();											//test
			
			sql = "update student set " + sub + " = '" + score + "' where num = '" + rs.getString(1) + "'";
			
			Statement st = conn.createStatement();
//			pst = conn.prepareStatement(sql);
//			pst.setString(1, sub);
//			pst.setString(2, score);
//			pst.setString(3, rs.getString(1));
			int cnt = st.executeUpdate(sql);
			if(cnt > 0) {
				System.out.println("성공!");
			} else {
				System.out.println("실패...");
			}
		}
	}

} // end class
