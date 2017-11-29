package project;	//메인클래스

import java.util.Scanner;

import teacherJoinLogin.*;
import studentDataDBUp.*;

public class main {

	public static void main(String[] args) throws Exception {
		
		techerinfoUpload tdbup = new techerinfoUpload();
		tdbup.main();
		
		login login = new login ();
		login.frame.setVisible(true);
		
		String teachN="";
		
		Teacher[] teacher ={ new Korean_teacher(),new English_teacher(),new Math_teacher()
				,new Java_teacher(),new Android_teacher()} ;
		
		
		teacherLogin tj = new teacherLogin(); 
		
		SQL_select ss = new SQL_select();
		
		
		teachN = tj.isSql();	
		
		stuList_test slt = new stuList_test();
	

		if(teachN.split("9")[1].equals("1")){
			
	
			
		}
		
		
		if(teachN.split("9")[0].equals("0101")){
			try {
				ss.classlist(teachN.split("9")[0]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
		
		
		
		
		}
	
}
