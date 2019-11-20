package com.human.biz.product.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.product.ProductVO;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// 상품 수 구하기
	public int getTotleCount() {
		System.out.println("--->sqlTemplate으로 getTotleCount처리");
		
		return sqlTemplate.selectOne("ProductDAO.getTotleCount");
	}
	
	// 상품 리스트 가져오기
	public List<ProductVO> getProductList(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getProductList처리");
		
		return sqlTemplate.selectList("ProductDAO.getProductList", cri);
	}
	
	// 베스트 상품 리스트 가져오기
	public List<ProductVO> getProductBestList(ProductVO pVo) {
		System.out.println("--->sqlTemplate으로 getProductBestList처리");
		
		return sqlTemplate.selectList("ProductDAO.getProductBestList", pVo);
	}
	
	// 신규 상품 리스트 가져오기
	public List<ProductVO> getProductNewList(ProductVO pVo) {
		System.out.println("--->sqlTemplate으로 getProductNewList처리");
		
		return sqlTemplate.selectList("ProductDAO.getProductNewList", pVo);
	}
	
	// 하나의 상품 가져오기(결제용)
	public ProductVO getProduct(ProductVO pVo) {
		System.out.println("--->sqlTemplate으로 getProduct처리");
		
		return sqlTemplate.selectOne("ProductDAO.getProduct", pVo);
	}
	
	// 상품등록
	public void insertProduct(ProductVO pVo) {
		System.out.println("--->sqlTemplate으로 insertProduct처리");
		
		sqlTemplate.insert("ProductDAO.insertProduct", pVo);
	}
	
	// 상품삭제
	public void deleteProduct(ProductVO pVo) {
		System.out.println("--->sqlTemplate으로 deleteProduct처리");
		
		sqlTemplate.delete("ProductDAO.deleteProduct", pVo);
	}
	
	// 상품 일정 업데이트
	public void updateProduct(ProductVO pVo) {
		System.out.println("--->sqlTemplate으로 updateProduct처리");
		
		sqlTemplate.update("ProductDAO.updateProduct", pVo);
	}
	
	// 상품결제 업데이트
	public void updateProductCount(ProductVO pVo) {
		System.out.println("--->sqlTemplate으로 updateProductCount처리");
		
		sqlTemplate.update("ProductDAO.updateProductCount", pVo);
	}
	
	// 상품 검색 수 구하기
	public int getSearchCount(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getSearchCount처리");
		
		return sqlTemplate.selectOne("ProductDAO.getSearchCount", cri);
	}
	
	// 상품 검색
	public List<ProductVO> getProductSearchList(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getProductSearchList처리");
		
		return sqlTemplate.selectList("ProductDAO.getProductSearchList", cri);
	}

}
