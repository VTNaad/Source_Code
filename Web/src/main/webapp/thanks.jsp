<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="style/main.css" type="text/css"/>
</head>
<body>
    <h1>Thanks for joining our email list</h1>
    <p>Here is the information that you entered:</p>
    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    <label>Email:</label>
    <span>${user.email}</span><br>
    <label>BirthDay:</label>
    <span>${user.birth}</span><br>
    <label>You hear about us from: </label>   
    <span>${user.ans}</span><br>
    <label>Receive our announcements: </label>
	<span>${user.op1} ${user.op2}</span><br>
    <label>Contact:</label>
    <span>${user.contact}</span><br>
    <p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>
    <form action="emailList" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
        <a href="https://persional21110149.onrender.com/Web_Personal_21110149/"><button class="btn" type="button">Back Home</button></a>
    </form>
</body>
</html>

