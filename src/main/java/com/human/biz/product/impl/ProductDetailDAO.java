package com.human.biz.product.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.product.ProductDetailVO;

@Repository
public class ProductDetailDAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// 상품 디테일 리스트 가져오기
	public List<ProductDetailVO> getProductDetailList(ProductDetailVO pdVo) {
		System.out.println("--->sqlTemplate으로 getProductDetailList처리");
		
		return sqlTemplate.selectList("ProductDetailDAO.getProductDetailList", pdVo);
	}
	
	// 상품 디테일 등록하기(ProductDAO먼저 등록 후 등록)
	public void insertProductDetail(ProductDetailVO pdVo) {
		System.out.println("--->sqlTemplate으로 insertProductDetail처리");
		
		sqlTemplate.insert("ProductDetailDAO.insertProductDetail", pdVo);
	}
	
	// 상품 디테일 삭제하기(ProductDAO가 나중에 삭제)
	public void deleteProductDetail(ProductDetailVO pdVo) {
		System.out.println("--->sqlTemplate으로 deleteProductDetail처리");
		
		sqlTemplate.delete("ProductDetailDAO.deleteProductDetail", pdVo);
	}

}
