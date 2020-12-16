package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import model.Student;

public class StudentDaoImplJDBC implements StudentDao {
	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int Save(Student st) throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into student(studentname,gender,email) values(?,?,?)");
		ps.setString(1, st.getName());
		ps.setString(2, st.getGender());
		ps.setString(3, st.getEmail());
		int i = ps.executeUpdate();
		con.close();
		
		return i;
	}

	@Override
	public boolean Update(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findById(int admno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
