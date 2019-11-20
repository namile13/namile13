package com.human.biz.qna.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.qna.QnAVO;

@Repository
public class QnADAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// Q&A 수 구하기
	public int getTotleCount() {
		System.out.println("--->sqlTemplate으로 getTotleCount처리");
		
		return sqlTemplate.selectOne("QnADAO.getTotleCount");
	}
	
	// Q&A 리스트 불러오기
	public List<QnAVO> getQnAList(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getQnAList처리");
		
		return sqlTemplate.selectList("QnADAO.getQnAList", cri);
	}
	
	// Q&A 디테일 불러오기
	public QnAVO getQnA(QnAVO qVo) {
		System.out.println("--->sqlTemplate으로 getQnA처리");
		
		return sqlTemplate.selectOne("QnADAO.getQnA", qVo);
	}
	
	// Q&A 등록하기
	public void insertQnA(QnAVO qVo) {
		System.out.println("--->sqlTemplate으로 insertQnA처리");
		
		sqlTemplate.insert("QnADAO.insertQnA", qVo);
	}
	
	// Q&A 수정하기
	public void updateQnA(QnAVO qVo) {
		System.out.println("--->sqlTemplate으로 updateQnA처리");
		
		sqlTemplate.update("QnADAO.updateQnA", qVo);
	}
	
	// Q&A 삭제하기
	public void deleteQnA(QnAVO qVo) {
		System.out.println("--->sqlTemplate으로 deleteQnA처리");
		
		sqlTemplate.delete("QnADAO.deleteQnA", qVo);
	}

}
