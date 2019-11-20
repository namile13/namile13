/**
 * 
 */
function check_password() {
	if(document.frm.password.value != document.frm.password_re.value) {
		alert("비밀번호를 확인하세요");
		document.frm.password.focus();
		return false;
	} else {
		frm.method = "post";
		location.href="insertMember.do";
	}
}

function check_id() {
	if(document.frm.id.value.length == 0) {
		alert("아이디를 입력하세요");
		document.frm.id.focus();
		return;
	}
	var url = "getMemberById.do?id=" + frm.id.value;
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=400, height=200");
}

function check_nickname() {
	if(document.frm.nickname.value.length == 0) {
		alert("닉네임을 입력하세요");
		document.frm.nickname.focus();
		return;
	}
	var url = "getMemberByNickname.do?nickname=" + frm.nickname.value;
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=400, height=200");
}

function check_email() {
	if(document.frm.email.value.length == 0) {
		alert("이메일을 입력하세요");
		document.frm.email.focus();
		return;
	}
	var url = "getMemberByEmail.do?email=" + frm.email.value;
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=400, height=200");
}

function findId() {
	var url = "getMemberId.do";
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=400, height=350");
}

function findPwd() {
	var url = "getMemberPwd.do";
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=400, height=350");
}