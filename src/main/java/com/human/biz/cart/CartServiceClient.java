package com.human.biz.cart;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CartServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		CartService cartService = (CartService) container.getBean("cartService");
		
		CartVO cVo = new CartVO();
		cVo.setId("admin");
		cVo.setPseq(4);
		cVo.setName("");
		
		cartService.insertCart(cVo);
		
		CartVO cart = new CartVO();
		
//		List<CartVO> list = cartService.getCartList(cart);
		
//		for(CartVO vo : list) {
//			System.out.println(vo.toString());
//		}
		
		cVo.setCseq(1);
		
		cart = cartService.getCart(cVo);
		
		System.out.println(cart.toString());
		
		cVo.setCseq(1);
		
		cartService.deleteCart(cVo);
		
		container.close();

	}

}
