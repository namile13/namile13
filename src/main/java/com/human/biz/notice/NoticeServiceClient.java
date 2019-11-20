package com.human.biz.notice;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NoticeServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		NoticeService noticeService = (NoticeService) container.getBean("noticeService");
		
/*		NoticeVO nVo = new NoticeVO();
		nVo.setTitle("반갑습니다.");
		nVo.setContent("안녕하세요");
		
		noticeService.insertNotice(nVo);
		
		nVo.setTitle("1번.");
		nVo.setContent("안녕");
		
		noticeService.insertNotice(nVo);
		
		NoticeVO notice = new NoticeVO();
		
		List<NoticeVO> list = noticeService.getNoticeList(notice);
		
		for(NoticeVO noticeVO : list) {
			System.out.println(noticeVO.toString());
		}
		
		nVo.setTitle("123");
		nVo.setContent("이런");
		nVo.setNseq(1);
		
		noticeService.updateNotice(nVo);
		
		nVo.setNseq(1);
		
		NoticeVO vo = noticeService.getNotice(nVo);
		
		System.out.println(vo.toString());
		
		nVo.setNseq(1);
		
		noticeService.deleteNotice(nVo);
*/		
		container.close();

	}

}
