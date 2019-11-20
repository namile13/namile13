package com.human.biz.qna.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.qna.QnACommentVO;

@Repository
public class QnACommentDAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// qna comment 불러오기
	public List<QnACommentVO> getQnACommentList(QnACommentVO qcVo) {
		System.out.println("--->sqlTemplate으로 getQnACommentList처리");
		
		return sqlTemplate.selectList("QnACommentDAO.getQnACommentList", qcVo);
	}
	
	// qna 등록하기
	public void insertQnAComment(QnACommentVO qcVo) {
		System.out.println("--->sqlTemplate으로 insertQnAComment처리");
		
		sqlTemplate.insert("QnACommentDAO.insertQnAComment", qcVo);
	}
	
	// qna 삭제하기
	public void deleteQnAComment(QnACommentVO qcVo) {
		System.out.println("--->sqlTemplate으로 deleteQnAComment처리");
		
		sqlTemplate.delete("QnACommentDAO.deleteQnAComment", qcVo);
	}
	
	// qna 삭제 전 comment 전부 삭제하기
	public void deleteQnACommentAll(QnACommentVO qcVo) {
		System.out.println("--->sqlTemplate으로 deleteQnACommentAll처리");
		
		sqlTemplate.delete("QnACommentDAO.deleteQnACommentAll", qcVo);
	}

}
