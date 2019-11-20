<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		body {
			background-color: #ddd;
			font-family: Verdana;
		}
		#wrap {
			margin: 0 20px;
		}
		h1 {
			font-family: "Times New Roman", Times, serif;
			font-size: 45px;
			color: #CCC;
			font-weight: normal;
		}
		input[type=button], input[type=submit] {
			float: right;
		}
	</style>
	<script type="text/javascript">
		function idok() {
			opener.frm.email.value = "${param.email}";
			opener.frm.reemail.value = "${param.email}";
			self.close();
		}
	</script>
</head>
<body>
	<div class="page-content">
		<div class="form-v5-content">
			<form class="form-detail" action="getMemberByEmail.do" method="get" name="frm">
				<h2>이메일 중복</h2>
				<div class="form-row">
					<label for="email">이메일</label>
						<input type=text id="email" name="email" value="${param.email}">
						<input type=submit value="검색" class="submit"><br>
					<i class="fas fa-user"></i>
				</div>
				<br>
				<div class="form-row-last">
					<c:if test="${member != null}">
						<script type="text/javascript">
							opener.document.formm.email.value="";
						</script>
						${param.email}는 이미 사용중인 이메일입니다.
					</c:if>
					<c:if test="${member == null}">
						${param.email}는 사용 가능한 이메일입니다.
						<input type="button" value="사용" class="cancel" onclick="idok()">
					</c:if>
				</div>
			</form>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>