package com.human.biz.review.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.review.ReviewService;
import com.human.biz.review.ReviewVO;

@Service("reviewService")
public class ReivewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewDAO reviewDAO;

	@Override
	public int getTotleCount() {
		System.out.println("===>reviewService로 처리");
		
		return reviewDAO.getTotleCount();
	}

	@Override
	public List<ReviewVO> getReviewList(CriteriaVO cri) {
		System.out.println("===>reviewService로 처리");
		
		return reviewDAO.getReviewList(cri);
	}

	@Override
	public ReviewVO getReview(ReviewVO rVo) {
		System.out.println("===>reviewService로 처리");
		
		return reviewDAO.getReview(rVo);
	}

	@Override
	public void insertReview(ReviewVO rVo) {
		System.out.println("===>reviewService로 처리");
		
		reviewDAO.insertReview(rVo);
	}

	@Override
	public void updateReview(ReviewVO rVo) {
		System.out.println("===>reviewService로 처리");
		
		reviewDAO.updateReview(rVo);
	}

	@Override
	public void deleteReview(ReviewVO rVo) {
		System.out.println("===>reviewService로 처리");
		
		reviewDAO.deleteReview(rVo);
	}

}
