package com.human.view.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.pagination.PageMakerVO;
import com.human.biz.product.ProductDetailService;
import com.human.biz.product.ProductDetailVO;
import com.human.biz.product.ProductService;
import com.human.biz.product.ProductVO;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductDetailService productDetailService;
	
	// 메인 페이지
	@RequestMapping(value="/main.do", method=RequestMethod.GET)
	public String mainView(ProductVO pVo, Model modelBest, Model modelNew) {
		System.out.println("메인페이지로 이동");
		
		List<ProductVO> productBestList = productService.getProductBestList(pVo);
		List<ProductVO> productNewList = productService.getProductNewList(pVo);
		
		modelBest.addAttribute("productBestList", productBestList);
		modelNew.addAttribute("productNewList", productNewList);
		
		return "main.jsp";
	}
	
	// 상품 디테일 페이지
	@RequestMapping("/getProductDetail.do")
	public String productDetailView(ProductDetailVO pdVo, Model model) {
		System.out.println("상품 디테일 페이지로 이동");
		
		List<ProductDetailVO> productDetailList = productDetailService.getProductDetailList(pdVo);
		
		model.addAttribute("productDetailList", productDetailList);
		
		return "product/productDetail.jsp";
	}
	
	// 상품 리스트 페이지
	@RequestMapping("/getProductList.do")
	public String getProductList(CriteriaVO cri, Model model) {
		System.out.println("상품 리스트 페이지로 이동");
		
		List<ProductVO> productList = productService.getProductList(cri);
		
		int total = productService.getTotleCount();
		
		model.addAttribute("productList", productList);
		model.addAttribute("paging", new PageMakerVO(cri, total));
		
		return "product/productList.jsp";
	}
	
	// 상품 검색리스트 페이지
	@RequestMapping("/getProductSearchList.do")
	public String getProductSearchList(ProductVO pVo, CriteriaVO cri, Model model) {
		System.out.println("상품 검색 페이지로 이동");
		
		List<ProductVO> productList = productService.getProductSearchList(cri);
		
		int total = productService.getSearchCount(cri);
		
		model.addAttribute("productList", productList);
		model.addAttribute("paging", new PageMakerVO(cri, total));
		
		return "product/productSearchList.jsp";
	}

}
