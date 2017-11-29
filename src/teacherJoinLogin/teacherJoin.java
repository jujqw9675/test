package teacherJoinLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import teacherJoinLogin.TeacherVO;

public class teacherJoin {

	public void teacherJoin(String name, String birth, String id, String pass, String passCheck, String teachNum)
			throws Exception {

		// public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ArrayList<TeacherVO> list = new ArrayList<TeacherVO>();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		String user = "system";
		String path = "1111";
		int cnt = 0;
		Connection conn = DriverManager.getConnection(url, user, path);

		/*
		 * if(conn != null){ System.out.println("연결"); }
		 */

		/*
		 * System.out.print("이름을 입력하세요 >> "); String name = new
		 * Scanner(System.in).nextLine(); System.out.print("생년월일을 입력하세요 >>");
		 * String birth = new Scanner(System.in).nextLine();
		 * System.out.print("아이디를 입력하에요 >>"); String id = new
		 * Scanner(System.in).nextLine(); System.out.print("비밀번호를 입력하세요 >>");
		 * String pass = new Scanner(System.in).nextLine();
		 * System.out.print("비밀번호를 다시 입력하세요 >>"); String passCheck = new
		 * Scanner(System.in).nextLine();
		 * System.out.print("학년/반/과목담당을 입력하세요 >>"); String teachNum = new
		 * Scanner(System.in).nextLine();
		 */

		// System.out.println(name+birth+id+pass+teachNum);

		// 이름과 생년월일 있는지 판단
		/*
		 * sql = "select name,birth from teacher where name = ? and birth = ?";
		 * pst = conn.prepareStatement(sql); pst.setString(1, name);
		 * pst.setString(2, birth);
		 */

		sql = "select * from teacher where name=? and birth = ?";

		pst = conn.prepareStatement(sql);
		pst.setString(1, name);
		pst.setString(2, birth);
		rs = pst.executeQuery();

		if (rs.next()) {
			sql = "select id from teacher where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("같은 아이디 존재");
			} else {
				sql = "select id,name from teacher where name=?";
				pst = conn.prepareStatement(sql);
				pst.setString(1, name);
				rs = pst.executeQuery();

				if (rs.next()) {
					if (rs.getString("id") == null) {

						sql = "update teacher set id=?, pass=?, teachNum=? where name = ?";
						pst = conn.prepareStatement(sql);
						pst.setString(1, id);
						pst.setString(2, pass);
						pst.setString(3, teachNum);
						pst.setString(4, name);

						cnt = pst.executeUpdate();

						if (cnt > 0) {
							list.add(new TeacherVO(name, birth, id, pass, teachNum));
							 new dialog("회원가입완료");
							
						} else {
							 new dialog("오류발생!");
						}
					} else {
						 new dialog("이미 가입 하셧습니다.");

					} // end if~else
				}
			}
		}

	}
}
