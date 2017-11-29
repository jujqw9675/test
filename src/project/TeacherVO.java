package project;

public class TeacherVO {
	
	private String name;
	private String birth;
	private String id;
	private String pass;
	private String teachNum;
	
	
	public TeacherVO(String name, String birth, String id, String pass, String teachNum) {
		super();
		this.name = name;
		this.birth = birth;
		this.id = id;
		this.pass = pass;
		this.teachNum = teachNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String bitrh) {
		this.birth = bitrh;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getTeachNum() {
		return teachNum;
	}


	public void setTeachNum(String teachNum) {
		this.teachNum = teachNum;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(birth);
		sb.append(id);
		sb.append(teachNum);
		
		return sb.toString();
		
	}

}
