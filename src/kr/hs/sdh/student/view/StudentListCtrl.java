package kr.hs.sdh.student.view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.hs.sdh.student.dao.StudentDAO;
import kr.hs.sdh.student.vo.StudentVO;

public class StudentListCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<StudentVO> studentList = new ArrayList<StudentVO>();
		
		StudentDAO dao = new StudentDAO();
		studentList = dao.getStudentList();
		
		request.setAttribute("studentList", studentList);
		
		RequestDispatcher view = request.getRequestDispatcher("studentList.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
