
public abstract class Teacher {

	public abstract void sub_Inputgrade();
	// ���� �Է�
	
	public abstract void sub_modigrade();
	// ���� ����
	
	public abstract void sub_stulist();
	// ���� ��ȸ
	
	public abstract void sub_sturank();
	// ���� ��ȸ

	//=============================================

	public void myc_stulist(){
		SQL_select sqls = new SQL_select();
		try {
			sqls.classlist();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// �츮�� ��ü��ȸ
	
	public void myc_sturank() {

	}
	// ������ȸ
	
	public void myc_counsling() {

	}
	// �����?
} // end class