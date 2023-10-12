<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/header.html" %>

<h1>Join our email list</h1>
<p>To join our email list, enter your name and
   email address below.</p>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${message != null}">
    <h3><i>${message}</i></h3>
</c:if>

<form action="emailList" method="post">
    <input type="hidden" name="action" value="add">        
    <label class="pad_top">Email:</label>
    <input type="email" name="email" value="${user.email}"><br>
    <label class="pad_top">First Name:</label>
    <input type="text" name="firstName" value="${user.firstName}"><br>
    <label class="pad_top">Last Name:</label>
    <input type="text" name="lastName" value="${user.lastName}"><br>        
    <label>&nbsp;</label>
    <input type="submit" value="Join Now" class="margin_left">
    <a href="https://persional21110149.onrender.com/Web_Personal_21110149/"><button class="btn" type="button">Back Home</button></a>
</form>

<%@ include file="/footer.jsp" %>