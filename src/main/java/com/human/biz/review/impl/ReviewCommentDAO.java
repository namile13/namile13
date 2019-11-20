package com.human.biz.review.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.biz.review.ReviewCommentVO;

@Repository
public class ReviewCommentDAO {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	// 리뷰 comment 불러오기
	public List<ReviewCommentVO> getReviewCommentList(ReviewCommentVO rcVo) {
		System.out.println("--->sqlTemplate으로 getReviewCommentList처리");
		
		return sqlTemplate.selectList("ReviewCommentDAO.getReviewCommentList", rcVo);
	}
	
	// 리뷰 comment 등록하기
	public void insertReviewComment(ReviewCommentVO rcVo) {
		System.out.println("--->sqlTemplate으로 insertReviewComment처리");
		
		sqlTemplate.insert("ReviewCommentDAO.insertReviewComment", rcVo);
	}
	
	// 리뷰 comment 수정하기
	public void updateReviewComment(ReviewCommentVO rcVo) {
		System.out.println("--->sqlTemplate으로 updateReviewComment처리");
		
		sqlTemplate.update("ReviewCommentDAO.updateReviewComment", rcVo);
	}
	
	// 리뷰 comment 삭제하기
	public void deleteReviewComment(ReviewCommentVO rcVo) {
		System.out.println("--->sqlTemplate으로 deleteReviewComment처리");
		
		sqlTemplate.delete("ReviewCommentDAO.deleteReviewComment", rcVo);
	}
	
	// 리뷰 삭제 전 comment 전부 삭제하기
	public void deleteReviewCommentAll(ReviewCommentVO rcVo) {
		System.out.println("--->sqlTemplate으로 deleteReviewCommentAll처리");
		
		sqlTemplate.delete("ReviewCommentDAO.deleteReviewCommentAll", rcVo);
	}

}
