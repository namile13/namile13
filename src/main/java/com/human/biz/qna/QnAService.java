package com.human.biz.qna;

import java.util.List;

import com.human.biz.pagination.CriteriaVO;

public interface QnAService {
	
	// Q&A 수 구하기
	int getTotleCount();

	// Q&A 리스트 불러오기
	List<QnAVO> getQnAList(CriteriaVO cri);

	// Q&A 디테일 불러오기
	QnAVO getQnA(QnAVO qVo);

	// Q&A 등록하기
	void insertQnA(QnAVO qVo);

	// Q&A 수정하기
	void updateQnA(QnAVO qVo);

	// Q&A 삭제하기
	void deleteQnA(QnAVO qVo);

}