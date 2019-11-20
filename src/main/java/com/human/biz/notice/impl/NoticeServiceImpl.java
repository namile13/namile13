package com.human.biz.notice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.notice.NoticeService;
import com.human.biz.notice.NoticeVO;
import com.human.biz.pagination.CriteriaVO;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public int getTotleCount() {
		System.out.println("===>noticeService로 처리");
		
		return noticeDAO.getTotleCount();
	}

	@Override
	public List<NoticeVO> getNoticeList(CriteriaVO cri) {
		System.out.println("===>noticeService로 처리");
		
		return noticeDAO.getNoticeList(cri);
	}

	@Override
	public NoticeVO getNotice(NoticeVO nVo) {
		System.out.println("===>noticeService로 처리");
		
		return noticeDAO.getNotice(nVo);
	}

	@Override
	public void insertNotice(NoticeVO nVo) {
		System.out.println("===>noticeService로 처리");
		
		noticeDAO.insertNotice(nVo);
	}

	@Override
	public void updateNotice(NoticeVO nVo) {
		System.out.println("===>noticeService로 처리");
		
		noticeDAO.updateNotice(nVo);
	}

	@Override
	public void deleteNotice(NoticeVO nVo) {
		System.out.println("===>noticeService로 처리");
		
		noticeDAO.deleteNotice(nVo);
	}

}
