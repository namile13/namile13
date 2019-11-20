package com.human.biz.pagination;

public class PageMakerVO {
	
	private int startPage;				// 게시글 번호에 따른 페이지의 시작 번호
	private int endPage;				// 게시글 번호에 따른 페이지의 마지막 번호
	private boolean prev;				// 이전 버튼을 누를 수 있는 경우/없는 경우 분류
	private boolean next;				// 다음 버튼을 누를 수 있는 경우/없는 경우 분류
	
	private CriteriaVO cri;				// page, perPageNum을 가지고 있음
	
	public PageMakerVO(CriteriaVO cri, int total) {
		this.cri = cri;
		int realEnd = (int) (Math.ceil((total * 1.0) / cri.getPerPageNum()));
		this.endPage = (int) (Math.ceil(cri.getPage() / 10.0) * 10);
		this.startPage = getEndPage() - 9;
		
		if(realEnd < this.endPage)
			this.endPage = realEnd;
		
		this.next = getEndPage() < realEnd;
		this.prev = getStartPage() > 1;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public CriteriaVO getCri() {
		return cri;
	}

	public void setCri(CriteriaVO cri) {
		this.cri = cri;
	}

	@Override
	public String toString() {
		return "PageMakerVO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", cri=" + cri + "]";
	}
	
}
