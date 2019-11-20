package com.human.biz.qna;

import java.sql.Timestamp;

public class QnACommentVO {
	
	private int qcseq;			// qna comment 번호
	private int qseq;			// qna 번호
	private String id;			// qna comment 작성자 아이디
	private String nickname;	// qna comment 작성자 닉네임
	private String content;		// qna comment
	private Timestamp regdate;	// qna comment 등록일
	
	public int getQcseq() {
		return qcseq;
	}
	public void setQcseq(int qcseq) {
		this.qcseq = qcseq;
	}
	public int getQseq() {
		return qseq;
	}
	public void setQseq(int qseq) {
		this.qseq = qseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "QnACommentVO [qcseq=" + qcseq + ", qseq=" + qseq + ", id=" + id + ", nickname=" + nickname
				+ ", content=" + content + ", regdate=" + regdate + "]";
	}

}
