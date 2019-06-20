<%@page import="kr.hs.sdh.grade.vo.GradeStudentVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% ArrayList<GradeStudentVO> gradeList = (ArrayList<GradeStudentVO>) request.getAttribute("gradeList"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적 조회 프로그램</title>
<link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<header id="header">
		<h1>학생 성적 조회 프로그램 ver 1.0</h1>
	</header>
	<menu id="menu">
		<ul>
			<li><a href="StudentListCtrl">학생조회</a></li>
			<li><a href="gradeAdd.jsp">학생성적입력</a></li>
			<li><a href="GradeList">학생성적조회</a></li>
			<li><a href="index.jsp">홈으로</a></li>
		</ul>
	</menu>
	<section id="section">
		<h3><b>학생 성적 조회</b></h3>
		<table id="addForm" align="center" border="1">
		<tr>
			<td>학번</td>
			<td>이름</td>
			<td>학년</td>
			<td>반</td>
			<td>번호</td>
			<td>성별</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>역사</td>
			<td>합계</td>
			<td>평균</td>
			<td>순위</td>
		</tr>
		<%
			int kr = 0, en = 0, ma = 0, hi = 0, to = 0, av = 0;;
			for(int i = 0; i < gradeList.size(); i++){
				GradeStudentVO vo = gradeList.get(i);
				int total = vo.getKorean() + vo.getEnglish() + vo.getMath() + vo.getHistory();
				int avg = (vo.getKorean() + vo.getEnglish() + vo.getMath() + vo.getHistory()) / 4;
				String str = vo.getId();
				String one = str.substring(0,1);
				String two = str.substring(1,3);
				String three = str.substring(3,5);
				
				kr += vo.getKorean();
				en += vo.getEnglish();
				ma += vo.getMath();
				hi += vo.getHistory();
				to += kr + en + ma + hi;
		%>
		<tr>
			<td><%= vo.getId() %></td>
			<td><%= vo.getName() %></td>
			<td><%= one %></td>
			<td><%= two %></td>
			<td><%= three %></td>
			<td><%= vo.getGender() %></td>
			<td><%= vo.getKorean() %></td>
			<td><%= vo.getEnglish() %></td>
			<td><%= vo.getMath() %></td>
			<td><%= vo.getHistory() %></td>
			<td><%= total %></td>
			<td><%= avg %></td>
			<td><%= vo.getRanks() %></td>
		</tr>
		<% } %>
		<tr>
			<td colspan="6"></td>
			<td>국어 총합</td>
			<td>수학 총합</td>
			<td>영어 총합</td>
			<td>역사 총합</td>
			<td>총합</td>
			<td>총평균</td>
			<td>........</td>
		</tr>
		<tr>
			<td colspan="6"></td>
			<td><%= kr %></td>
			<td><%= en %></td>
			<td><%= ma %></td>
			<td><%= hi %></td>
			<td><%= to %></td>
			<td><%= to / 4 %></td>
			<td>........</td>
		</tr>
		
		</table>
	</section>
	<footer id="footer"><p>Copyright© 2019 All rights reserved Hanyang High School</p></footer>
</body>
</html>