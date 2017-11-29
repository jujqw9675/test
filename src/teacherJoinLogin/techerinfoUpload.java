package teacherJoinLogin;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class techerinfoUpload {
	public void main() throws Exception {
		// ø¢ºø
		String pathExcel = "C:\\data\\" + "TeacherLogin.xls";
		String name = "";
		String birth = "";

		Workbook wb = Workbook.getWorkbook(new File(pathExcel));
		Sheet s = wb.getSheet(0);

		// µ•¿Ã≈Õ∫£¿ÃΩ∫

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		String user = "system";
		String path = "1111";
		String sql = "";
		PreparedStatement pst = null;

		Connection conn = DriverManager.getConnection(url, user, path);

		for (int j = 0; j < s.getRows(); j++) {
			name = s.getCell(0, j).getContents();
			birth = s.getCell(1, j).getContents();

			sql = "insert into teacher(name,birth)values(?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, birth);
			int num = pst.executeUpdate();

		}

		wb.close();

	}

}

