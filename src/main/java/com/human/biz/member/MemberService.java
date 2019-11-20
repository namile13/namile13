package com.human.biz.member;

import java.util.List;

public interface MemberService {

	// getMember로 아이디 비밀번호 가져오기
	MemberVO getMember(MemberVO mVo);
	
	// getMemberId로 아이디 찾기
	MemberVO getMemberId(MemberVO mVo);
	
	// getMemberPwd로 비밀번호 찾기
	MemberVO getMemberPwd(MemberVO mVo);
	
	// getMemberById로 아이디 중복체크
	MemberVO getMemberById(MemberVO mVo);
	
	// getMemberByNickname으로 아이디 중복체크
	MemberVO getMemberByNickname(MemberVO mVo);
	
	// getMemberByEmail로 아이디 중복체크
	MemberVO getMemberByEmail(MemberVO mVo);

	// getMemberList로 리스트 가져오기
	List<MemberVO> getMemberList(MemberVO mVo);

	// insertMember로 가입하기
	void insertMember(MemberVO mVo);

	// updateMember로 수정하기
	void updateMember(MemberVO mVo);

	// deleteMember로 탈퇴하기
	void deleteMember(MemberVO mVo);

}