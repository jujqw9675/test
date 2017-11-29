import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class teacherJoin {

	public static void main(String[] args) throws Exception {

		ArrayList<TeacherVO> list = new ArrayList<TeacherVO>();
		String sql = "";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		String user = "system";
		String path = "1111";
		int cnt = 0;
		Connection conn = DriverManager.getConnection(url, user, path);

		System.out.print("이름을 입력하세요 >> ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("생년월일을 입력하세요 >>");
		String birth = new Scanner(System.in).nextLine();
		System.out.print("아이디를 입력하에요 >>");
		String id = new Scanner(System.in).nextLine();
		System.out.print("비밀번호를 입력하세요 >>");
		String pass = new Scanner(System.in).nextLine();
		System.out.print("비밀번호를 다시 입력하세요 >>");
		String pass1 = new Scanner(System.in).nextLine();
		System.out.print("학년/반/과목담당을 입력하세요 >>");
		String teachNum = new Scanner(System.in).nextLine();

		sql = "select name, birth from teacher where name = '" + name + "' and birth = '" + birth + "'";

		PreparedStatement pst = null;

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		if (rs.next()) {

			if (pass.equals(pass1)) {

				sql = "update teacher set id=?, pass=?, teachNum=? where name = ?";

				pst = conn.prepareStatement(sql);
				pst.setString(1, id);
				pst.setString(2, pass);
				pst.setString(3, teachNum);
				pst.setString(4, name);

				list.add(new TeacherVO(name, birth, id, pass, teachNum));
			}

			System.out.println("회원가입완료");

		} else {
			System.out.println("정보가 없습니다!");
		}

		System.out.println();

		int num = pst.executeUpdate();

		if (num > 0) {
			System.out.println("입력완료");
		} else {
			System.out.println("입력실패");
		}
	} // end method
} // end class
