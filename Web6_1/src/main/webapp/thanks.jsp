<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />

<h1>Thanks for joining our email list</h1>

<p>Here is the information that you entered:</p>
<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>

<p>To enter another email address, click on the Back 
button in your browser or the Return button shown 
below.</p>

<form action="" method="post">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
    <a href="https://persional21110149.onrender.com/Web_Personal_21110149/"><button class="btn" type="button">Back Home</button></a>
</form>

<c:import url="/footer.jsp" />