<%@page import="com.example.ums.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
List<User> user=(List<User>) request.getAttribute("user");
%>


<table border=" ">

<thead>
<tr>
   <td>UserId</td>
   <td>UserName</td>
   <td>Email</td>
   <td>Password</td>
    <td>Update</td>
    <td>Delete</td>
</tr>
</thead>
<tbody>   <%
		    for(User users:user) {
		%>
		    <tr>
			<td><%=users.getUserid()%></td>
			<td><%=users.getUserName()%></td>
			<td><%=users.getFirstName()%></td>
			<td><%=users.getLastName()%></td>
			<td><%=users.getEmail()%></td>
			<td><%=users.getPassword()%></td>
		
		</tr>
		
		<%
		     }
		%>
</body>
</html>