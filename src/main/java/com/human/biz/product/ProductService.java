package com.human.biz.product;

import java.util.List;

import com.human.biz.pagination.CriteriaVO;

public interface ProductService {
	
	// 상품 수 구하기
	int getTotleCount();

	// 상품 리스트 가져오기
	List<ProductVO> getProductList(CriteriaVO cri);

	// 베스트 상품 리스트 가져오기
	List<ProductVO> getProductBestList(ProductVO pVo);

	// 신규 상품 리스트 가져오기
	List<ProductVO> getProductNewList(ProductVO pVo);

	// 하나의 상품 가져오기(결제용)
	ProductVO getProduct(ProductVO pVo);

	// 상품등록
	void insertProduct(ProductVO pVo);

	// 상품삭제
	void deleteProduct(ProductVO pVo);
	
	// 상품 일정 업데이트
	void updateProduct(ProductVO pVo);

	// 상품결제 업데이트
	void updateProductCount(ProductVO pVo);
	
	// 상품 검색 수 구하기
	int getSearchCount(CriteriaVO cri);
	
	// 상품 검색
	List<ProductVO> getProductSearchList(CriteriaVO cri);

}