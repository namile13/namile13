package com.human.biz.product.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.product.ProductService;
import com.human.biz.product.ProductVO;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;

	@Override
	public int getTotleCount() {
		System.out.println("===>productService로 처리");
		
		return productDAO.getTotleCount();
	}

	@Override
	public List<ProductVO> getProductList(CriteriaVO cri) {
		System.out.println("===>productService로 처리");
		
		return productDAO.getProductList(cri);
	}

	@Override
	public List<ProductVO> getProductBestList(ProductVO pVo) {
		System.out.println("===>productService로 처리");
		
		return productDAO.getProductBestList(pVo);
	}

	@Override
	public List<ProductVO> getProductNewList(ProductVO pVo) {
		System.out.println("===>productService로 처리");
		
		return productDAO.getProductNewList(pVo);
	}

	@Override
	public ProductVO getProduct(ProductVO pVo) {
		System.out.println("===>productService로 처리");
		
		return productDAO.getProduct(pVo);
	}

	@Override
	public void insertProduct(ProductVO pVo) {
		System.out.println("===>productService로 처리");
		
		productDAO.insertProduct(pVo);
	}

	@Override
	public void deleteProduct(ProductVO pVo) {
		System.out.println("===>productService로 처리");
		
		productDAO.deleteProduct(pVo);
	}

	@Override
	public void updateProduct(ProductVO pVo) {
		System.out.println("===>productService로 처리");
		
		productDAO.updateProduct(pVo);
	}

	@Override
	public void updateProductCount(ProductVO pVo) {
		System.out.println("===>productService로 처리");
		
		productDAO.updateProductCount(pVo);
	}

	@Override
	public int getSearchCount(CriteriaVO cri) {
		System.out.println("===>productService로 처리");
		
		return productDAO.getSearchCount(cri);
	}

	@Override
	public List<ProductVO> getProductSearchList(CriteriaVO cri) {
		System.out.println("===>productService로 처리");
		
		return productDAO.getProductSearchList(cri);
	}

}
