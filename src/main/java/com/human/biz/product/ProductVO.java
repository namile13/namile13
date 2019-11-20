package com.human.biz.product;

import java.sql.Date;
import java.sql.Timestamp;

public class ProductVO {
	
	private int pseq;					// 상품번호
	private String name;				// 상품명
	private String image;				// 상품이미지
	private int price;					// 가격
	private String content;				// 상품내용
	private Timestamp startDate;		// 시작하는날
	private Timestamp endDate;			// 끝나는날
	private String kind;				// 종류
	private Date regdate;				// 등록일
	private int count;					// 결제횟수
	private String searchKeyword;		// 검색
	
	public int getPseq() {
		return pseq;
	}
	public void setPseq(int pseq) {
		this.pseq = pseq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	@Override
	public String toString() {
		return "ProductVO [pseq=" + pseq + ", name=" + name + ", image=" + image + ", price=" + price + ", content="
				+ content + ", startDate=" + startDate + ", endDate=" + endDate + ", kind=" + kind + ", regdate="
				+ regdate + ", count=" + count + ", searchKeyword=" + searchKeyword + "]";
	}

}
