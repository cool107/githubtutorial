<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록 폼</title>
</head>
<body>
	<form action="/product/insert" method="post">
		상품명 : <input type="text" name="product_nm"> <br>
		상품 수량 : <input type="number" name="product_qty"><br>
		상품 가격 : <input type="number" name="product_price"><br>
		상품 설명 : <input type="text" name="product_comments"><br>
		<input type="submit" value="상품 등록">
	</form>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>