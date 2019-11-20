<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <a href="getProductList.do">리스트</a>
            </li>
            <li class="breadcrumb-item active">일정</li>
        </ol>

        <div class="row">
        	<c:forEach items="${productDetailList}" var="product">
	            <div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
	                <div class="card h-100">
	                	<input type="hidden" name="pseq" value="${product.pseq}">
	                    <img class="card-img-top" src="${product.image}" name="image">
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

        <form class="form-detail" action="insertCart.do?pseq=${param.pseq}" method="post">
			<div class="form-row-last">
                <input type="submit" name="register" class="register" value="장바구니 담기">
            </div>
        </form>

    </div>
    <!-- /.container -->
</body>
</html>
<%@ include file="../footer.jsp" %>