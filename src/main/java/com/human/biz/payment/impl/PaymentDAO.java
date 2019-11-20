package com.human.biz.payment.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.payment.PaymentVO;

@Repository
public class PaymentDAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// 내역 수 구하기
	public int getTotleCount(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getTotleCount처리");
		
		return sqlTemplate.selectOne("PaymentDAO.getTotleCount", cri);
	}
	
	// 결제 내역 리스트
	public List<PaymentVO> getPaymentList(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getPaymentList처리");
		
		return sqlTemplate.selectList("PaymentDAO.getPaymentList", cri);
	}
	
	// 결제하기 등록
	public void insertPayment(PaymentVO pVo) {
		System.out.println("--->sqlTemplate으로 insertPayment처리");
		
		sqlTemplate.insert("PaymentDAO.insertPayment", pVo);
	}
	
	// 결제하기 취소하기로 수정
	public void updatePaymentCancle(PaymentVO pVo) {
		System.out.println("--->sqlTemplate으로 updatePaymentCancle처리");
		
		sqlTemplate.update("PaymentDAO.updatePaymentCancle", pVo);
	}
	
	// 결제하기 완료하기로 수정
	public void updatePaymentFinish(PaymentVO pVo) {
		System.out.println("--->sqlTemplate으로 updatePaymentFinish처리");
		
		sqlTemplate.update("PaymentDAO.updatePaymentFinish", pVo);
	}
	
	// 결제하기 삭제
	public void deletePayment(PaymentVO pVo) {
		System.out.println("--->sqlTemplate으로 deletePayment처리");
		
		sqlTemplate.delete("PaymentDAO.deletePayment", pVo);
	}

}
