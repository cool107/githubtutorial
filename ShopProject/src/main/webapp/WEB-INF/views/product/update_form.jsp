<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정 폼</title>
</head>
<body>

<form action="/product/update" method="post">
	상품명 :  ${result.product_nm }<br>
	상품 수량 : <input type="number" name="product_qty" value="${result.product_qty }"><br>
	상품 가격 : <input type="number" name="product_price" value="${result.product_price }"><br>
	상품 설명 : <input type="text" name="product_comments" value="${result.product_comments }"><br>
	<input type="hidden" name="product_seq" value="${result.product_seq }">
	<input type="submit" value="수정하기">

</form>












</body>
</html>