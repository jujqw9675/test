package project;

public class StudentVO {
	private String num;
	private String name;
	private String phone;
	private String addr;
	private String korean;
	private String english;
	private String math;
	private String java;
	private String android;
	private String all_score;
	private String avg_score;
	
	public StudentVO(String name, String phone, String addr) {
		this.num = "";
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.korean = "";
		this.english = "";
		this.math = "";
		this.java = "";
		this.android = "";
		this.all_score = "";
		this.avg_score = "";
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getKorean() {
		return korean;
	}

	public void setKorean(String korean) {
		this.korean = korean;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getJava() {
		return java;
	}

	public void setJava(String java) {
		this.java = java;
	}

	public String getAndroid() {
		return android;
	}

	public void setAndroid(String android) {
		this.android = android;
	}

	public String getAll_Score() {
		return all_score;
	}

	public void setAll_Score(String all_Score) {
		this.all_score = all_Score;
	}

	public String getAvg_Score() {
		return avg_score;
	}

	public void setAvg_Score(String avg_Score) {
		this.avg_score = avg_Score;
	}
	
	public String toString() {
		return num + " " + name + " " + korean + " " + english + " " + math + " " + java + " " + android + " " + all_score + " " + avg_score;
	}
	
}
