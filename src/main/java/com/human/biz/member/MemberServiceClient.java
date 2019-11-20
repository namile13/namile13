package com.human.biz.member;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		MemberService memberService = (MemberService) container.getBean("memberService");
		
		MemberVO mVo = new MemberVO();
		mVo.setId("admin");
		mVo.setPassword("1234");
		mVo.setName("관리자");
		mVo.setNickname("관리자");
		mVo.setEmail("admin@admin.com");
		mVo.setPhone("000-0000-0000");
		mVo.setAddress("서울");
		
		memberService.insertMember(mVo);
		
		MemberVO vo = new MemberVO();
		vo.setId("admin");
		vo.setPassword("1234");
		
		MemberVO member = memberService.getMember(vo);
		
		System.out.println(member.toString());
		
		MemberVO memberVO = new MemberVO();
		memberVO.setPassword("1111");
		memberVO.setNickname("관리");
		memberVO.setEmail("admin@admin.net");
		memberVO.setPhone("000-0000-1111");
		memberVO.setAddress("경기도");
		memberVO.setId("admin");
		
		memberService.updateMember(memberVO);
		
		MemberVO memVO = new MemberVO();
		memVO.setId("admin");
		memVO.setPassword("1111");
		
		member = memberService.getMember(memVO);
		
		System.out.println(member.toString());
		
		MemberVO mem = new MemberVO();
		mem.setId("admin");
		
		memberService.deleteMember(mem);
		
		container.close();

	}

}
