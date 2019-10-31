<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<% pageContext.setAttribute("path", request.getContextPath()); %>
<html>
<script type="text/javascript" src="${path}/JQuery/jquery-3.4.1.js"></script>
<head>
<meta charset="UTF-8">
<title>Teachers</title>
</head>

<body>
	<h1>教师列表</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Course</th>
			<th>EDIT</th>
			<th>DELETE</th>
		</tr>
		<c:forEach items="${teachers}" var="teacher">
			<tr>
				<td>${teacher.id}</td>
				<td>${teacher.name}</td>
				<td>${teacher.course}</td>
				<td>
					<a href="${path }/teacher/${teacher.id}">EDIT</a>
				</td>
				<td>
					<a href="${path}/teacher/${teacher.id}" class="deleteButton">DELETE</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="teacher">添加教师</a>
	<form:form id="form" action="${path}/teacher/${teacher.id}" method="post">
		<input type="hidden" name="_method" value="DELETE" />
		<input type="submit" value="删除" />
	</form:form>
	<script type="text/javascript">
		$(function(){
			$(".deleteButton").click(function(){
				$("#form").attr("action",this.href);
				$("#form").submit();
				return false;
			})
		});
	</script>
</body>
</html>