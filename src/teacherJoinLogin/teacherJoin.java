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
		 * if(conn != null){ System.out.println("����"); }
		 */

		/*
		 * System.out.print("�̸��� �Է��ϼ��� >> "); String name = new
		 * Scanner(System.in).nextLine(); System.out.print("��������� �Է��ϼ��� >>");
		 * String birth = new Scanner(System.in).nextLine();
		 * System.out.print("���̵� �Է��Ͽ��� >>"); String id = new
		 * Scanner(System.in).nextLine(); System.out.print("��й�ȣ�� �Է��ϼ��� >>");
		 * String pass = new Scanner(System.in).nextLine();
		 * System.out.print("��й�ȣ�� �ٽ� �Է��ϼ��� >>"); String passCheck = new
		 * Scanner(System.in).nextLine();
		 * System.out.print("�г�/��/�������� �Է��ϼ��� >>"); String teachNum = new
		 * Scanner(System.in).nextLine();
		 */

		// System.out.println(name+birth+id+pass+teachNum);

		// �̸��� ������� �ִ��� �Ǵ�
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
				System.out.println("���� ���̵� ����");
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
							 new dialog("ȸ�����ԿϷ�");
							
						} else {
							 new dialog("�����߻�!");
						}
					} else {
						 new dialog("�̹� ���� �ϼ˽��ϴ�.");

					} // end if~else
				}
			}
		}

	}
}
