<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Display All User Details</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>PASSWORD</th>
        <th>EMAIL</th>
        <th>GENDER</th>
        <th>COUNTRY</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>
    <c:forEach var="user" items="${users}">  
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.password}</td>
                <td>${user.email}</td>
                <td>${user.gender}</td>
                <td>${user.country}</td>
                <td><a href="/editUser/${user.id}">Edit</a></td>
                <td><a href="/delete/${user.id}">Delete</a></td>
            </tr>
    </c:forEach>
</table>