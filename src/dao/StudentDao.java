package dao;

import model.Student;

public interface StudentDao {

	public int Save(Student st) throws Exception;
	public boolean Update(Student st) throws Exception;
	public boolean Delete(Student st) throws Exception;
	public Student findById(int admno)throws Exception;
	
}
