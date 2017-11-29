import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JTable;

public class test1 {
	public Object[][] input(JTable table) {
		Object[][] data = new Object[table.getRowCount()][table.getColumnCount()];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = table.getModel().getValueAt(i, j);
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
		System.out.println();
		return data;
	}

	public void up(Object[][] data, String sub) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pass = "1111";
		String sql = "";

		Connection conn = DriverManager.getConnection(url, user, pass);

		for (int i = 0; i < data.length; i++) {
			String num = data[i][0].toString();
			String score = data[i][2].toString();
			sql = "update student set " + sub + " = '" + score + "' where num = '" + num + "'";

			Statement st = conn.createStatement();
			int cnt = st.executeUpdate(sql);
			if (cnt > 0) {
				System.out.println("성공!");
			} else {
				System.out.println("실패...");
			}
		}
	}

}
