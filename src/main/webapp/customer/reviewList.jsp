<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <h1 class="mt-4 mb-3">고객센터
            <small>리뷰리스트</small>
        </h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="insertReview.do">새글쓰기</a>
            </li>
            <li class="breadcrumb-item active">리뷰</li>
        </ol>

        <!-- Project Two -->
        <c:forEach items="${reviewList}" var="review">
	        <div class="row">
	            <div class="col-md-5">
	                <input type="hidden" name="rseq" value="${review.rseq}">
	                <h3 name="title"><a href="getReview.do?rseq=${review.rseq}">${review.title}</a></h3>
	                <span class="glyphicon glyphicon-chevron-right" name="nickname">${review.nickname}</span>
	                <span class="glyphicon glyphicon-chevron-right" name="regdate">${review.regdate}</span>
	            </div>
	        </div>
        	<hr>
        </c:forEach>
        <!-- /.row -->

        <!-- Pagination -->
        <ul class="pagination justify-content-center" id="paging">
        	<c:if test="${paging.prev}">
	            <li class="page-item">
	                <a class="page-link" href="${paging.startPage - 1}" aria-label="Previous">
	                    <span aria-hidden="true">&laquo;</span>
	                    <span class="sr-only">Previous</span>
	                </a>
	            </li>
            </c:if>
            <c:forEach var="number" begin="${paging.startPage}" end="${paging.endPage}">
	            <li class="page-item">
	                <a class="page-link" href="${number}">${number}</a>
	            </li>
            </c:forEach>
            <c:if test="${paging.next}">
	            <li class="page-item">
	                <a class="page-link" href="${paging.endPage + 1}" aria-label="Next">
	                    <span aria-hidden="true">&raquo;</span>
	                    <span class="sr-only">Next</span>
	                </a>
	            </li>
            </c:if>
        </ul>
        
        <form id="pagingFrm" name="pagingFrm" action="getReviewList.do" method="get">
        	<input type="hidden" id="page" name="page" value="${paging.cri.page}">
        	<input type="hidden" id="perPageNum" name="perPageNum" value="${paging.cri.perPageNum}">
        </form>

    </div>
    <!-- /.container -->
</body>
</html>
<%@ include file="../footer.jsp" %>