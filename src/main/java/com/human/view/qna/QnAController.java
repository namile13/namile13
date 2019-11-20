package com.human.view.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.pagination.PageMakerVO;
import com.human.biz.qna.QnACommentService;
import com.human.biz.qna.QnACommentVO;
import com.human.biz.qna.QnAService;
import com.human.biz.qna.QnAVO;

@Controller
public class QnAController {
	
	@Autowired
	private QnAService qnaService;
	@Autowired
	private QnACommentService qnaCommentService;
	
	@RequestMapping("/getQnAList.do")
	public String getQnAList(QnAVO qVo, CriteriaVO cri, Model model) {
		System.out.println("Q&A페이지로 이동");
		
		List<QnAVO> qnaList = qnaService.getQnAList(cri);
		
		int total = qnaService.getTotleCount();
		
		model.addAttribute("qnaList", qnaList);
		model.addAttribute("paging", new PageMakerVO(cri, total));
		
		return "qna/qnaList.jsp";
	}
	
	@RequestMapping("/getQnA.do")
	public String getQnA(QnAVO qVo, QnACommentVO qcVo, Model model, Model modelList) {
		System.out.println("Q&A 디테일 페이지로 이동");
		
		QnAVO qna = qnaService.getQnA(qVo);
		List<QnACommentVO> qnaCommentList = qnaCommentService.getQnACommentList(qcVo);
		
		model.addAttribute("qna", qna);
		modelList.addAttribute("qnaCommentList", qnaCommentList);
		
		return "qna/qnaPage.jsp";
	}
	
	@RequestMapping(value="/insertQnA.do", method=RequestMethod.GET)
	public String QnAWriteView() {
		System.out.println("Q&A 쓰기 페이지로 이동");
		
		return "qna/qnaWrite.jsp";
	}
	
	@RequestMapping(value="/insertQnA.do", method=RequestMethod.POST)
	public String insertQnA(QnAVO qVo) {
		System.out.println("Q&A 등록 처리");
		
		qnaService.insertQnA(qVo);
		
		return "getQnAList.do";
	}
	
	@RequestMapping("/insertQnAComment.do")
	public String insertComment(QnACommentVO qcVo) {
		System.out.println("Q&A 댓글 처리");
		
		qnaCommentService.insertQnAComment(qcVo);
		
		return "getQnA.do";
	}
	
	@RequestMapping(value="/updateQnA.do", method=RequestMethod.GET)
	public String updateQnAView(QnAVO qVo, Model model) {
		System.out.println("Q&A 수정 페이지로 이동");
		
		QnAVO qna = qnaService.getQnA(qVo);
		
		model.addAttribute("qna", qna);
		
		return "qna/qnaUpdate.jsp";
	}
	
	@RequestMapping(value="/updateQnA.do", method=RequestMethod.POST)
	public String updateQnA(QnAVO qVo) {
		System.out.println("Q&A 수정 처리");
		
		qnaService.updateQnA(qVo);
		
		return "getQnA.do";
	}
	
	@RequestMapping("/deleteQnA.do")
	public String deleteQnA(QnAVO qVo, QnACommentVO qcVo) {
		System.out.println("Q&A 삭제 처리");
		
		qnaCommentService.deleteQnACommentAll(qcVo);
		qnaService.deleteQnA(qVo);
		
		return "getQnAList.do";
	}
	
	@RequestMapping("/deleteQnAComment.do")
	public String deleteQnAComment(QnACommentVO qcVo) {
		System.out.println("Q&A 댓글 삭제 처리");
		
		qnaCommentService.deleteQnAComment(qcVo);
		
		return "getQnA.do";
	}
	
	@RequestMapping("/mostOfQnA.do")
	public String mostOfQnAView() {
		System.out.println("mostOfQnA 페이지로 이동");
		
		return "qna/mostOfQnA.jsp";
	}

}
