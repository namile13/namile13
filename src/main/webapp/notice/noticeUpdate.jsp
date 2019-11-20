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
            <small>공지사항수정</small>
        </h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="getNoticeList.do">리스트</a>
            </li>
            <li class="breadcrumb-item active">공지사항수정</li>
        </ol>

        <!-- Contact Form -->
        <!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
        <div class="row">
            <div class="col-lg-8 mb-4">
                <h3>리뷰수정</h3>
                <form name="sentMessage" id="contactForm" action="updateNotice.do" method="post">
                	<input type="hidden" name="rseq" value="${notice.nseq}">
                	<input type="hidden" name="id" value="${member.id}">
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>제목:</label>
                            <input type="text" class="form-control" id="title" name="title" value="${notice.title}" required>
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>글작성:</label>
                            <textarea rows="10" cols="100" class="form-control" id="content" name="content" required maxlength="999" style="resize:none">${notice.content}</textarea>
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