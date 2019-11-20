package com.human.biz.review;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ReviewServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		ReviewService reviewService = (ReviewService) container.getBean("reviewService");
		ReviewCommentService reviewCommentService = (ReviewCommentService) container.getBean("reviewCommentService");
		
/*		ReviewVO rVo = new ReviewVO();
		rVo.setId("admin");
		rVo.setNickname("admin");
		rVo.setImage("");
		rVo.setTitle("후기");
		rVo.setContent("재밌었다");
		
		reviewService.insertReview(rVo);
		
		ReviewVO reviewVO = new ReviewVO();
		
		List<ReviewVO> list = reviewService.getReviewList(reviewVO);
		
		for(ReviewVO review : list) {
			System.out.println(review.toString());
		}
		
		ReviewVO re = new ReviewVO();
		re.setRseq(1);
		
		ReviewVO rev = reviewService.getReview(re);
		
		System.out.println(rev.toString());
		
		ReviewCommentVO rcVo = new ReviewCommentVO();
		rcVo.setRseq(1);
		rcVo.setId("aaa");
		rcVo.setNickname("aaa");
		rcVo.setContent("부럽네요");
		
		reviewCommentService.insertReviewComment(rcVo);
		
		rcVo.setRseq(1);
		rcVo.setId("admin");
		rcVo.setNickname("admin");
		rcVo.setContent("감사합니다");
		
		reviewCommentService.insertReviewComment(rcVo);
		
		ReviewCommentVO reviewComment = new ReviewCommentVO();
		
		List<ReviewCommentVO> rList = reviewCommentService.getReviewCommentList(reviewComment);
		
		for(ReviewCommentVO review : rList) {
			System.out.println(review.toString());
		}

		
		rVo.setImage("image.jpg");
		rVo.setTitle("후기re");
		rVo.setContent("너무");
		rVo.setRseq(1);
		rVo.setId("admin");
		
		reviewService.updateReview(rVo);
		
		re.setRseq(1);
		
		rev = reviewService.getReview(re);
		
		System.out.println(rev.toString());
		
		rcVo.setContent("이런");
		rcVo.setRcseq(1);
		rcVo.setId("aaa");
		
		reviewCommentService.updateReviewComment(rcVo);
		
		ReviewCommentVO comment = new ReviewCommentVO();
		
		rList = reviewCommentService.getReviewCommentList(comment);
		
		for(ReviewCommentVO review : rList) {
			System.out.println(review.toString());
		}
		
		rcVo.setRcseq(1);
		
		reviewCommentService.deleteReviewComment(rcVo);
		
		rVo.setRseq(1);
		
		reviewService.deleteReview(rVo);
*/		
		container.close();

	}

}
