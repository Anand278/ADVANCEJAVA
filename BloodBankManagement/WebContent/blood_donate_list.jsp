<%@page import="com.bloodbank.dto.BloodDonate"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="admheader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Blood Donate List</title>
	
<style type="text/css">
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
     
	<table  >
		
		<tr>
		<th>First Name</th><td> </td>
		<th>Last Name</th><td> </td>
		<th>Mobile</th><td> </td>
		<th>Address</th><td> </td>
		<th>Blood Group</th><td> </td>
		<th>Edit</th><td> </td>
		<th>Delete</th><td> </td>
		</tr><tr> </tr>
		<% 
			List<BloodDonate> blist = (List<BloodDonate>)request.getAttribute("doList");
		for(BloodDonate bd : blist){
		%>
		<tr>
			
			<td>
				<%=bd.getFirstName()%>
			</td>
			<td> </td>
			<td>
				<%=bd.getLastName()%>
			</td>
			<td>
			
			</td>
			<td>
				<%=bd.getMobile()%>
			</td>
			<td>
			
			</td>
			<td>
				<%=bd.getAddress()%>
			</td>
			<td>
			
			</td>
			<td>
				<%=bd.getBloodGroup()%>
			</td>
			<td>
			
			</td>
			<td>
				<a href="donate_update_form.htm?donateId=<%=bd.getDonateId()%>" >Edit</a>
			</td>
			<td>
			
			</td>
			<td>
				<a href="donate_delete.htm?donateId=<%=bd.getDonateId()%>" >Delete</a>
			</td>
			<td>
			
			</td>
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="admhome.jsp" >Back</a>
			</td>
			<td>
				
			</td>
		</tr>
	</table>
      </div>
      <div style="flex: 1;"></div>
    </div>
</body>
</html>
