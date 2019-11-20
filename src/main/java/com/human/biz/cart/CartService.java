package com.human.biz.cart;

import java.util.List;

import com.human.biz.pagination.CriteriaVO;

public interface CartService {
	
	// 장바구니 수 구하기
	int getTotleCount(CriteriaVO cri);

	// 장바구니 리스트 가져오기
	List<CartVO> getCartList(CriteriaVO cri);

	// 장바구니 상품 가져오기
	CartVO getCart(CartVO cVo);

	// 장바구니에 담기
	void insertCart(CartVO cVo);
	
	// 장바구니 결과 업데이트
	void updateCartByResult(CartVO cVo);

	// 장바구니 삭제
	void deleteCart(CartVO cVo);

	// 결제 이후 장바구니 삭제
	void deleteCartByResult(CartVO cVo);

}