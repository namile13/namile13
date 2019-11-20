package com.human.biz.review.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.review.ReviewVO;

@Repository
public class ReviewDAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// 리뷰 수 구하기
	public int getTotleCount() {
		System.out.println("--->sqlTemplate으로 getTotleCount처리");
		
		return sqlTemplate.selectOne("ReviewDAO.getTotleCount");
	}
	
	// 리뷰 리스트 가져오기
	public List<ReviewVO> getReviewList(CriteriaVO cri) {
		System.out.println("--->sqlTemplate으로 getReviewList처리");
		
		return sqlTemplate.selectList("ReviewDAO.getReviewList", cri);
	}
	
	// 리뷰 디테일 가져오기
	public ReviewVO getReview(ReviewVO rVo) {
		System.out.println("--->sqlTemplate으로 getReview처리");
		
		return sqlTemplate.selectOne("ReviewDAO.getReview", rVo);
	}
	
	// 리뷰 등록하기
	public void insertReview(ReviewVO rVo) {
		System.out.println("--->sqlTemplate으로 insertReview처리");
		
		sqlTemplate.insert("ReviewDAO.insertReview", rVo);
	}
	
	// 리뷰 수정하기
	public void updateReview(ReviewVO rVo) {
		System.out.println("--->sqlTemplate으로 updateReview처리");
		
		sqlTemplate.update("ReviewDAO.updateReview", rVo);
	}
	
	// 리뷰 삭제하기
	public void deleteReview(ReviewVO rVo) {
		System.out.println("--->sqlTemplate으로 deleteReview처리");
		
		sqlTemplate.delete("ReviewDAO.deleteReview", rVo);
	}

}
