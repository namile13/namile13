package com.human.biz.qna;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class QnAServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		QnAService qnaService = (QnAService) container.getBean("qnaService");
		QnACommentService qnaCommentService = (QnACommentService) container.getBean("qnaCommentService");
		
/*		QnAVO qVo = new QnAVO();
		qVo.setId("aaa");
		qVo.setNickname("aaa");
		qVo.setTitle("질문");
		qVo.setContent("질문이요");
		
		qnaService.insertQnA(qVo);
		
		QnAVO qnaVO = new QnAVO();
		
		List<QnAVO> list = qnaService.getQnAList(qnaVO);
		
		for(QnAVO qna : list) {
			System.out.println(qna.toString());
		}
		
		qVo.setQseq(1);
		
		QnAVO q = qnaService.getQnA(qVo);
		
		System.out.println(q.toString());
		
		QnACommentVO qcVo = new QnACommentVO();
		qcVo.setQseq(1);
		qcVo.setId("aaa");
		qcVo.setNickname("aaa");
		qcVo.setContent("이렇게");
		
		qnaCommentService.insertQnAComment(qcVo);
		
		qcVo.setQseq(1);
		qcVo.setId("admin");
		qcVo.setNickname("admin");
		qcVo.setContent("저렇게");
		
		qnaCommentService.insertQnAComment(qcVo);
		
		QnACommentVO qnaComment = new QnACommentVO();
		
		qnaComment.setQseq(1);
		
		List<QnACommentVO> listComment = qnaCommentService.getQnACommentList(qnaComment);
		
		for(QnACommentVO qna : listComment) {
			System.out.println(qna.toString());
		}
*/		
		container.close();

	}

}
