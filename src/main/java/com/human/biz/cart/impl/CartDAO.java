package com.human.biz.cart.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.cart.CartVO;
import com.human.biz.pagination.CriteriaVO;

@Repository
public class CartDAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// 장바구니 수 구하기
	public int getTotleCount(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getTotleCount처리");
		
		return sqlTemplate.selectOne("CartDAO.getTotleCount", cri);
	}
	
	// 장바구니 리스트 가져오기
	public List<CartVO> getCartList(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getCartList처리");
		
		return sqlTemplate.selectList("CartDAO.getCartList", cri);
	}
	
	// 장바구니 상품 가져오기
	public CartVO getCart(CartVO cVo) {
		System.out.println("--->sqlTemplate으로 getCart처리");
		
		return sqlTemplate.selectOne("CartDAO.getCart", cVo);
	}
	
	// 장바구니에 담기
	public void insertCart(CartVO cVo) {
		System.out.println("--->sqlTemplate으로 insertCart처리");
		
		sqlTemplate.insert("CartDAO.insertCart", cVo);
	}
	
	// 장바구니 결과 업데이트
	public void updateCartByResult(CartVO cVo) {
		System.out.println("--->sqlTemplate으로 updateCartByResult");
		
		sqlTemplate.update("CartDAO.updateCartByResult", cVo);
	}
	
	// 장바구니 삭제
	public void deleteCart(CartVO cVo) {
		System.out.println("--->sqlTemplate으로 deleteCart처리");
		
		sqlTemplate.delete("CartDAO.deleteCart", cVo);
	}
	
	// 결제 이후 장바구니 삭제
	public void deleteCartByResult(CartVO cVo) {
		System.out.println("--->sqlTemplate으로 deleteCartByResult처리");
		
		sqlTemplate.delete("CartDAO.deleteCartByResult", cVo);
	}

}
