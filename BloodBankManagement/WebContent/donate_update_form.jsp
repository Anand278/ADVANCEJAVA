<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form"%>
<%@ include file="admheader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donate Update Form</title>
<style type="text/css">
	tr{
	color:navy;
	
	font-family: cursive;" 
	}

	table{
	
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
	<spr:form action="donate_update.htm" method="post" commandName="doList" >
	<table align="center" >
	<h2 align="center" Style="color:red"> Update Donate Form</h2>
		<tr>
			<td>
				
			</td>
			<td>
				<spr:hidden path="donateId" />
			</td>
		</tr>
		<tr>
			<td>
				First Name :
			</td>
			<td>
				<spr:input path="firstName"/>
			</td>
		</tr>
		<tr>
			<td>
				Last Name :
			</td>
			<td>
				<spr:input path="lastName"/>
			</td>
		</tr>
		<tr>
			<td>
				Mobile No :
			</td>
			<td>
				<spr:input path="mobile"/>
			</td>
		</tr>
		<tr>
			<td>
				Address :
			</td>
			<td>
				<!--<spr:input path="address"/> --> 
				 <spr:textarea cols="15" rows="5" path="address"/>
			</td>
		</tr>
		<tr>
			<td>
				Blood Group :
			</td>
			<td>
				<spr:input path="bloodGroup"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="blood_donate_list.htm" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Edit" >
			</td>
		</tr>
	</table>
	</spr:form>
	  </div>
      <div style="flex: 1;"></div>
    </div>
</body>
</html>