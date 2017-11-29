package teacherJoinLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import project.*;


import studentDataDBUp.StudentVO;

public class teacherLogin {

	String sql="";
	public void teacherLogin (String id,String pass) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		String user = "system";
		String path = "1111";
		int cnt = 0;
		Connection conn = DriverManager.getConnection(url, user, path);
		//String sql = "";

		/*System.out.print("아이디를 입력하에요 >>");
		id = new Scanner(System.in).nextLine();
		System.out.print("비밀번호를 입력하세요 >>");
		pass = new Scanner(System.in).nextLine();*/

		sql = "select * from teacher where id = '" + id + "' and  pass = '" + pass + "'";

		PreparedStatement pst = null;

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		if (rs.next()) {
//			 new dialog("로그인 완료!");
			 stuList_GUI stuGUI = new stuList_GUI();
			 stuGUI.frame.setVisible(true);
			 sql = "select teachNum from teacher where id = ?";
			 pst.setString(1, id);
		
			 isSql();
		} else

			 new dialog("회원가입을 하세요!");
	}
//	public void teacherInfo (String id,String pass) {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//
//			String user = "system";
//			String path = "1111";
//			int cnt = 0;
//			Connection conn = DriverManager.getConnection(url, user, path);
//			String sql = "";
//
//			/*System.out.print("아이디를 입력하에요 >>");
//			id = new Scanner(System.in).nextLine();
//			System.out.print("비밀번호를 입력하세요 >>");
//			pass = new Scanner(System.in).nextLine();*/
//
//			sql = "select * from teacher where id = '" + id + "' and  pass = '" + pass + "'";
//
//			PreparedStatement pst = null;
//
//			Statement st = conn.createStatement();
//			ResultSet rs = st.executeQuery(sql);
//			if(rs.next()){
//				
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

	public String isSql() {
		String sSql=sql;
		return sSql;
	}

}
