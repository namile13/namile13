package com.human.view.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.biz.member.MemberService;
import com.human.biz.member.MemberVO;

@Controller
public class LoginController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView() {
		System.out.println("로그인 화면으로 이동");
		
		return "member/login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(MemberVO mVo, HttpSession session) {
		System.out.println("로그인 인증처리");
		
		MemberVO member = memberService.getMember(mVo);
		
		if(member != null) {
			session.setAttribute("member", member);
			return "index.jsp";
		} else
			return "member/login.jsp";
	}

}
