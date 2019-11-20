package com.human.view.mypage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.biz.member.MemberService;
import com.human.biz.member.MemberVO;

@Controller
public class MypageController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/updateMember.do", method=RequestMethod.GET)
	public String mypageView(MemberVO mVo, Model model) {
		System.out.println("마이페이지로 이동");
		
		MemberVO member = memberService.getMemberById(mVo);
		
		model.addAttribute("member", member);
		
		return "mypage/mypage.jsp";
	}
	
	@RequestMapping(value="/updateMember.do", method=RequestMethod.POST)
	public String updateMember(MemberVO mVo) {
		System.out.println("내 정보 업데이트 처리");
		
		memberService.updateMember(mVo);
		
		return "index.jsp";
	}
	
	@RequestMapping("/deleteMember.do")
	public String deleteMember(MemberVO mVo) {
		System.out.println("탈퇴하기 처리");
		
		memberService.deleteMember(mVo);
		
		return "logout.do";
	}

}
