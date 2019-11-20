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
            <small>자주하는 질문</small>
        </h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="index.jsp">Home</a>
            </li>
            <li class="breadcrumb-item active">자주하는 질문</li>
        </ol>

        <div class="mb-4" id="accordion" role="tablist" aria-multiselectable="true">
            <div class="card">
                <div class="card-header" role="tab" id="headingOne">
                    <h5 class="mb-0">
                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                        	해외여행자 보험이란??
                        </a>
                    </h5>
                </div>

                <div id="collapseOne" class="collapse show" role="tabpanel" aria-labelledby="headingOne">
                    <div class="card-body">
                        여행도중에 우연히 발생하게 되는 각종 사고 및 질병, 조난 시 구조비용, 휴대품의 도난 손해 등의 보상을 목적으로 하는 보험.

						해외여행자보험의 실손의료비는 여러 보험사에 중복 계약을 했더라도 중복보상이 안되고 비례보상으로 처리된다.
						(단 , 사망보험금은 중복보상 가능)
						( 휴대품 손해, 배상책임도 비례보상으로 처리)
						국내에서 상해 및 질병으로 치료 받는경우 발생한 실손의료비에 대해 100% 보상을 받을수 없다. 자기부담금이 설정되어 있어 그만큼의 비용을 제외하고 보상을 받을수 있다.
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="card-header" role="tab" id="headingTwo">
                    <h5 class="mb-0">
                        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                        	패키지여행이 끝나고 현지에서 돌아오는 날짜를 변경할수있나요?
                        </a>
                    </h5>
                </div>
                <div id="collapseTwo" class="collapse" role="tabpanel" aria-labelledby="headingTwo">
                    <div class="card-body">
                        일정이 모두 끝난 후 개별귀국을 원하실 경우는 출발전에 우선 돌아오실 날짜와 좌석가능여부를 사전에 체크.예약과 발권을 완료 하셔야하며 한국에서 혹은 현지에서 돌아오실때 일정금액을 현지공항에서 지불하셔야 하시면 됩니다.
						노선에 따라서 또는 항공편에 따라서 리턴변경이 불가한 경우도 있으니, 출발전에 필히 가능여부를 체크하시는 것이 중요합니다.
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="card-header" role="tab" id="headingThree">
                    <h5 class="mb-0">
                        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                        	패키지여행이란 무엇인가요?
                        </a>
                    </h5>
                </div>
                <div id="collapseThree" class="collapse" role="tabpanel" aria-labelledby="headingThree">
                    <div class="card-body">
                        여행사에서 미리 세팅해 놓은 항공권, 관광일정, 숙박, 식사, 교통 등을 이용하여 여행하 는 것을 패키지 여행이라고 합니다.
						보통 10명~15명이 한 팀이 되어 단체로 관광을 하기 때문에 개인적으로 가시는 여행보다 저렴하게 여행하실 수 있습니다.
                    </div>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container -->
</body>
</html>
<%@ include file="../footer.jsp" %>