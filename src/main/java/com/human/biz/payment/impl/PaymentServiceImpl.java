package com.human.biz.payment.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.payment.PaymentService;
import com.human.biz.payment.PaymentVO;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentDAO paymentDAO;

	@Override
	public int getTotleCount(CriteriaVO cri) {
		System.out.println("===>paymentService로 처리");
		
		return paymentDAO.getTotleCount(cri);
	}

	@Override
	public List<PaymentVO> getPaymentList(CriteriaVO cri) {
		System.out.println("===>paymentService로 처리");
		
		return paymentDAO.getPaymentList(cri);
	}

	@Override
	public void insertPayment(PaymentVO pVo) {
		System.out.println("===>paymentService로 처리");
		
		paymentDAO.insertPayment(pVo);
	}

	@Override
	public void updatePaymentCancle(PaymentVO pVo) {
		System.out.println("===>paymentService로 처리");
		
		paymentDAO.updatePaymentCancle(pVo);
	}

	@Override
	public void updatePaymentFinish(PaymentVO pVo) {
		System.out.println("===>paymentService로 처리");
		
		paymentDAO.updatePaymentFinish(pVo);
	}

	@Override
	public void deletePayment(PaymentVO pVo) {
		System.out.println("===>paymentService로 처리");
		
		paymentDAO.deletePayment(pVo);
	}

}
