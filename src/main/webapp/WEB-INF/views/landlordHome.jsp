<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
</head>
<body>
	<div style="margin:0 auto; padding-top: 100px; font-size: 18px;" align="center">
		<p><a href="${APP_PATH }/landlordHouse?userid=${userid}"> 我的房子  </a></p>
		<h1>恭喜您，成功登录房东用户中心！</h1>
		<a href="${APP_PATH }/landlordLogout">退出登录</a>
	</div>
</body>
</html>