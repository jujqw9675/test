
public class Korean_teacher extends Teacher {
	
	public Korean_teacher(){
		super();
	}
	
	public void sub_Inputgrade() {
		SQL_update sqlu = new SQL_update();
		try {
			sqlu.sub_input("korean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sub_modigrade() {
		SQL_update sqlu = new SQL_update();
		try {
			sqlu.search_input("korean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sub_stulist() {
		SQL_select sqls = new SQL_select();
		try {
			sqls.sublist("korean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sub_sturank() {
		
	}

}
