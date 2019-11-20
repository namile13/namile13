package com.human.biz.review;

import java.sql.Timestamp;

public class ReviewCommentVO {
	
	private int rcseq;			// review comment 번호
	private int rseq;			// review 번호
	private String id;			// review comment 작성자 아이디
	private String nickname;	// review comment 작성자 닉네임
	private String content;		// review comment
	private Timestamp regdate;	// review comment 등록일
	
	public int getRcseq() {
		return rcseq;
	}
	public void setRcseq(int rcseq) {
		this.rcseq = rcseq;
	}
	public int getRseq() {
		return rseq;
	}
	public void setRseq(int rseq) {
		this.rseq = rseq;
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
		return "ReviewCommentVO [rcseq=" + rcseq + ", rseq=" + rseq + ", id=" + id + ", nickname=" + nickname + ", content="
				+ content + ", regdate=" + regdate + "]";
	}

}
