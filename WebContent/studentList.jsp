<%@page import="kr.hs.sdh.student.vo.StudentVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% ArrayList<StudentVO> studentList = (ArrayList<StudentVO>) request.getAttribute("studentList"); %>
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
		<h3><b>학생조회</b></h3>
		<table id="addForm" align="center" border="1">
		<tr>
			<td>학번</td>
			<td>이름</td>
			<td>학년</td>
			<td>반</td>
			<td>번호</td>
			<td>성별</td>
		</tr>
		<%
			for(int i = 0; i < studentList.size(); i++){
				StudentVO vo = studentList.get(i);
				String str = vo.getId();
				String one = str.substring(0,1);
				String two = str.substring(1,3);
				String three = str.substring(3,5);
		%>
		<tr>
			<td><%= vo.getId() %></td>
			<td><%= vo.getName() %></td>
			<td><%= one %></td>
			<td><%= two %></td>
			<td><%= three %></td>
			<td><%= vo.getGender() %></td>
		</tr>
		<% } %>
		</table>
	</section>
	<footer id="footer"><p>Copyright© 2019 All rights reserved Hanyang High School</p></footer>
</body>
</html>