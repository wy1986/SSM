<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% pageContext.setAttribute("path", request.getContextPath()); %>
<form:form action="${path}/teacher" modelAttribute="teacher" method="POST">
	<input type="hidden" name="id" value="${teacher.id}">
	name:<form:input path="name"/> <br/>
	course:
	<form:select path="course" items="${courses}" itemLabel="courseName" itemValue="courseName">
	</form:select><br/>
	<input type="submit" value="提交" />

</form:form>
	<%-- <form action="">
		name : <input type="text" name="name" /> <br/>
		course : <select name="course">
					<c:forEach items="${courses}" var="course">
						<option value="${course.courseName}">${course.courseName}</option>
					</c:forEach>
				</select><br/>
		<input type="submit" value="提交" />
	</form> --%>

</body>
</html>