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
	<!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <h1 class="mt-4 mb-3">고객센터
            <small>리뷰수정</small>
        </h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="getReviewList.do">리스트</a>
            </li>
            <li class="breadcrumb-item active">리뷰수정</li>
        </ol>

        <!-- Contact Form -->
        <!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
        <div class="row">
            <div class="col-lg-8 mb-4">
                <h3>리뷰수정</h3>
                <form name="sentMessage" id="contactForm" action="updateReview.do" method="post">
                	<input type="hidden" name="rseq" value="${review.rseq}">
                	<input type="hidden" name="id" value="${review.id}">
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>닉네임:</label>
                            <input type="text" class="form-control" id="nickname" name="nickname" value="${member.id}" required readonly>
                            <p class="help-block"></p>
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>제목:</label>
                            <input type="text" class="form-control" id="title" name="title" value="${review.title}" required>
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>이미지:</label>
                            <input type="file" class="form-control" id="image" name="image" value="${review.image}">
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>글작성:</label>
                            <textarea rows="10" cols="100" class="form-control" id="content" name="content" required maxlength="999" style="resize:none">${review.content}</textarea>
                        </div>
                    </div>
                    <div id="success"></div>
                    <!-- For success/fail messages -->
                    <button type="submit" class="btn btn-primary" id="sendMessageButton">수정하기</button>
                </form>
            </div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</body>
</html>
<%@ include file="../footer.jsp" %>