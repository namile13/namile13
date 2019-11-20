package com.human.biz.member.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.member.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// getMember로 아이디 비밀번호 가져오기
	public MemberVO getMember(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 getMember처리");
		
		return sqlTemplate.selectOne("MemberDAO.getMember", mVo);
	}
	
	// getMemberId로 아이디 찾기
	public MemberVO getMemberId(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 getMemberId처리");
		
		MemberVO member = sqlTemplate.selectOne("MemberDAO.getMemberId", mVo);
		
		if(member != null)
			return member;
		else
			return null;
	}
	
	// getMemberPwd로 비밀번호 찾기
	public MemberVO getMemberPwd(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 getMemberPwd처리");
		
		MemberVO member = sqlTemplate.selectOne("MemberDAO.getMemberPwd", mVo);
		
		if(member != null)
			return member;
		else
			return null;
	}
	
	// getMemberById로 아이디 중복체크
	public MemberVO getMemberById(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 getMemberById처리");
		
		MemberVO member = sqlTemplate.selectOne("MemberDAO.getMemberById", mVo);
		
		if(member != null)
			return member;
		else
			return null;
	}
	
	// getMemberByNickname으로 아이디 중복체크
	public MemberVO getMemberByNickname(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 getMemberByNickname처리");
		
		MemberVO member = sqlTemplate.selectOne("MemberDAO.getMemberByNickname", mVo);

		if(member != null)
			return member;
		else
			return null;
	}
	
	// getMemberByEmail로 아이디 중복체크
	public MemberVO getMemberByEmail(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 getMemberByEmail처리");
		
		MemberVO member = sqlTemplate.selectOne("MemberDAO.getMemberByEmail", mVo);

		if(member != null)
			return member;
		else
			return null;
	}
	
	// getMemberList로 리스트 가져오기
	public List<MemberVO> getMemberList(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 getMemberList처리");
		
		return sqlTemplate.selectList("MemberDAO.getMemberList", mVo);
	}
	
	// insertMember로 가입하기
	public void insertMember(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 insertMember처리");
		
		sqlTemplate.insert("MemberDAO.insertMember", mVo);
	}
	
	// updateMember로 수정하기
	public void updateMember(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 updateMember처리");
		
		sqlTemplate.update("MemberDAO.updateMember", mVo);
	}
	
	// deleteMember로 탈퇴하기
	public void deleteMember(MemberVO mVo) {
		System.out.println("--->sqlTemplate으로 deleteMember처리");
		
		sqlTemplate.delete("MemberDAO.deleteMember", mVo);
	}

}
