package com.human.biz.product;

import java.util.List;

public interface ProductDetailService {

	// 상품 디테일 리스트 가져오기
	List<ProductDetailVO> getProductDetailList(ProductDetailVO pdVo);

	// 상품 디테일 등록하기(ProductDAO먼저 등록 후 등록)
	void insertProductDetail(ProductDetailVO pdVo);

	// 상품 디테일 삭제하기(ProductDAO가 나중에 삭제)
	void deleteProductDetail(ProductDetailVO pdVo);

}