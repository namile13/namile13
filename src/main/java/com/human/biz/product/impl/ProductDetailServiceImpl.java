package com.human.biz.product.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.product.ProductDetailService;
import com.human.biz.product.ProductDetailVO;

@Service("productDetailService")
public class ProductDetailServiceImpl implements ProductDetailService {
	
	@Autowired
	private ProductDetailDAO productDetailDAO;

	@Override
	public List<ProductDetailVO> getProductDetailList(ProductDetailVO pdVo) {
		System.out.println("===>productDetailService로 처리");
		
		return productDetailDAO.getProductDetailList(pdVo);
	}

	@Override
	public void insertProductDetail(ProductDetailVO pdVo) {
		System.out.println("===>productDetailService로 처리");
		
		productDetailDAO.insertProductDetail(pdVo);
	}

	@Override
	public void deleteProductDetail(ProductDetailVO pdVo) {
		System.out.println("===>productDetailService로 처리");
		
		productDetailDAO.deleteProductDetail(pdVo);
	}

}
