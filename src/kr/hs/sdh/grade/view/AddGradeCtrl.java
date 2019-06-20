package kr.hs.sdh.grade.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.hs.sdh.grade.dao.GradeDAO;
import kr.hs.sdh.grade.vo.GradeVO;

public class AddGradeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		int korean = Integer.parseInt(request.getParameter("korean").trim());
		int english = Integer.parseInt(request.getParameter("english").trim());
		int math = Integer.parseInt(request.getParameter("math").trim());
		int histoty = Integer.parseInt(request.getParameter("history").trim());
		
		GradeVO vo = new GradeVO();
		vo.setId(id);
		vo.setKorean(korean);
		vo.setEnglish(english);
		vo.setMath(math);
		vo.setHistory(histoty);
		
		GradeDAO dao = new GradeDAO();
		
		try {
			dao.addGrade(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("index.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
