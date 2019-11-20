package com.human.biz.qna.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.qna.QnACommentService;
import com.human.biz.qna.QnACommentVO;

@Service("qnaCommentService")
public class QnACommentServiceImpl implements QnACommentService {
	
	@Autowired
	private QnACommentDAO qnaCommentDAO;

	@Override
	public List<QnACommentVO> getQnACommentList(QnACommentVO qcVo) {
		System.out.println("===>qnaCommentService로 처리");
		
		return qnaCommentDAO.getQnACommentList(qcVo);
	}

	@Override
	public void insertQnAComment(QnACommentVO qcVo) {
		System.out.println("===>qnaCommentService로 처리");
		
		qnaCommentDAO.insertQnAComment(qcVo);
	}

	@Override
	public void deleteQnAComment(QnACommentVO qcVo) {
		System.out.println("===>qnaCommentService로 처리");
		
		qnaCommentDAO.deleteQnAComment(qcVo);
	}

	@Override
	public void deleteQnACommentAll(QnACommentVO qcVo) {
		System.out.println("===>qnaCommentService로 처리");
		
		qnaCommentDAO.deleteQnACommentAll(qcVo);
	}

}
