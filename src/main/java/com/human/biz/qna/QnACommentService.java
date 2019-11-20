package com.human.biz.qna;

import java.util.List;

public interface QnACommentService {

	// qna comment 불러오기
	List<QnACommentVO> getQnACommentList(QnACommentVO qcVo);

	// qna 등록하기
	void insertQnAComment(QnACommentVO qcVo);

	// qna 삭제하기
	void deleteQnAComment(QnACommentVO qcVo);

	// qna 삭제 전 comment 전부 삭제하기
	void deleteQnACommentAll(QnACommentVO qcVo);

}