package com.human.biz.product;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.pagination.PageMakerVO;

public class ProductServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		ProductService productService = (ProductService) container.getBean("productService");
		ProductDetailService productDetailService = (ProductDetailService) container.getBean("productDetailService");
/*		
		Timestamp date1 = Timestamp.valueOf("2019-11-20 00:00:00");
		Timestamp date2 = Timestamp.valueOf("2019-11-30 00:00:00");
		
		ProductVO pVo = new ProductVO();
		pVo.setName("이탈리아");
		pVo.setImage("image.jsp");
		pVo.setPrice(1000000);
		pVo.setContent("로마를 지나 밀라노로");
		pVo.setStartDate(date1);
		pVo.setEndDate(date2);
		pVo.setKind("동유럽");
		
		productService.insertProduct(pVo);
		
		ProductDetailVO pdVo = new ProductDetailVO();
		pdVo.setPseq(1);
		pdVo.setName("로마");
		pdVo.setImage("image1.jsp");
		pdVo.setContent("로마에서");
		
		productDetailService.insertProductDetail(pdVo);
		
		pdVo.setPseq(1);
		pdVo.setName("밀라노");
		pdVo.setImage("image2.jsp");
		pdVo.setContent("밀라노에서");

		productDetailService.insertProductDetail(pdVo);
		
		pdVo.setPseq(1);
		pdVo.setName("토리노");
		pdVo.setImage("image3.jsp");
		pdVo.setContent("토리노에서");

		productDetailService.insertProductDetail(pdVo);
		
		List<ProductVO> list = productService.getProductList(pVo);
		
		System.out.println(list.toString());
		
		pdVo.setPseq(1);
		
		List<ProductDetailVO> pdList = productDetailService.getProductDetailList(pdVo);
		
		for(ProductDetailVO productDetail : pdList) {
			System.out.println(productDetail.toString());
		}
		
		date1 = Timestamp.valueOf("2019-12-10 00:00:00");
		date2 = Timestamp.valueOf("2019-12-20 00:00:00");
		
		pVo.setPrice(3000000);
		pVo.setStartDate(date1);
		pVo.setEndDate(date2);
		pVo.setPseq(1);
		
		productService.updateProduct(pVo);
		
		int count = pVo.getCount() + 1;
		
		pVo.setCount(count);;
		
		productService.updateProductCount(pVo);
		
		System.out.println(pVo.toString());
		
		pdVo.setPseq(1);
		
		productDetailService.deleteProductDetail(pdVo);
		
		pVo.setPseq(1);
		
		productService.deleteProduct(pVo);
		
		
		ProductVO productVO = new ProductVO();
		
		List<ProductVO> bestProduct = productService.getProductBestList(productVO);
		
		for(ProductVO productVo : bestProduct) {
			System.out.println(productVo.toString());
		}
		
		List<ProductVO> newProduct = productService.getProductNewList(productVO);
		
		for(ProductVO productVo : newProduct) {
			System.out.println(productVo.toString());
		}
		
		
		Timestamp date1 = Timestamp.valueOf("2019-12-20 00:00:00");
		Timestamp date2 = Timestamp.valueOf("2019-12-30 00:00:00");
		
		ProductVO pVo = new ProductVO();
		pVo.setName("제주도");
		pVo.setImage("image.jsp");
		pVo.setPrice(1200000);
		pVo.setContent("제주도를 지나 부산으로");
		pVo.setStartDate(date1);
		pVo.setEndDate(date2);
		pVo.setKind("한국");
		
		productService.insertProduct(pVo);
		
		
		ProductVO pVo = new ProductVO();
		pVo.setSearchKeyword("한국");
		System.out.println(pVo.toString());
		List<ProductVO> list = productService.getProductSearchList(pVo);
		
		for(ProductVO product : list) {
			System.out.println(product.toString());
		}
*/		
		
		CriteriaVO cri = new CriteriaVO();
		List<ProductVO> list = productService.getProductList(cri);
		System.out.println(cri);
		for(ProductVO product : list) {
			System.out.println(product.toString());
		}
		
		int result = productService.getTotleCount();
		
		System.out.println(result);
		
		container.close();

	}

}
