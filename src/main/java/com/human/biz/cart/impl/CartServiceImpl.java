package com.human.biz.cart.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.cart.CartService;
import com.human.biz.cart.CartVO;
import com.human.biz.pagination.CriteriaVO;

@Service("cartService")
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartDAO cartDAO;

	@Override
	public int getTotleCount(CriteriaVO cri) {
		System.out.println("===>cartService로 처리");
		
		return cartDAO.getTotleCount(cri);
	}

	@Override
	public List<CartVO> getCartList(CriteriaVO cri) {
		System.out.println("===>cartService로 처리");
		
		return cartDAO.getCartList(cri);
	}

	@Override
	public CartVO getCart(CartVO cVo) {
		System.out.println("===>cartService로 처리");
		
		return cartDAO.getCart(cVo);
	}

	@Override
	public void insertCart(CartVO cVo) {
		System.out.println("===>cartService로 처리");
		
		cartDAO.insertCart(cVo);
	}

	@Override
	public void updateCartByResult(CartVO cVo) {
		System.out.println("===>cartService로 처리");
		
		cartDAO.updateCartByResult(cVo);
	}

	@Override
	public void deleteCart(CartVO cVo) {
		System.out.println("===>cartService로 처리");
		
		cartDAO.deleteCart(cVo);
	}

	@Override
	public void deleteCartByResult(CartVO cVo) {
		System.out.println("===>cartService로 처리");
		
		cartDAO.deleteCartByResult(cVo);
	}

}
