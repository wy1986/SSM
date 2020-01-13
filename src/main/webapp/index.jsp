<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<% pageContext.setAttribute("path", request.getContextPath()); %>
<script type="text/javascript" src="${path}/JQuery/jquery-3.4.1.js"></script>

<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
username:<input id="username" /><br/>
<a id="link" href="${path}/login?username=wang">登录</a>
<!-- <script>
var href = jQuery('link').attr('href');
jQuery('#link').attr('href',href + jQuery("#username").text());
</script> -->
</body>
</html>