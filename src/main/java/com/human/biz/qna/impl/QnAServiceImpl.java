package com.human.biz.qna.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.qna.QnAService;
import com.human.biz.qna.QnAVO;

@Service("qnaService")
public class QnAServiceImpl implements QnAService {
	
	@Autowired
	private QnADAO qnaDAO;

	@Override
	public int getTotleCount() {
		System.out.println("===>qnaService로 처리");
		
		return qnaDAO.getTotleCount();
	}

	@Override
	public List<QnAVO> getQnAList(CriteriaVO cri) {
		System.out.println("===>qnaService로 처리");
		
		return qnaDAO.getQnAList(cri);
	}

	@Override
	public QnAVO getQnA(QnAVO qVo) {
		System.out.println("===>qnaService로 처리");
		
		return qnaDAO.getQnA(qVo);
	}

	@Override
	public void insertQnA(QnAVO qVo) {
		System.out.println("===>qnaService로 처리");
		
		qnaDAO.insertQnA(qVo);
	}

	@Override
	public void updateQnA(QnAVO qVo) {
		System.out.println("===>qnaService로 처리");
		
		qnaDAO.updateQnA(qVo);
	}

	@Override
	public void deleteQnA(QnAVO qVo) {
		System.out.println("===>qnaService로 처리");
		
		qnaDAO.deleteQnA(qVo);
	}

}
