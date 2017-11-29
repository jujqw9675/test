import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;

public class studentInfoUpload {
	public static void main(String[] args) throws Exception {
		String path = "C:\\data\\" + "stu_DB.xls";
		String name = "";
		String phone = "";
		String addr = "";
		int cnt = 0;
		
		Workbook wb = Workbook.getWorkbook(new File(path));
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pass = "1111";
		String sql ="";
		PreparedStatement pst = null;

		Connection conn = DriverManager.getConnection(url, user, pass);
		
		ArrayList<StudentVO> stulist = new ArrayList<StudentVO>();
		
		for(int i = 0; i < wb.getNumberOfSheets(); i++) {
			Sheet s = wb.getSheet(i);
			for(int j = 1; j <= s.getRows()/2; j++) {
				name = s.getCell(0, j).getContents();
				phone = s.getCell(1, j).getContents();
				addr = s.getCell(2, j).getContents();
				
				stulist.add(new StudentVO(name, phone, addr));
			}
			Collections.sort(stulist, new sorting());
			for(int j = 0; j < stulist.size(); j++) {
				sql = "insert into student (num,name,phone,addr) values(?,?,?,?)";
				
				pst = conn.prepareStatement(sql);
				
				pst.setString(1, "0" + (i+1) + "010" + (j+1));
				pst.setString(2, stulist.get(j).getName());
				pst.setString(3, stulist.get(j).getPhone());
				pst.setString(4, stulist.get(j).getAddr());
				int num = pst.executeUpdate();
				if(num > 0) {
					System.out.println("��� ����!");
				} else {
					System.out.println("��� ����...");
				}
			}
			stulist.clear();

			for(int j = (s.getRows()/2)+1; j < s.getRows(); j++) {
				name = s.getCell(0, j).getContents();
				phone = s.getCell(1, j).getContents();
				addr = s.getCell(2, j).getContents();
				
				stulist.add(new StudentVO(name, phone, addr));
			}
			Collections.sort(stulist, new sorting());
			for(int j = 0; j < stulist.size(); j++) {
				sql = "insert into student (num,name,phone,addr) values(?,?,?,?)";
				
				pst = conn.prepareStatement(sql);
				
				pst.setString(1, "0" + (i+1) + "020" + (j+1));
				pst.setString(2, stulist.get(j).getName());
				pst.setString(3, stulist.get(j).getPhone());
				pst.setString(4, stulist.get(j).getAddr());
				int num = pst.executeUpdate();
				if(num > 0) {
					System.out.println("��� ����!");
				} else {
					System.out.println("��� ����...");
				}
			}
			stulist.clear();

		}
		
		wb.close();

	} // end main

} // end class
