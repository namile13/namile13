package com.human.biz.review.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.review.ReviewCommentService;
import com.human.biz.review.ReviewCommentVO;

@Service("reviewCommentService")
public class ReviewCommentServiceImpl implements ReviewCommentService {
	
	@Autowired
	private ReviewCommentDAO reviewCommentDAO;

	@Override
	public List<ReviewCommentVO> getReviewCommentList(ReviewCommentVO rcVo) {
		System.out.println("===>reviewCommentService로 처리");
		
		return reviewCommentDAO.getReviewCommentList(rcVo);
	}

	@Override
	public void insertReviewComment(ReviewCommentVO rcVo) {
		System.out.println("===>reviewCommentService로 처리");
		
		reviewCommentDAO.insertReviewComment(rcVo);
	}

	@Override
	public void updateReviewComment(ReviewCommentVO rcVo) {
		System.out.println("===>reviewCommentService로 처리");
		
		reviewCommentDAO.updateReviewComment(rcVo);
	}

	@Override
	public void deleteReviewComment(ReviewCommentVO rcVo) {
		System.out.println("===>reviewCommentService로 처리");
		
		reviewCommentDAO.deleteReviewComment(rcVo);
	}

	@Override
	public void deleteReviewCommentAll(ReviewCommentVO rcVo) {
		System.out.println("===>reviewCommentService로 처리");
		
		reviewCommentDAO.deleteReviewCommentAll(rcVo);
	}

}
