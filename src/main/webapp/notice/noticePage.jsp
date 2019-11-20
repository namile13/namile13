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
        <h1 class="mt-4 mb-3">공지사항
            <small>by 공지사항</small>
        </h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="getNoticeList.do">리스트</a>
            </li>
            <c:if test="${member.id == 'admin'}">
	            <li class="breadcrumb-item">
	                <a href="updateNotice.do?nseq=${notice.nseq}">수정하기</a>
	            </li>
	            <li class="breadcrumb-item">
	                <a href="deleteNotice.do?nseq=${notice.nseq}">삭제하기</a>
	            </li>
            </c:if>
        </ol>

        <div class="row">

            <!-- Post Content Column -->
            <div class="col-lg-8" style="border: 1px">

                <!-- Preview Title -->
                <input type="hidden" name="rseq" value="${notice.nseq}">
                <h1 type="text" class="img-fluid rounded" name="title">${notice.title}</h1>

                <!-- Date/Time -->
                <p name="regdate">${notice.regdate}</p>

                <!-- Post Content -->
                <p class="lead" name="content">${notice.content}</p>
                <hr>

            </div>

        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</body>
</html>
<%@ include file="../footer.jsp" %>