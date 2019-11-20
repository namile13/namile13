package com.human.biz.product;

public class ProductDetailVO {
	
	private int pdseq;					// 상품디테일 번호
	private int pseq;					// 상품번호
	private String name;				// 상품디테일 이름
	private String image;				// 상품디테일 이미지
	private String content;				// 내용
	
	public int getPdseq() {
		return pdseq;
	}
	public void setPdseq(int pdseq) {
		this.pdseq = pdseq;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "ProductDetailVO [pdseq=" + pdseq + ", pseq=" + pseq + ", name=" + name + ", image=" + image
				+ ", content=" + content + "]";
	}

}
