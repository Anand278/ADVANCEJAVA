<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>

 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login Form</title>
	
<style type="text/css">
	table{
	border: 2px solid black;
	margin-top:60px;
	margin-bottom:80px;
	}
	body{
	background-image: url("b1.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	}
	
</style>
</head>
<body>
	<div
      style="
        height: 100vh;
        display: flex;
        flex-direction: column;
       
      "
    >
      <div
        style="
          flex: 1;
          display: flex;
          justify-content: center;
          align-items: center;
        "
      >
      
      </div>
      <div
        style="
          flex: 10;
          display: flex;
          justify-content: center;
          align-items: center;
          font-size: 18px;
          font-family: cursive;
        "
      >
       <spr:form action="admhome.htm" method="post" commandName="adminUser" >
	<table align="center" >
		
	
		<tr><td>
		<h3 style= "color:Red ;   font-family: cursive; margin :15px ">Login Here</h3>
		</td>
		</tr>
		<tr>
			<td >
				Admin Username:
			</td>
			<td>
				<spr:input path="userName" />
				<font color ="red" > <spr:errors path="userName" /></font>
			</td>
		</tr>
		<tr>
			<td>
				Admin Pass:
			</td>
			<td>
				<spr:password path="password"/>
				<font color ="red" ><spr:errors path="password" /></font>
			</td>
		</tr>
		<tr>
			<td>
				<a href="index.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Login" >
			</td>
		</tr>
	</table>
	</spr:form>
	
      </div>
      <div style="flex: 1;"></div>
    </div>
</body>
</html>