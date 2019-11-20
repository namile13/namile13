package com.human.biz.pagination;

public class CriteriaVO {
	
	private String id;
	private String searchKeyword;
	private int page = 1;			// 보여줄 페이지
	private int perPageNum = 5;		// 페이지당 보여줄 페이지수

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	@Override
	public String toString() {
		return "CriteriaVO [id=" + id + ", searchKeyword=" + searchKeyword + ", page=" + page
				+ ", perPageNum=" + perPageNum + "]";
	}

}
