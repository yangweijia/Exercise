<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="info" type="school.SchoolBean" scope="request"></jsp:useBean>
姓名是<jsp:getProperty name="info" property="name"></jsp:getProperty>
学校是<jsp:getProperty name="info" property="school"></jsp:getProperty>
</body>
</html>