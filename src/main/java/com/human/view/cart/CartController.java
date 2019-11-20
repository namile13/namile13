package com.human.view.cart;

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
import com.human.biz.product.ProductDetailService;
import com.human.biz.product.ProductDetailVO;

@Controller
public class CartController {
	
	@Autowired
	private CartService cartService;
	@Autowired
	private ProductDetailService productDetailService;
	
	@RequestMapping("/getCartList.do")
	public String getCartList(CartVO cVo, CriteriaVO cri, Model model, HttpSession session) {
		System.out.println("장바구로 페이지로 이동");
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		cri.setId(member.getId());
		
		List<CartVO> cartList = cartService.getCartList(cri);
		
		int total = cartService.getTotleCount(cri);
		
		model.addAttribute("cartList", cartList);
		model.addAttribute("paging", new PageMakerVO(cri, total));
		
		return "mypage/cartList.jsp";
	}
	
	@RequestMapping("/getCart.do")
	public String getCart(CartVO cVo, ProductDetailVO pdVo, Model model, Model model1) {
		System.out.println("장바구니 디테일 페이지로 이동");

		CartVO cart = cartService.getCart(cVo);
		List<ProductDetailVO> productDetailList =  productDetailService.getProductDetailList(pdVo);

		model.addAttribute("cart", cart);
		model1.addAttribute("productDetailList", productDetailList);
		
		return "mypage/cartDetail.jsp";
	}
	
	@RequestMapping(value="/insertCart.do", method=RequestMethod.POST)
	public String insertCart(CartVO cVo, HttpSession session) {
		System.out.println("장바구니에 담기");
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		if(member == null) {
			return "member/login.jsp";
		} else {
			cVo.setId(member.getId());
			System.out.println(cVo);
			cartService.insertCart(cVo);
			
			return "getProductDetail.do";
		}
	}
	
	@RequestMapping("/deleteCart.do")
	public String deleteCart(CartVO cVo) {
		System.out.println("장바구니에서 삭제");
		
		cartService.deleteCart(cVo);
		
		return "getCartList.do";
	}

}
