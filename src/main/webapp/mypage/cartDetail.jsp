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
            <small>상품</small>
        </h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="getCartList.do">장바구니</a>
            </li>
            <li class="breadcrumb-item active">일정</li>
        </ol>

        <form class="form-detail" action="insertPayment.do" method="post" style="width: 30%;">
			<div class="form-row-last">
				<input type="hidden" name="cseq" value="${cart.cseq}">
				<input type="hidden" name="id" value="${cart.id}">
				<input type="hidden" name="pseq" value="${cart.pseq}">
				<input type="hidden" name="name" value="${cart.name}">
				<input type="hidden" name="image" value="${cart.image}">
				<input type="hidden" name="content" value="${cart.content}">
				<input type="hidden" name="result" value="${cart.result}">
	            <span>
	            	<input type="hidden" name="startDate" value="${cart.startDate}">
	            	<fmt:formatDate value="${cart.startDate}" pattern="yyyy-MM-dd"/> ~ 
	            </span>
	            <span>
	            	<input type="hidden" name="endDate" value="${cart.endDate}">
	            	<fmt:formatDate value="${cart.endDate}" pattern="yyyy-MM-dd"/>
	            </span><br>
	            <span>
	            	<input type="hidden" name="price" value="${cart.price}">
	            	<fmt:formatNumber maxFractionDigits="3" value="${cart.price}"/>원<br>
	            </span>
				<input type="text" name="people" placeholder="인원"><br>
                <input type="submit" name="register" class="register" value="결제하기" style="width:45%">
                <input type="button" name="register" class="register" value="삭제하기" style="width:45%" onclick="location.href='deleteCart.do?cseq=${cart.cseq}&id=${cart.id}'">
            </div>
        </form>

        <div class="row">
        	<c:forEach items="${productDetailList}" var="product">
	            <div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
	                <div class="card h-100">
	                	<input type="hidden" name="pseq" value="${product.pseq}">
	                    <img class="card-img-top" src="http://placehold.it/700x400" name="image">
	                    <div class="card-body">
	                        <h4 class="card-title">
	                            ${product.name}
	                        </h4>
	                        <p class="card-text">${product.content}</p>
	                    </div>
	                </div>
	            </div>
            </c:forEach>
        </div>

    </div>
    <!-- /.container -->
</body>
</html>
<%@ include file="../footer.jsp" %>