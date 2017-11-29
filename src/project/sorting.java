package project;
import java.util.Comparator;

public class sorting implements Comparator<StudentVO>{

	@Override
	public int compare(StudentVO arg0, StudentVO arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}

}
