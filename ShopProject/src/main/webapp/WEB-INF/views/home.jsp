<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<c:choose>
	
		<c:when test="${sessionScope.admin_id != null}">
			${sessionScope.admin_id }님 환영합니다.<br>
			<a href="/product/list">관리자 상품 목록</a>
		</c:when>
		
		<c:when test="${sessionScope.user_id != null }">
			${sessionScope.user_id }님 환영합니다.<br>
			<a href="/product/list_for_user">회원 상품 목록</a>
			<a href="#">내 구매 내역 보기</a>
		</c:when>
		
		<c:otherwise>
			<a href="/user/insert">회원 가입</a>
			<a href="/admin/login_form">관리자 로그인 페이지</a>
			<a href="/user/login_form">회원 로그인 페이지</a>
		</c:otherwise>
	</c:choose>
	
	
	
	
</body>
</html>
