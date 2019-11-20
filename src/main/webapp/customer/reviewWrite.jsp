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
            <small>리뷰작성</small>
        </h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="getReviewList.do">리스트</a>
            </li>
            <li class="breadcrumb-item active">리뷰작성</li>
        </ol>

        <!-- Contact Form -->
        <!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
        <div class="row">
            <div class="col-lg-8 mb-4">
                <h3>Send us a Message</h3>
                <form name="sentMessage" id="contactForm" action="insertReview.do" method="post" enctype="multipart/form-data">
                	<input type="hidden" name="id" value="${member.id}">
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>닉네임:</label>
                            <input type="text" class="form-control" id="nickname" name="nickname" value="${member.nickname}" required readonly>
                            <p class="help-block"></p>
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>제목:</label>
                            <input type="text" class="form-control" id="title" name="title" required data-validation-required-message="제목을 적어주세요.">
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>이미지:</label>
                            <input type="file" class="form-control" id="uploadFile" name="uploadFile">
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>글작성:</label>
                            <textarea rows="10" cols="100" class="form-control" id="content" name="content" required data-validation-required-message="내용을 작성해주세요." maxlength="999" style="resize:none"></textarea>
                        </div>
                    </div>
                    <div id="success"></div>
                    <!-- For success/fail messages -->
                    <button type="submit" class="btn btn-primary" id="sendMessageButton">작성하기</button>
                </form>
            </div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</body>
</html>
<%@ include file="../footer.jsp" %>