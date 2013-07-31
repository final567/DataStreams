<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*"%>
<%@ page import="com.test.userTable.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1 align="center">가입 유저 리스트</h1>
<p>
<form method="POST" action="join.jsp">

<TABLE border=1 bordercolor=red align=center cellpadding=8 cellspacing=0>
<TR><TD> 이름 </TD><TD> 나이 </TD><TD> 핸드폰 </TD><TD></TD></TR>

<%--
   ArrayList table = (ArrayList)request.getAttribute("table");

   Iterator it = table.iterator();
   while(it.hasNext()) {
      User obj = (User)it.next();
      out.print("<TR><TD>" + obj.getName() + "</TD><TD>" + obj.getAge() + " 세</TD><TD>" + obj.getPhoneNumber() + "</TD></TR>");
   }
--%>

<c:forEach items="${table}" var="obj">
	<TR>
		<TD><c:out value="${obj.getName()}"/></TD>
		<TD><c:out value="${obj.getAge()}"/> 세</TD>
		<TD><c:out value="${obj.getPhoneNumber()}"/></TD>
		<TD><a href="
			<c:url value="changeUserInfo.jsp">
  				<c:param name="user" value="obj"/>
			</c:url>">수정</a></TD>
	</TR>
</c:forEach>

</TABLE>

<br><br>
<center>
	<input type="SUBMIT" value=가입하기>
	<a href="sessionLogout.jsp">로그아웃</a>
</center>

</form>
</body>
</html>