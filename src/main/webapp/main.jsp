<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <!-- Slide One - Set the background image for this slide in the line below -->
                <div class="carousel-item active" style="background-image: url('images/photo01.jpg')">
                    <div class="carousel-caption d-none d-md-block">
                        <h3>First Slide</h3>
                        <p>This is a description for the first slide.</p>
                    </div>
                </div>
                <!-- Slide Two - Set the background image for this slide in the line below -->
                <div class="carousel-item" style="background-image: url('images/photo02.jpg')">
                    <div class="carousel-caption d-none d-md-block">
                        <h3>Second Slide</h3>
                        <p>This is a description for the second slide.</p>
                    </div>
                </div>
                <!-- Slide Three - Set the background image for this slide in the line below -->
                <div class="carousel-item" style="background-image: url('images/photo03.jpg')">
                    <div class="carousel-caption d-none d-md-block">
                        <h3>Third Slide</h3>
                        <p>This is a description for the third slide.</p>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
            </a>
        </div>
    </header>
            
    <!-- Page Content -->
    <div class="container">

        <!-- Portfolio Section -->
        <h2>Best Item</h2>

        <div class="row">
        	<c:forEach items="${productBestList}" var="product">
	            <div class="col-lg-4 col-sm-6 portfolio-item">
	                <div class="card h-100">
	                	<input type="hidden" name="pseq" value="${product.pseq}">
	                    <a href="getProductDetail.do?pseq=${product.pseq}"><img class="card-img-top" src="${product.image}" name="image"></a>
	                    <div class="card-body">
	                        <h4 class="card-title">
	                            <a href="getProductDetail.do?pseq=${product.pseq}">${product.name}</a>
	                        </h4>
	                        <p class="card-text">${product.content}</p>
	                        <fmt:formatNumber maxFractionDigits="3" value="${product.price}"/>원<br>
	                        <fmt:formatDate value="${product.startDate}" pattern="yyyy-MM-dd"/> ~ 
	                        <fmt:formatDate value="${product.endDate}" pattern="yyyy-MM-dd"/>
	                    </div>
	                </div>
	            </div>
            </c:forEach>
        </div>
        <!-- /.row -->

        <h2>New Item</h2>

        <div class="row">
        	<c:forEach items="${productNewList}" var="product">
	            <div class="col-lg-4 col-sm-6 portfolio-item">
	                <div class="card h-100">
	                	<input type="hidden" name="pseq" value="${product.pseq}">
	                    <a href="getProductDetail.do?pseq=${product.pseq}"><img class="card-img-top" src="${product.image}" name="image"></a>
	                    <div class="card-body">
	                        <h4 class="card-title">
	                            <a href="getProductDetail.do?pseq=${product.pseq}">${product.name}</a>
	                        </h4>
	                        <p class="card-text">${product.content}</p>
	                        <fmt:formatNumber maxFractionDigits="3" value="${product.price}"/>원<br>
	                        <fmt:formatDate value="${product.startDate}" pattern="yyyy-MM-dd"/> ~ 
	                        <fmt:formatDate value="${product.endDate}" pattern="yyyy-MM-dd"/>
	                    </div>
	                </div>
	            </div>
            </c:forEach>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
    
</body>
</html>
<%@ include file="footer.jsp" %>