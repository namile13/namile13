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
			<form class="form-detail" action="updateMember.do" method="post" name="frm">
				<h2>내 정보</h2>
				<div class="form-row">
					<label for="id">아이디</label>
					<input type="text" name="id" id="id" class="input-text" value="${member.id}" readonly>
					<i class="fas fa-user"></i>
				</div>
				<div class="form-row">
					<label for="password">비밀번호</label>
					<input type="password" name="password" id="password" class="input-text" placeholder="비밀번호" required>
					<i class="fas fa-envelope"></i>
				</div>
				<div class="form-row">
					<label for="name">이름</label>
					<input type="text" name="name" id="name" class="input-text" value="${member.name}" required>
					<i class="fas fa-envelope"></i>
				</div>
				<div class="form-row">
					<label for="nickname">닉네임</label>
					<input type="text" name="nickname" id="nickname" class="input-text" value="${member.nickname}" required>
					<i class="fas fa-envelope"></i>
					<input type="hidden" name="renickname">
					<input type="button" value="확인" class="check-button" onclick="return check_nickname()">
				</div>
				<div class="form-row">
					<label for="email">이메일</label>
					<input type="text" name="email" id="email" class="input-text" value="${member.email}" required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}">
					<i class="fas fa-envelope"></i>
					<input type="hidden" name="reemail">
					<input type="button" value="확인" class="check-button" onclick="return check_email()">
				</div>
				<div class="form-row">
					<label for="phone">전화번호</label>
					<input type="text" name="phone" id="phone" class="input-text" value="${member.phone}" required>
					<i class="fas fa-envelope"></i>
				</div>
				<div class="form-row">
					<label for="address">주소</label>
					<input type="text" name="address" id="address" class="input-text" value="${member.address}" required>
					<i class="fas fa-envelope"></i>
				</div>
				<div class="form-row-last">
					<input type="submit" name="register" class="register" value="수정하기">&nbsp;
					<input type="button" name="register" class="register" value="탈퇴하기" onclick="location.href='deleteMember.do?id=${member.id}'">
				</div>
			</form>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
<%@ include file="../footer.jsp" %>