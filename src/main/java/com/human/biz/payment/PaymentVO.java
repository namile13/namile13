package com.human.biz.payment;

import java.sql.Timestamp;

public class PaymentVO {
	
	private int payseq;
	private String id;
	private int pseq;
	private String name;
	private String image;
	private int people;
	private int price;
	private String content;
	private Timestamp startDate;
	private Timestamp endDate;
	private Timestamp regdate;
	private String result;
	
	public int getPayseq() {
		return payseq;
	}
	public void setPayseq(int payseq) {
		this.payseq = payseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
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
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "PaymentVO [payseq=" + payseq + ", id=" + id + ", pseq=" + pseq + ", name=" + name + ", image=" + image
				+ ", people=" + people + ", price=" + price + ", content=" + content + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", regdate=" + regdate + ", result=" + result + "]";
	}
	
}
