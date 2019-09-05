<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>회원 상품 목록</title>
</head>
<body>
	<table class="table table-striped">
		<tr>
			<th>상품명</th>
			<th>상품수량</th>
			<th>상품가격</th>
			<th>상품내용</th>
		</tr>
	
	<c:forEach items="${product_list }" var="item">
		<tr>
			<td>
				<a href="/product/buy_form?product_seq=${item.product_seq }">
					${item.product_nm }
				</a>
			</td>
			<td>${item.product_qty }</td>
			<td>${item.product_price }</td>
			<td>${item.product_comments }</td>
		</tr>
	</c:forEach>
	
	</table>



















</body>
</html>