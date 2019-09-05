<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구매 폼</title>
<script type="text/javascript">
	function formCheck(){
		//1. 구매 수량의 값을 가져온다.
		var sold_qty = document.getElementById("sold_qty").value;
		//2. 상품 수량의 값을 가져온다.
		var product_qty = document.getElementById("product_qty").value;
		
		//3. 구매 수량이 상품 수량보다 같거나 작은지 비교한다.
		if(parseInt(sold_qty) > parseInt(product_qty)){
			alert("구매 수량을 알맞게 입력하세요.");
			return false;
		}
		//참일경우만 서브밋
		return true;
	}
</script>
</head>
<body>

<form action="/product/buy" method="post" onsubmit="return formCheck()">
	상품명 : ${result.product_nm } <br>
	상품 수량 : ${result.product_qty } <br>
	상품 가격 : ${result.product_price } <br>
	상품 내용 : ${result.product_comments } <br>
	<br>
	구매 수량 : <input type="number" name="sold_qty" id="sold_qty"> <br>
	<input type="hidden" name="product_seq" value="${result.product_seq }">
	<input type="hidden" value="${result.product_qty }" id="product_qty">
	
	<input type="submit" value="구매하기">
	
</form>






</body>
</html>