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

		System.out.print("���̵� �Է��Ͽ��� >>");
		String id = new Scanner(System.in).nextLine();
		System.out.print("��й�ȣ�� �Է��ϼ��� >>");
		String pass = new Scanner(System.in).nextLine();

		sql = "select name, birth from teacher where id = '" + id + "' and  pass = '" + pass + "'";

		PreparedStatement pst = null;

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		if (rs.next()) {
			System.out.println("�α��� �Ϸ�!");

		} else

			System.out.println("ȸ�������� �ϼ���!");

	} // end method

} // end class
