<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator App</title>
<style>
	img
	{
	 height: 20%;
	 width: 20%;
	 margin-top: 10px;	
	}
	
	body{
		font-size: 30px;
		text-align: center;
		background : linear-gradient(to right, rgb(0, 255, 64), yellow);
		
	}
	
	
	h1{
		 
		margin:5px;
	}
	
	input,button{
		
		font-size: 30px;
		color: rgb(255, 255, 255);
		border-radius: 5%;
		background-color: black;
		border: 2px solid white;
	}
	
	img:hover
	{
		 -ms-transform: scale(1.1);
		 -webkit-transform: scale(1.1);
		  transform: scale(1.1);
	}
	
	
</style>

</head>
<body>
<img src="images/emoji 1.gif">
<h1>Joke,of the Day !</h1>
<h3><%=request.getParameter("joke")%> </h3>

<form action="calserv" >
	<input name="num1" placeholder="First Number ">
	<input name="num2" placeholder="Second Number">
	<br><br>
	<button name="btn1" value="1">+</button>
	<button name="btn1" value="2">-</button>
	<button name="btn1" value="3">*</button>
	<button name="btn1" value="4">/</button>
	 
</form>
<h1>Ans=<%=request.getParameter("Ans")%></h1>
     
</body>
</html>