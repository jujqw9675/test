package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Arrays;
import java.util.Scanner;

public class stuinfo_add {
	/*public static void main(String[] args) {
		try {
			classlist();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	public String[][] classlist(String num) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pass = "1111";
		String sql = "";

		Connection conn = DriverManager.getConnection(url, user, pass);

//		System.out.print("조회하실 학년/반을 입력하세요(전학년조회 0000) >> ");
//		String num = new Scanner(System.in).nextLine()/* 변수명-학번4자리 */; // test
		PreparedStatement pst = null;
		String[][] data = null;
		
		if(num.equals("0000")){
			data = new String[30][11];
			sql = "select * from Student";
			pst = conn.prepareStatement(sql);
		}else{
			data = new String[5][11];
			sql = "select * from Student where num like ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, num + "__");
		}	
		ResultSet rs = pst.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(
				"학번\t이름\t연락처\t\t주소\t\t\t\t국어\t영어\t수학\t자바\t안드로이드\t총점\t평균")/* 필요 없음 */; // test
		int total_k = 0, total_e = 0, total_m = 0, total_j = 0, total_a = 0, total_all = 0;
		int j = 0;
		while (rs.next()) {
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					data[j][i-1] = rs.getString(i);
				System.out.print(rs.getString(i) + "\t")/* GUI에 출력 */; // test
			}
			j++;
			total_k += rs.getInt("korean");
			total_e += rs.getInt("english");
			total_m += rs.getInt("math");
			total_j += rs.getInt("java");
			total_a += rs.getInt("android");
			total_all += rs.getInt("all_score");
			System.out.println();
		}
		System.out.println("평균\t\t\t\t\t\t\t\t" + ((int)((total_k/(double)(rs.getRow()))*100))/100.0 + "\t"
				 + ((int)((total_e/(double)(rs.getRow()))*100))/100.0 + "\t"
				 + ((int)((total_m/(double)(rs.getRow()))*100))/100.0 + "\t"
				 + ((int)((total_j/(double)(rs.getRow()))*100))/100.0 + "\t"
				 + ((int)((total_a/(double)(rs.getRow()))*100))/100.0 + "\t"
				 + ((int)((total_all/(double)(rs.getRow()))*100))/100.0 + "\t");
		for(int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
		return data;
	}


}
