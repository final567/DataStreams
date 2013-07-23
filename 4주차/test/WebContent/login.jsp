<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" session ="false" %>
<html>
<head>
<title>Login Form</title>
</head>
<body>
<form method="Post" action="JoinUser">
    <table border="0" width="400" height="100">
        <tr>
            <td align=right><font size="2">아이디 : </font></td>
            <td><input type="text" name="id" size="10"></td>
        </tr>
        <tr>
		<td align=right><font size="2">비밀번호 : </font></td>
		<td><input type="password" name="password" size="10"></td>
		</tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="로그인">
                <input type="reset"  value="다시작성">
            </td>
        </tr>
    </table>
</form>
</body>
</html>