package com.human.biz.member.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.member.MemberService;
import com.human.biz.member.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public MemberVO getMember(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		return memberDAO.getMember(mVo);
	}

	@Override
	public MemberVO getMemberId(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		return memberDAO.getMemberId(mVo);
	}

	@Override
	public MemberVO getMemberPwd(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		return memberDAO.getMemberPwd(mVo);
	}

	@Override
	public MemberVO getMemberById(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		return memberDAO.getMemberById(mVo);
	}

	@Override
	public MemberVO getMemberByNickname(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		return memberDAO.getMemberByNickname(mVo);
	}

	@Override
	public MemberVO getMemberByEmail(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		return memberDAO.getMemberByEmail(mVo);
	}

	@Override
	public List<MemberVO> getMemberList(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		return memberDAO.getMemberList(mVo);
	}

	@Override
	public void insertMember(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		memberDAO.insertMember(mVo);
	}

	@Override
	public void updateMember(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		memberDAO.updateMember(mVo);
	}

	@Override
	public void deleteMember(MemberVO mVo) {
		System.out.println("===>memberService로 처리");
		
		memberDAO.deleteMember(mVo);
	}

}
