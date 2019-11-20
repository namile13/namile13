package com.human.view.review;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.human.biz.pagination.CriteriaVO;
import com.human.biz.pagination.PageMakerVO;
import com.human.biz.review.ReviewCommentService;
import com.human.biz.review.ReviewCommentVO;
import com.human.biz.review.ReviewService;
import com.human.biz.review.ReviewVO;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	@Autowired
	private ReviewCommentService reviewCommentService;
	
	@RequestMapping("/getReviewList.do")
	public String getReviewList(ReviewVO rVo, CriteriaVO cri, Model model) {
		System.out.println("리뷰 리스트 페이지로 이동");
		
		List<ReviewVO> reviewList = reviewService.getReviewList(cri);
		
		int total = reviewService.getTotleCount();
		
		model.addAttribute("reviewList", reviewList);
		model.addAttribute("paging", new PageMakerVO(cri, total));
		
		return "customer/reviewList.jsp";
	}
	
	@RequestMapping("/getReview.do")
	public String getReview(ReviewVO rVo, ReviewCommentVO rcVo, Model model, Model modelList) {
		System.out.println("리뷰 디테일 페이지로 이동");
		
		ReviewVO review = reviewService.getReview(rVo);
		List<ReviewCommentVO> reviewCommentList = reviewCommentService.getReviewCommentList(rcVo);
		
		String image = review.getImage();
		int index = image.lastIndexOf('\\');
		String filename = image.substring(index + 1, image.length());
		review.setImage(filename);
		
		model.addAttribute("review", review);
		modelList.addAttribute("reviewCommentList", reviewCommentList);
		
		return "customer/reviewPage.jsp";
	}
	
	@RequestMapping(value="/insertReview.do", method=RequestMethod.GET)
	public String reviewWriteView() {
		System.out.println("리뷰 쓰기 페이지로 이동");
		
		return "customer/reviewWrite.jsp";
	}
	
	@RequestMapping(value="/insertReview.do", method=RequestMethod.POST)
	public String insertReview(ReviewVO rVo) throws IOException {
		System.out.println("리뷰 등록 처리");
		
		String path = "C:\\Users\\Administrator\\PortFolio\\PortFolio\\src\\main\\webapp\\WEB-INF\\upload\\";
		String filename = null;
		
		MultipartFile uploadFile = rVo.getUploadFile();
		if(!uploadFile.isEmpty()) {
			filename = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File(path + filename));
		}
		
		rVo.setImage(path + filename);
		System.out.println(rVo);
		reviewService.insertReview(rVo);
		
		return "getReviewList.do";
	}
	
	@RequestMapping("/insertReviewComment.do")
	public String insertComment(ReviewCommentVO rcVo) {
		System.out.println("리뷰 댓글 처리");
		
		reviewCommentService.insertReviewComment(rcVo);
		
		return "getReview.do";
	}
	
	@RequestMapping(value="/updateReview.do", method=RequestMethod.GET)
	public String updateReviewPage(ReviewVO rVo, Model model) {
		System.out.println("리뷰 수정 페이지로 이동");
		
		ReviewVO review = reviewService.getReview(rVo);
		
		model.addAttribute("review", review);
		
		return "customer/reviewUpdate.jsp";
	}
	
	@RequestMapping(value="/updateReview.do", method=RequestMethod.POST)
	public String updateReview(ReviewVO rVo) {
		System.out.println("리뷰 수정 처리");
		
		reviewService.updateReview(rVo);
		
		return "getReview.do";
	}
	
	@RequestMapping("/updateComment.do")
	public String updateComment(ReviewCommentVO rcVo) {
		System.out.println("리뷰 댓글 수정 처리");
		
		reviewCommentService.updateReviewComment(rcVo);
		
		return "getReview.do";
	}
	
	@RequestMapping("/deleteReview.do")
	public String deleteReview(ReviewVO rVo, ReviewCommentVO rcVo) {
		System.out.println("리뷰 삭제 처리");
		
		reviewCommentService.deleteReviewCommentAll(rcVo);
		reviewService.deleteReview(rVo);
		
		return "getReviewList.do";
	}
	
	@RequestMapping("/deleteReviewComment.do")
	public String deleteReviewComment(ReviewCommentVO rcVo) {
		System.out.println("리뷰 댓글 삭제 처리");
		
		reviewCommentService.deleteReviewComment(rcVo);
		
		return "getReview.do";
	}

}
