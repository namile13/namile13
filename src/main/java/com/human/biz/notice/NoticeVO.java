package com.human.biz.notice;

import java.sql.Timestamp;

public class NoticeVO {
	
	private int nseq;
	private String title;
	private String content;
	private Timestamp regdate;
	
	public int getNseq() {
		return nseq;
	}
	public void setNseq(int nseq) {
		this.nseq = nseq;
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
	
	@Override
	public String toString() {
		return "NoticeVO [nseq=" + nseq + ", title=" + title + ", content=" + content + ", regdate=" + regdate + "]";
	}

}
