package business;

import dao.StudentDao;
import model.Student;

public class StudentBoImpl implements StudentBo{

	private StudentDao dao;
	
	
	public void setDao(StudentDao d) {
		this.dao = d;
	}

	@Override
	public int createStudent(Student st) throws Exception {
		int i = dao.Save(st);
		return i;
	}

	@Override
	public boolean updateStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	
}
