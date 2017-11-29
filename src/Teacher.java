
public abstract class Teacher {

	public abstract void sub_Inputgrade();
	// 성적 입력
	
	public abstract void sub_modigrade();
	// 성적 수정
	
	public abstract void sub_stulist();
	// 성적 조회
	
	public abstract void sub_sturank();
	// 석차 조회

	//=============================================

	public void myc_stulist(){
		SQL_select sqls = new SQL_select();
		try {
			sqls.classlist();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 우리반 전체조회
	
	public void myc_sturank() {

	}
	// 석차조회
	
	public void myc_counsling() {

	}
	// 상담결과?
} // end class