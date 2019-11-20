package com.human.biz.payment;

import java.util.List;

import com.human.biz.pagination.CriteriaVO;

public interface PaymentService {
	
	// 내역 수 구하기
	int getTotleCount(CriteriaVO cri);

	// 결제 내역 리스트
	List<PaymentVO> getPaymentList(CriteriaVO cri);

	// 결제하기 등록
	void insertPayment(PaymentVO pVo);

	// 결제하기 취소하기로 수정
	void updatePaymentCancle(PaymentVO pVo);

	// 결제하기 완료하기로 수정
	void updatePaymentFinish(PaymentVO pVo);

	// 결제하기 삭제
	void deletePayment(PaymentVO pVo);

}