package kr.hs.sdh.grade.view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.hs.sdh.grade.dao.GradeDAO;
import kr.hs.sdh.grade.vo.GradeStudentVO;
import kr.hs.sdh.grade.vo.GradeVO;
import kr.hs.sdh.student.dao.StudentDAO;
import kr.hs.sdh.student.vo.StudentVO;


public class GradeList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<GradeStudentVO> gradeList = new ArrayList<GradeStudentVO>();
		
		GradeDAO dao = new GradeDAO();
		gradeList = dao.getGradeList();
		
		request.setAttribute("gradeList", gradeList);
		
		RequestDispatcher view = request.getRequestDispatcher("studentGradeList.jsp");
		view.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
