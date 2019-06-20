package kr.hs.sdh.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import kr.hs.sdh.student.vo.StudentVO;
import kr.hs.sdh.utility.DBConnection;

public class StudentDAO {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public ArrayList<StudentVO> getStudentList(){
		ArrayList<StudentVO> studentList = new ArrayList<StudentVO>();
		
		try {
			conn = DBConnection.getConnection();
			
			String sql = "select * from member_tbl";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				StudentVO vo = new StudentVO();
				
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setGender(rs.getString("gender"));
				
				studentList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DBConnection.close(rs, stmt, conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return studentList;
	}
}
