package com.human.view.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.biz.member.MemberService;
import com.human.biz.member.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/getMemberId.do", method=RequestMethod.GET)
	public String getMemberIdView() {
		System.out.println("아이디 찾기 페이지로 이동");
		
		return "member/findId.jsp";
	}
	
	@RequestMapping(value="/getMemberId.do", method=RequestMethod.POST)
	public String getMemberId(MemberVO mVo, Model model) {
		System.out.println("아이디 찾기 처리");
		
		MemberVO member = memberService.getMemberId(mVo);
		
		model.addAttribute("member", member);
		return "member/findId.jsp";
	}
	
	@RequestMapping(value="/getMemberPwd.do", method=RequestMethod.GET)
	public String getMemberPwd() {
		System.out.println("비밀번호 찾기 페이지로 이동");
		
		return "member/findPwd.jsp";
	}
	
	@RequestMapping(value="/getMemberPwd.do", method=RequestMethod.POST)
	public String getMemberPwd(MemberVO mVo, Model model) {
		System.out.println("비밀번호 찾기 처리");
		
		MemberVO member = memberService.getMemberPwd(mVo);
		
		model.addAttribute("member", member);
		return "member/findPwd.jsp";
	}
	
	@RequestMapping("/getMemberById.do")
	public String getMemberById(MemberVO mVo, Model model) {
		System.out.println("중복체크 처리");
		
		MemberVO member = memberService.getMemberById(mVo);
		
		model.addAttribute("member", member);
		
		return "member/checkId.jsp";
	}
	
	@RequestMapping("/getMemberByNickname.do")
	public String getMemberByNickname(MemberVO mVo, Model model) {
		System.out.println("중복처리 체크");
		
		MemberVO member = memberService.getMemberByNickname(mVo);
		
		model.addAttribute("member", member);
		
		return "member/checkNickname.jsp";
	}
	
	@RequestMapping("/getMemberByEmail.do")
	public String getMemberByEmail(MemberVO mVo, Model model) {
		System.out.println("중복처리 체크");
		
		MemberVO member = memberService.getMemberByEmail(mVo);
		
		model.addAttribute("member", member);
		
		return "member/checkEmail.jsp";
	}
	
	@RequestMapping(value="/insertMember.do", method=RequestMethod.GET)
	public String insertView() {
		System.out.println("회원가입 페이지로 이동");
		
		return "member/join.jsp";
	}
	
	@RequestMapping(value="insertMember.do", method=RequestMethod.POST)
	public String insertMember(MemberVO mVo) {
		System.out.println("회원가입 처리");
		
		memberService.insertMember(mVo);
		
		return "member/login.jsp";
	}

}
