package com.human.biz.review;

import java.util.List;

public interface ReviewCommentService {

	// 리뷰 comment 불러오기
	List<ReviewCommentVO> getReviewCommentList(ReviewCommentVO rcVo);

	// 리뷰 comment 등록하기
	void insertReviewComment(ReviewCommentVO rcVo);

	// 리뷰 comment 수정하기
	void updateReviewComment(ReviewCommentVO rcVo);

	// 리뷰 comment 삭제하기
	void deleteReviewComment(ReviewCommentVO rcVo);
	
	// 리뷰 삭제 전 comment 전부 삭제하기
	void deleteReviewCommentAll(ReviewCommentVO rcVo);

}