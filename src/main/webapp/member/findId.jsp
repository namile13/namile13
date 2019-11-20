<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <!-- Bootstrap core JavaScript -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.bundle.min.js"></script>
    <script src="js/member.js"></script>
    <style type="text/css">
		.form-v5-content  {
			background: #ddd;
			width: 370px;
			border-radius: 8px;
			-o-border-radius: 8px;
			-ms-border-radius: 8px;
			-moz-border-radius: 8px;
			-webkit-border-radius: 8px;
			font-family: 'Roboto', sans-serif;
			color: #333;
			font-weight: 400;
			position: relative;
			font-size: 18px;
		}
		.form-v5-content .form-detail {
			padding: 10px 15px 10px 15px;
			position: relative;
		}
		.form-detail h2 {
			font-weight: 700;
			font-size: 25px;
			text-align: center;
			position: relative;
		}
		.form-detail .form-row {
			position: relative;
		}
		.form-detail .form-row-last {
			text-align: center;
		}
		.form-detail input {
			width: 88%;
		    padding: 10.5px 15px;
		    border: 1px solid #e5e5e5;
		    appearance: unset;
		    -moz-appearance: unset;
		    -webkit-appearance: unset;
		    -o-appearance: unset;
		    -ms-appearance: unset;
		    outline: none;
		    -moz-outline: none;
		    -webkit-outline: none;
		    -o-outline: none;
		    -ms-outline: none;
		    border-radius: 4px;
			-o-border-radius: 4px;
			-ms-border-radius: 4px;
			-moz-border-radius: 4px;
			-webkit-border-radius: 4px;
			font-family: 'Roboto', sans-serif;
			font-weight: 400;
			font-size: 18px;
		}
		.form-detail .register {
			font-size: 18px;
			color: #fff;
			background: #3786bd;
			border-radius: 5px;
			-o-border-radius: 5px;
			-ms-border-radius: 5px;
			-moz-border-radius: 5px;
			-webkit-border-radius: 5px;
			width: 180px;
			box-shadow: 0px 5px 15px 0px rgba(0, 0, 0, 0.2);
			-o-box-shadow: 0px 5px 15px 0px rgba(0, 0, 0, 0.2);
			-ms-box-shadow: 0px 5px 15px 0px rgba(0, 0, 0, 0.2);
			-moz-box-shadow: 0px 5px 15px 0px rgba(0, 0, 0, 0.2);
			-webkit-box-shadow: 0px 5px 15px 0px rgba(0, 0, 0, 0.2);
			border: none;
			margin: 10px 0;
			cursor: pointer;
		}
		.form-detail .register:hover {
			background: #2f73a3;
		}
    </style>
</head>
<body>
	<div class="page-content">
		<div class="form-v5-content">
			<form class="form-detail" method="post">
				<h2>아이디 찾기</h2>
				<div class="form-row">
					<label for="phone">전화번호</label>
					<input type="text" name="phone" id="phone" class="input-text" placeholder="전화번호" required>
					<i class="fas fa-envelope"></i>
				</div>
				<div class="form-row">
					<label for="email">이메일</label>
					<input type="text" name="email" id="email" class="input-text" placeholder="이메일" required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}">
					<i class="fas fa-envelope"></i>
				</div>
				<div class="form-row-last">
					<input type="submit" name="register" class="register" value="아이디 찾기" onclick="return findId()">
				</div>
				<div class="form-row-last">
					<c:choose>
						<c:when test="${member != null}">
							고객님의 아이디는 ${member.id} 입니다.
						</c:when>
						<c:otherwise>
							아이디가 없습니다.
						</c:otherwise>
					</c:choose>
				</div>
			</form>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>