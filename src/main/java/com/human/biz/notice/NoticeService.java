package com.human.biz.notice;

import java.util.List;

import com.human.biz.pagination.CriteriaVO;

public interface NoticeService {
	
	// 공지사항 수 구하기
	int getTotleCount();

	// 공지사항 리스트 불러오기
	List<NoticeVO> getNoticeList(CriteriaVO cri);

	// 공지사항 페이지 불러오기
	NoticeVO getNotice(NoticeVO nVo);

	// 공지사항 등록하기
	void insertNotice(NoticeVO nVo);

	// 공지사항 수정하기
	void updateNotice(NoticeVO nVo);

	// 공지사항 삭제하기
	void deleteNotice(NoticeVO nVo);

}