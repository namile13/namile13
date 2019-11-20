package com.human.biz.member;

import java.sql.Date;

public class MemberVO {
	
	private String id;					// 유저 아이디
	private String password;			// 패스워드
	private String name;				// 이름
	private String nickname;			// 닉네임
	private String email;				// 이메일
	private String phone;				// 전화번호
	private String address;				// 주소
	private String useyn;				// 탈퇴여부
	private Date regdate;				// 가입일
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUseyn() {
		return useyn;
	}
	public void setUseyn(String useyn) {
		this.useyn = useyn;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", nickname=" + nickname + ", email="
				+ email + ", phone=" + phone + ", address=" + address + ", useyn=" + useyn + ", regdate=" + regdate
				+ "]";
	}

}
