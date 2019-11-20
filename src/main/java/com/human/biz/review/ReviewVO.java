package com.human.biz.review;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;

public class ReviewVO {
	
	private int rseq;					// 리뷰 번호
	private String id;					// 리뷰 작성자 아이디
	private String nickname;			// 리뷰 작성자 닉네임
	private String image;				// 리뷰 이미지
	private MultipartFile uploadFile;	// 업로드 파일
	private String title;				// 리뷰 타이틀
	private String content;				// 리뷰
	private Timestamp regdate;			// 등록일
	private int count;					// 조회수
	
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	
	@Override
	public String toString() {
		return "ReviewVO [rseq=" + rseq + ", id=" + id + ", nickname=" + nickname + ", image=" + image + ", title="
				+ title + ", content=" + content + ", regdate=" + regdate + ", count=" + count + "]";
	}

}
