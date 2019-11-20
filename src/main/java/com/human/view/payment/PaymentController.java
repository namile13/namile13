package com.human.view.payment;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.biz.cart.CartService;
import com.human.biz.cart.CartVO;
import com.human.biz.member.MemberVO;
import com.human.biz.pagination.CriteriaVO;
import com.human.biz.pagination.PageMakerVO;
import com.human.biz.payment.PaymentService;
import com.human.biz.payment.PaymentVO;

@Controller
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/getPaymentList.do")
	public String getPaymentList(PaymentVO pVo, CriteriaVO cri, Model model, HttpSession session) {
		System.out.println("내역페이지로 이동");
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		cri.setId(member.getId());
		
		List<PaymentVO> paymentList = paymentService.getPaymentList(cri);
		
		int total = paymentService.getTotleCount(cri);
		
		model.addAttribute("paymentList", paymentList);
		model.addAttribute("paging", new PageMakerVO(cri, total));
		
		return "mypage/statement.jsp";
	}
	
	@RequestMapping(value="/insertPayment.do", method=RequestMethod.POST)
	public String insertPayment(PaymentVO pVo, CartVO cVo) {
		System.out.println("결제하기 처리");

		cartService.updateCartByResult(cVo);
		cartService.deleteCartByResult(cVo);
		paymentService.insertPayment(pVo);
		
		return "getPaymentList.do";
	}
	
	@RequestMapping("updatePaymentCancle.do")
	public String updatePaymentCancle(PaymentVO pVo) {
		System.out.println("결제 취소하기 처리");
		
		paymentService.updatePaymentCancle(pVo);
		
		return "getPaymentList.do";
	}

}
