package com.human.biz.notice.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.notice.NoticeVO;
import com.human.biz.pagination.CriteriaVO;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// 공지사항 수 구하기
	public int getTotleCount() {
		System.out.println("--->sqlTemplate으로 getTotleCount처리");
		
		return sqlTemplate.selectOne("NoticeDAO.getTotleCount");
	}
	
	// 공지사항 리스트 불러오기
	public List<NoticeVO> getNoticeList(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getNoticeList처리");
		
		return sqlTemplate.selectList("NoticeDAO.getNoticeList", cri);
	}
	
	// 공지사항 페이지 불러오기
	public NoticeVO getNotice(NoticeVO nVo) {
		System.out.println("--->sqlTemplate으로 getNotice처리");
		
		return sqlTemplate.selectOne("NoticeDAO.getNotice", nVo);
	}
	
	// 공지사항 등록하기
	public void insertNotice(NoticeVO nVo) {
		System.out.println("--->sqlTemplate으로 insertNotice처리");
		
		sqlTemplate.insert("NoticeDAO.insertNotice", nVo);
	}
	
	// 공지사항 수정하기
	public void updateNotice(NoticeVO nVo) {
		System.out.println("--->sqlTemplate으로 updateNotice처리");
		
		sqlTemplate.update("NoticeDAO.updateNotice", nVo);
	}
	
	// 공지사항 삭제하기
	public void deleteNotice(NoticeVO nVo) {
		System.out.println("--->sqlTemplate으로 deleteNotice처리");
		
		sqlTemplate.delete("NoticeDAO.deleteNotice", nVo);
	}

}
