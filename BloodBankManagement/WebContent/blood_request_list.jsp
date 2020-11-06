<%@page import="com.bloodbank.dto.BloodDonor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="admheader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Blood Request List</title>
	
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
	<table align="center" >
		<tr>
		<th>First Name</th><td> </td>
		<th>Last Name</th><td> </td>
		<th>Mobile</th><td> </td>
		<th>Address</th><td> </td>
		<th>Blood Group</th><td> </td>
		<th>Edit</th><td> </td>
		<th>Delete</th><td> </td>
		</tr><tr> </tr><tr> </tr>
		<% 
			List<BloodDonor> blist = (List<BloodDonor>)request.getAttribute("reqList");
		for(BloodDonor bd : blist){
		%>
		<tr>
			<td>
				<%=bd.getFirstName()%>
			</td><td> </td>
			<td>
				<%=bd.getLastName()%>
			</td><td> </td>
			<td>
				<%=bd.getMobile()%>
			</td><td> </td>
			<td>
				<%=bd.getAddress()%>
			</td><td> </td>
			<td>
				<%=bd.getBloodGroup()%>
			</td><td> </td>
			<td>
				<a href="request_update_form.htm?donarId=<%=bd.getDonarId()%>" >Edit</a>
			</td><td> </td>
			<td>
				<a href="request_delete.htm?donarId=<%=bd.getDonarId()%>" >Delete</a>
			</td><td> </td>
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
