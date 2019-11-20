<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../header.jsp" %>
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
        <h1 class="mt-4 mb-3">상품
            <small>리스트</small>
        </h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="index.jsp">Home</a>
            </li>
            <li class="breadcrumb-item active">상품리스트</li>
        </ol>

        <!-- Project One -->
        <c:forEach items="${productList}" var="product">
	        <div class="row">
	            <div class="col-md-7">
	                <input type="hidden" name="pseq" value="${product.pseq}">
	                <a href="getProductDetail.do?pseq=${product.pseq}">
	                    <img class="img-fluid rounded mb-3 mb-md-0" src="${product.image}" name="image">
	                </a>
	            </div>
	            <div class="col-md-5">
	                <h3><a href="getProductDetail.do?pseq=${product.pseq}">${product.name}</a></h3>
	                <p>${product.content}</p>
	                <fmt:formatNumber maxFractionDigits="3" value="${product.price}"/>원<br>
	                <fmt:formatDate value="${product.startDate}" pattern="yyyy-MM-dd"/> ~ 
	                <fmt:formatDate value="${product.endDate}" pattern="yyyy-MM-dd"/>
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
        
        <form id="pagingFrm" name="pagingFrm" action="getProductList.do" method="get">
        	<input type="hidden" id="page" name="page" value="${paging.cri.page}">
        	<input type="hidden" id="perPageNum" name="perPageNum" value="${paging.cri.perPageNum}">
        </form>

    </div>
    <!-- /.container -->
</body>
</html>
<%@ include file="../footer.jsp" %>