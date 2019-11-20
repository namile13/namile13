<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="page-content">
		<div class="form-v5-content">
			<form class="form-detail" action="login.do" method="post">
				<h2>로그인</h2>
				<div class="form-row">
					<label for="id">아이디</label>
					<input type="text" name="id" id="id" class="input-text" placeholder="아이디" required>
					<i class="fas fa-user"></i>
				</div>
				<div class="form-row">
					<label for="password">비밀번호</label>
					<input type="password" name="password" id="password" class="input-text" placeholder="비밀번호" required>
					<i class="fas fa-envelope"></i>
				</div>
				<div class="form-row-last">
                    <input type="submit" name="register" class="register" value="로그인">&nbsp;
                    <input type="button" name="register" class="register" value="회원가입" onclick="location.href='insertMember.do'">
                </div>
                <div class="form-row-last">
                    <a href="javascript:findId()">아이디 찾기</a>&nbsp;
                    <a href="javascript:findPwd()">비밀번호 찾기</a>
                </div>
            </form>
		</div>
	</div>
	
<%@ include file="../footer.jsp" %>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>