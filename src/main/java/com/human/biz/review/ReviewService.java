package com.human.biz.review;

import java.util.List;

import com.human.biz.pagination.CriteriaVO;

public interface ReviewService {
	
	// 리뷰 수 구하기
	int getTotleCount();

	// 리뷰 리스트 가져오기
	List<ReviewVO> getReviewList(CriteriaVO cri);

	// 리뷰 디테일 가져오기
	ReviewVO getReview(ReviewVO rVo);

	// 리뷰 등록하기
	void insertReview(ReviewVO rVo);

	// 리뷰 수정하기
	void updateReview(ReviewVO rVo);

	// 리뷰 삭제하기
	void deleteReview(ReviewVO rVo);

}