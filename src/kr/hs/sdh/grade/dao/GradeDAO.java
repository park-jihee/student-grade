package kr.hs.sdh.grade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import kr.hs.sdh.grade.vo.GradeStudentVO;
import kr.hs.sdh.grade.vo.GradeVO;
import kr.hs.sdh.student.vo.StudentVO;
import kr.hs.sdh.utility.DBConnection;

public class GradeDAO {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public void addGrade(GradeVO vo) throws Exception{
		try {
			
		conn = DBConnection.getConnection();
	
		String sql = "insert into score_tbl values (?, ?, ?, ?, ?)";
		stmt = conn.prepareStatement(sql);

		stmt.setString(1, vo.getId());
		stmt.setInt(2, vo.getKorean());
		stmt.setInt(3, vo.getEnglish());
		stmt.setInt(4, vo.getMath());
		stmt.setInt(5, vo.getHistory());
		
		stmt.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DBConnection.close(rs, stmt, conn);
			} finally {
			
			}
		}
	}
	
	public ArrayList<GradeStudentVO> getGradeList(){
		ArrayList<GradeStudentVO> gradeList = new ArrayList<GradeStudentVO>();
		
		try {
			conn = DBConnection.getConnection();
			
			String sql = "select MEMBER_TBL.id, name, gender, korean, english, math, history, row_number() over (order by (korean + english + math + history)/4) as ranks from MEMBER_TBL inner join SCORE_TBL on MEMBER_TBL.id = SCORE_TBL.id";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				GradeStudentVO vo = new GradeStudentVO();
				
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setGender(rs.getString("gender"));
				vo.setKorean(rs.getInt("korean"));
				vo.setEnglish(rs.getInt("english"));
				vo.setMath(rs.getInt("math"));
				vo.setHistory(rs.getInt("history"));
				vo.setRanks(rs.getInt("ranks"));
				
				gradeList.add(vo);
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
		return gradeList;
	}
}
