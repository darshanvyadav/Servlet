<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>

<style>
	.footer {
		position: absolute;
		bottom: 0;
		width: 100%;
		height: 60px;
		background-color: #f5f5f5;
	}
</style>
</head>
<body>

<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/todo.do">Todos</a></li>
			<li><a href="http://www.in28minutes.com">In28Minutes</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/login.do">Login</a></li>
		</ul>

	</nav>
<div class="container">
		<H1>Heading</H1>
		Body of the Page
	</div>

	<footer class="footer">
		<p>footer content</p>
	</footer>

Look your To do's<p>${todos}</p>

<ol>
    
    <c:forEach items="${todos}" var="todo">
    <li>${todo.name} &nbsp; &nbsp; <a href= "/yadav/delete-servleturl?todo=${todo.name}"> Delete</a>  </li>
    </c:forEach>
</ol>

<form action = "/yadav/It'sTodo" method = "post">
  <input type = "text" name = "Uganda"/> <input type = "Submit" value = "Add"/>
  </form>



<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>

 
