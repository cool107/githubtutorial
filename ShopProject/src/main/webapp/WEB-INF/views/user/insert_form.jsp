<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
<script type="text/javascript">
	function formCheck(){
		var user_id = document.getElementById("user_id").value;
		
		if(user_id == ""){
			alert("아이디를 입력해 주세요.");
			return false;
		}
		
		if(user_id.length < 4 || user_id.length > 8){
			alert("아이디를 4~8글자 사이로 입력해 주세요.");
			return false;
		}
		
		return true;
		
	}
</script>
</head>
<body>
	<form action="/user/insert" method="post" onsubmit="return formCheck()">
		ID : <input type="text" name="user_id" id="user_id" class="id_class"><br>
		PW : <input type="password" name="user_pw" id="user_pw"><br>
		이름 : <input type="text" name="user_nm" id="user_nm"><br>
		남자 <input type="radio" name="user_gender" value="0" checked="checked">
		여자 <input type="radio" name="user_gender" value="1"><br>
		<input type="submit" value="가입하기">
	</form>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>