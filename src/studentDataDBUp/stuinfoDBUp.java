package studentDataDBUp;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;

import jxl.Sheet;
import jxl.Workbook;


public class stuinfoDBUp {
	public void stulistup () throws Exception {

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
				
				stulist.add(new StudentVO("",name, phone, addr, "", "", "", "", "", "", ""));
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
					System.out.println("등록 성공!");
				} else {
					System.out.println("등록 실패...");
				}
			}
			stulist.clear();

			for(int j = (s.getRows()/2)+1; j < s.getRows(); j++) {
				name = s.getCell(0, j).getContents();
				phone = s.getCell(1, j).getContents();
				addr = s.getCell(2, j).getContents();
				
				stulist.add(new StudentVO("",name, phone, addr, "", "", "", "", "", "", ""));
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
					System.out.println("등록 성공!");
				} else {
					System.out.println("등록 실패...");
				}
			}
			stulist.clear();

		}
		
		wb.close();

	} // end main

} // end class
		
		/*for (int i = 0; i < list.size(); i++) {
			list.get(i).setNum(Integer.toString(stuNum++));
			System.out.println(list.get(i));
			
			name = list.get(i).getName();
			phoneNum = list.get(i).getPhone();
			addr = list.get(i).getAddr();
			String stu = list.get(i).getNum();

			sql = "insert into student(num,name,phone,addr)values(?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(2, name);
			pst.setString(3, phoneNum);
			pst.setString(4, addr);
			pst.setString(1, stu);

			int num = pst.executeUpdate();
			
			list.remove(i);
			
		}*/
		
		////////////////////////////////////
		
		

		/*for(int j = 5; j < 10; j++) {
			name = s.getCell(0, j).getContents();
			phoneNum = s.getCell(1, j).getContents();
			addr = s.getCell(2, j).getContents();

			list.add(new StudentVO("", name, phoneNum, addr, "", "", "", "", "", "", ""));

		}

		Collections.sort(list, new sorting());
		
			
		
		for (int i =0; i < list.size(); i++) {
			list.get(i).setNum(Integer.toString(stuNum++));
			System.out.println(list.get(i));
			
			name=list.get(i).getName();
			phoneNum=list.get(i).getPhone();
			addr=list.get(i).getAddr();
			String stu=list.get(i).getNum();

			sql = "insert into student(num,name,phone,addr)values(?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(2, name);
			pst.setString(3, phoneNum);
			pst.setString(4, addr);
			pst.setString(1, stu);
			
			int num=pst.executeUpdate();
			
			list.remove(i);
	
		}
		wb.close();
		 stuNum = 1;
		}
	}
}
*/
