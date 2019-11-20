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
        <h1 class="mt-4 mb-3">리뷰페이지
            <small>by
                <a href="#">리뷰</a>
            </small>
        </h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="getQnAList.do">리스트</a>
            </li>
            <c:if test="${qna.id == member.id}">
	            <li class="breadcrumb-item">
	                <a href="updateQnA.do?qseq=${qna.qseq}">수정하기</a>
	            </li>
	            <li class="breadcrumb-item">
	                <a href="deleteQnA.do?qseq=${qna.qseq}">삭제하기</a>
	            </li>
            </c:if>
        </ol>

        <div class="row">

            <!-- Post Content Column -->
            <div class="col-lg-8" style="border: 1px">

                <!-- Preview Title -->
                <input type="hidden" name="qseq" value="${qna.qseq}">
                <h1 type="text" class="img-fluid rounded" name="title">${qna.title}</h1>

                <!-- Date/Time -->
                <p name="regdate">${qna.regdate}</p>

                <!-- Post Content -->
                <p class="lead" name="content">${qna.content}</p>
                <hr>

                <!-- Comments Form -->
                <div class="card my-4">
                    <h5 class="card-header">댓글:</h5>
                    <div class="card-body">
                        <form action="insertQnAComment.do">
                            <div class="form-group">
                				<input type="hidden" name="qseq" value="${qna.qseq}">
                            	<input type="hidden" name="id" value="${member.id}">
                            	<input type="hidden" name="nickname" value="${member.nickname}">
                                <textarea class="form-control" rows="3" name="content"></textarea>
                            </div>
                            <button type="submit" class="btn btn-primary">등록하기</button>
                        </form>
                    </div>
                </div>

                <!-- Single Comment -->
                <c:forEach items="${qnaCommentList}" var="qnaComment">
	                <div class="media mb-4">
	                	<input type="hidden" name="qcseq" value="${qnaComment.qcseq}">
	                	<input type="hidden" name="qseq" value="${qnaComment.qseq}">
	                    <input type="hidden" name="id" value="${qnaComment.id}">
	                    <div class="media-body" name="content">
	                        <h5 class="mt-0" name="nickname">${qnaComment.nickname}</h5>
	                        ${qnaComment.content}
	                    </div>
	                    <c:if test="${qnaComment.id == member.id}">
		                	<input type="button" name="register" class="register" value="삭제하기" onclick="location.href='deleteQnAComment.do?qcseq=${qnaComment.qcseq}&qseq=${qnaComment.qseq}'">
	                    </c:if>
	                </div>
	                <hr>
                </c:forEach>

            </div>

        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</body>
</html>
<%@ include file="../footer.jsp" %>