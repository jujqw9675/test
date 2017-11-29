package studentDataDBUp;

public class StudentVO {
	
	String num;
	String name;
	String phone;
	String addr;
	String korean;
	String english;
	String math;
	String java;
	String android;
	String all_score;
	String all_avg;

	public StudentVO(String num, String name, String phone, String addr, String korean, String english, String math,
			String java, String android, String all_score, String all_avg) {
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
		this.all_avg = "";
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

public String getAll_score() {
	return all_score;
}

public void setAll_score(String all_score) {
	this.all_score = all_score;
}

public String getAll_avg() {
	return all_avg;
}

public void setAll_avg(String all_avg) {
	this.all_avg = all_avg;
}

public String toString (){
	return num+name+phone+addr+korean+english+math+java+android+all_score+all_avg;
}

}
