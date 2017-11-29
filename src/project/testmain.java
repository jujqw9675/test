package project;
import java.util.Scanner;

public class testmain {

	public static void main(String[] args) {
		Teacher k_t = new Korean_teacher();
		Teacher e_t = new English_teacher();
		Teacher m_t = new Math_teacher();
		Teacher j_t = new Java_teacher();
		Teacher a_t = new Android_teacher();
		
		k_t.sub_modigrade();
		k_t.myc_stulist();
	}
}
