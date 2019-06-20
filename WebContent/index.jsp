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
		<h3 id="subTitle"><b>학생성적 관리 프로그램</b></h3>
		<p>학생과 학생 성적에 관한 데이터베이스를 구축하고 관리하기 위한 프로그램이다.</p>
		<ol>
			<li>학생정보 및 학생성적 테이블을 생성하고 샘플데이터를 추가한다.</li>
			<li>학생조회, 학생성적 입력, 학생성적 조회 프로그램을 작성한다.</li>
			<li>올바르게 구현되었는지 확인한다.</li>
		</ol>
	</section>
	<footer id="footer"><p>Copyright© 2019 All rights reserved Hanyang High School</p></footer>
</body>
</html>