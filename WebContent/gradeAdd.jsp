<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h3 id="subTitle"><b>학생 성적 등록</b></h3>
		<form action="AddGradeCtrl">
		<table id="addForm" align="center">
				<tr>
					<td>학번</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>국어</td>
					<td><input type="text" name="korean"></td>
				</tr>
				<tr>
					<td>영어</td>
					<td><input type="text" name="english"></td>
				</tr>
				<tr>
					<td>수학</td>
					<td><input type="text" name="math"></td>
				</tr>
				<tr>
					<td>역사</td>
					<td><input type="text" name="history"></td>
				</tr>
				<tr>
					<td colspan="2"><button style="width: 100%; height: 30px">확인</button></td>
				</tr>
			</table>
		</form>
	</section>
	<footer id="footer"><p>Copyright© 2019 All rights reserved Hanyang High School</p></footer>
</body>
</html>