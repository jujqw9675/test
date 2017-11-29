package studentDataDBUp;

import java.util.Comparator;

import studentDataDBUp.StudentVO;

public class sorting implements Comparator<StudentVO> {
	

	@Override
	public int compare(StudentVO arg0, StudentVO arg1) {
		// TODO Auto-generated method stub
		
		return arg0.getName().compareTo(arg1.getName());
	}

	
	

}
