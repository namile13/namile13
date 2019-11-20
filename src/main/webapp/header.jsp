<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js" type="text/javascript"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js" type="text/javascript"></script>
    <script src="vendor/bootstrap/js/main.js" type="text/javascript"></script>
    <script src="vendor/bootstrap/js/member.js" type="text/javascript"></script>
    <!-- Custom styles for this template -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/portfolio.css" rel="stylesheet">
    <link href="vendor/bootstrap/css/util.css" rel="stylesheet">
    <script type="text/javascript">
    	$(document).ready(function(){
    		$('#searchButton').on('click', function(){
        		var $searchKeyword = $('#searchKeyword');
        		
    			var searchKeywordval = $searchKeyword.val();
    			
    			var url = "getProductSearchList.do?searchKeyword="
    				+ encodeURIComponent(searchKeywordval, "UTF-8");
        		window.location.href = url;
    		})
    		
    		$('#paging a').on('click', function(e){
    			e.preventDefault();
    			$('#page').val($(this).attr("href"));
    			pagingFrm.submit();
    		});
    	})
    </script>
</head>
<body>
	<!-- Navigation -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
        <div class="container">
            <a class="navbar-brand" href="index.jsp">투어</a>
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                	<c:choose>
                		<c:when test="${empty member}">
		                    <li class="nav-item">
		                        <a class="nav-link" href="login.do">로그인</a>
		                    </li>
		                    <li class="nav-item">
		                        <a class="nav-link" href="insertMember.do">회원가입</a>
		                    </li>
                    	</c:when>
                    	<c:otherwise>
                    		<li class="nav-item" style="margin-top: 5px;">
                    			<span style="color: #ddd;">${member.name}(${member.id})님 반갑습니다.</span>
                    		</li>
                    		<li class="nav-item">
                    			<a class="nav-link" href="logout.do">로그아웃</a>
                    		</li>
		                    <li class="nav-item dropdown">
		                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		                          	고객센터
		                        </a>
		                        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
		                            <a class="dropdown-item" href="mostOfQnA.do">자주 찾는 질문</a>
		                            <a class="dropdown-item" href="getQnAList.do">문의하기</a>
		                            <a class="dropdown-item" href="getNoticeList.do">공지사항</a>
		                            <a class="dropdown-item" href="getReviewList.do">리뷰</a>
		                        </div>
		                    </li>
		                    <li class="nav-item dropdown">
		                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		                           	마이페이지
		                        </a>
		                        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
		                            <a class="dropdown-item" href="updateMember.do?id=${member.id}">내 정보확인</a>
		                            <a class="dropdown-item" href="getPaymentList.do?id=${member.id}">내역</a>
		                            <a class="dropdown-item" href="getCartList.do?id=${member.id}">장바구니</a>
		                        </div>
		                    </li>
                    	</c:otherwise>
                    </c:choose>
                    <li class="nav-item">
                        <a class="nav-link" href="getProductList.do">상품</a>
                    </li>
                    <li class="nav-item">
                        <div class="input-group">
                            <input type="text" class="form-control" id="searchKeyword" name="searchKeyword" value="${searchKeyword}" placeholder="Search for...">
                            <span class="input-group-btn">
                                <button class="btn btn-secondary" type="button" id="searchButton">Go!</button>
                            </span>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</body>
</html>