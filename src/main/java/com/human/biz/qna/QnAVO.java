package com.human.biz.qna;

import java.sql.Timestamp;

public class QnAVO {
	
	private int qseq;				// qna 번호
	private String id;				// qna 작성자 아이디
	private String nickname;		// qna 작성자 닉네임
	private String title;			// qna 타이틀
	private String content;			// qna 내용
	private Timestamp regdate;		// qna 등록일
	private int count;				// qna 조회수
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "QnAVO [qseq=" + qseq + ", id=" + id + ", nickname=" + nickname + ", title=" + title + ", content="
				+ content + ", regdate=" + regdate + ", count=" + count + "]";
	}

}
