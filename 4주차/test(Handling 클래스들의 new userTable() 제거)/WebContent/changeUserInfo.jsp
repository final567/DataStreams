<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h1 align="center">유저 정보 수정</h1>
<p>
<form method="POST" action="JoinUser">
<TABLE border=1 bordercolor=white bordercolorlight=gray cellpadding=2 cellspacing=0 align=center>

		<TR>
			<TD align=center bgcolor=#ECECEC> 이름 </TD>
			<TD>
				<INPUT type=text name=name size=12 maxlength=12>
			</TD>
		</TR>

		<TR>
			<TD align=center bgcolor=#ECECEC> 나이 </TD>
			<TD>
				<INPUT type=text name=age size=12 maxlength=12> 세
			</TD>
		</TR>

		<TR>
			<TD align=center bgcolor=#ECECEC> 핸드폰 </TD>
			<TD>
				<INPUT type=text name=phone size=12 maxlength=12>
			</TD>
		</TR>
</TABLE>


<br><br>
<center>
	<input type="SUBMIT" value="수정완료"> <%--!!미구현!! --%>
</center>
</form>
</body>
</html>