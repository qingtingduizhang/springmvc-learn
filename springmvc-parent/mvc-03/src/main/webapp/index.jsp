<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<h2 style="color: pink;">Hello Tomcat8!</h2>
<form method="post" action="${pageContext.request.contextPath}/user/register">
UserName<input type="text" name="name" id="name"/><br/>
PassWord<input type="text" name="password" id="password"/><br/>
<input type="submit" value="reg">
</form>
</body>
</html>

