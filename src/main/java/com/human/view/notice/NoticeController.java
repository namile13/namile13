package com.human.view.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.biz.notice.NoticeService;
import com.human.biz.notice.NoticeVO;
import com.human.biz.pagination.CriteriaVO;
import com.human.biz.pagination.PageMakerVO;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/getNoticeList.do")
	public String noticeViewList(NoticeVO nVo, CriteriaVO cri, Model model) {
		System.out.println("공지사항 페이지로 이동");
		
		List<NoticeVO> noticeList = noticeService.getNoticeList(cri);
		
		int total = noticeService.getTotleCount();
		
		model.addAttribute("noticeList", noticeList);
		model.addAttribute("paging", new PageMakerVO(cri, total));
		
		return "notice/noticeList.jsp";
	}
	
	@RequestMapping("/getNotice.do")
	public String noticeView(NoticeVO nVo, Model model) {
		System.out.println("공지사항 디테일 페이지로 이동");
		
		NoticeVO notice = noticeService.getNotice(nVo);
		System.out.println(notice);
		model.addAttribute("notice", notice);
		
		return "notice/noticePage.jsp";
	}
	
	@RequestMapping(value="/insertNotice.do", method=RequestMethod.GET)
	public String noticeWriteView() {
		System.out.println("공지사항 쓰기 페이지로 이동");
		
		return "notice/noticeWrite.jsp";
	}
	
	@RequestMapping(value="/insertNotice.do", method=RequestMethod.POST)
	public String insertNotice(NoticeVO nVo) {
		System.out.println("공지사항 등록하기");
		
		noticeService.insertNotice(nVo);
		
		return "getNoticeList.do";
	}
	
	@RequestMapping(value="/updateNotice.do", method=RequestMethod.GET)
	public String noticeUpdateView(NoticeVO nVo, Model model) {
		System.out.println("공지사항 수정 페이지로 이동");
		
		NoticeVO notice = noticeService.getNotice(nVo);
		
		model.addAttribute("notice", notice);
		
		return "notice/noticeUpdate.jsp";
	}
	
	@RequestMapping(value="/updateNotice.do", method=RequestMethod.POST)
	public String updateNotice(NoticeVO nVo) {
		System.out.println("공지사항 수정하기");
		
		noticeService.updateNotice(nVo);
		
		return "getNotice.do";
	}
	
	@RequestMapping("/deleteNotice.do")
	public String deleteNotice(NoticeVO nVo) {
		System.out.println("공지사항 삭제하기");
		
		noticeService.deleteNotice(nVo);
		
		return "getNoticeList.do";
	}

}
