<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>상품 목록</title>
<script type="text/javascript">
	function deleteConfirm(product_seq){
		
		if(confirm("정말로 삭제하시겠습니까? ")){
			location.href = "/product/delete?product_seq="+product_seq;
		}
		
	}



</script>
<style type="text/css">
	.pointer{
		cursor: pointer;
	}
</style>

</head>
<body>
	
	<table class="table table-striped">
		<tr>
			<th>상품명</th>
			<th>상품수량</th>
			<th>상품가격</th>
			<th>상품내용</th>
			<th>삭제</th>
		</tr>
	
	<c:forEach items="${product_list }" var="item">
		<tr>
			<td>
				<a href="/product/search?product_seq=${item.product_seq }">
					${item.product_nm }
				</a>
			</td>
			<td>${item.product_qty }</td>
			<td>${item.product_price }</td>
			<td>${item.product_comments }</td>
			<td>
				<a class="pointer" onclick="deleteConfirm(${item.product_seq })">삭제</a>
			</td>
		</tr>
	</c:forEach>
	
	</table>

	<a href="/product/insert_form">상품 등록 폼</a>
	
	
	
	
	
	
	
</body>
</html>