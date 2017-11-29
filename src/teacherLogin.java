import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class teacherLogin {
	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		String user = "system";
		String path = "1111";
		int cnt = 0;
		Connection conn = DriverManager.getConnection(url, user, path);
		String sql = "";

		System.out.print("아이디를 입력하에요 >>");
		String id = new Scanner(System.in).nextLine();
		System.out.print("비밀번호를 입력하세요 >>");
		String pass = new Scanner(System.in).nextLine();

		sql = "select name, birth from teacher where id = '" + id + "' and  pass = '" + pass + "'";

		PreparedStatement pst = null;

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		if (rs.next()) {
			System.out.println("로그인 완료!");

		} else

			System.out.println("회원가입을 하세요!");

	} // end method

} // end class
