package com.human.biz.payment;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PaymentServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		PaymentService paymentService = (PaymentService) container.getBean("paymentService");
		
/*		Timestamp date1 = Timestamp.valueOf("2019-11-20 00:00:00");
		Timestamp date2 = Timestamp.valueOf("2019-11-30 00:00:00");
		
		PaymentVO pVo = new PaymentVO();
		pVo.setId("admin");
		pVo.setPseq(9);
		pVo.setPeople(3);
		pVo.setPrice(1000000);
		pVo.setStartDate(date1);
		pVo.setEndDate(date2);
		
		paymentService.insertPayment(pVo);
		
		PaymentVO payment = new PaymentVO();
		
		List<PaymentVO> list = paymentService.getPaymentList(payment);
		
		for(PaymentVO paymentVO : list) {
			System.out.println(paymentVO.toString());
		}
		
		pVo.setPayseq(1);
		
		paymentService.updatePaymentCancle(pVo);
		
		PaymentVO payment1 = new PaymentVO();
		
		list = paymentService.getPaymentList(payment1);
		
		for(PaymentVO paymentVO : list) {
			System.out.println(paymentVO.toString());
		}
		
		pVo.setPayseq(1);
		
		paymentService.updatePaymentFinish(pVo);
		
		PaymentVO payment2 = new PaymentVO();
		
		list = paymentService.getPaymentList(payment2);
		
		for(PaymentVO paymentVO : list) {
			System.out.println(paymentVO.toString());
		}
*/		
		container.close();

	}

}
