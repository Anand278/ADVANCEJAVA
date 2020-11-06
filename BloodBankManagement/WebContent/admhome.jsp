<%@page import="com.bloodbank.dto.AdminUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
	
	
	<style>
		* {box-sizing: border-box;}
		body {font-family: Verdana, sans-serif;}
		.mySlides {display: none;}
		img {vertical-align: middle;}
		
		/* Slideshow container */
		.slideshow-container {
		  max-width: 1000px;
		  position: relative;
		  margin: auto;
		}
		
		/* Caption text */
		.text {
		  color: #f2f2f2;
		  font-size: 15px;
		  padding: 8px 12px;
		  position: absolute;
		  bottom: 8px;
		  width: 100%;
		  text-align: center;
		}
		
		/* Number text (1/3 etc) */
		.numbertext {
		  color: #f2f2f2;
		  font-size: 12px;
		  padding: 8px 12px;
		  position: absolute;
		  top: 0;
		}
		
		/* The dots/bullets/indicators */
		.dot {
		  height: 15px;
		  width: 15px;
		  margin: 0 2px;
		  background-color: #bbb;
		  border-radius: 50%;
		  display: inline-block;
		  transition: background-color 0.6s ease;
		}
		
		.active {
		  background-color: #717171;
		}
		
		/* Fading animation */
		.fade {
		  -webkit-animation-name: fade;
		  -webkit-animation-duration: 1.5s;
		  animation-name: fade;
		  animation-duration: 1.5s;
		}
		
		@-webkit-keyframes fade {
		  from {opacity: .4} 
		  to {opacity: 1}
		}
		
		@keyframes fade {
		  from {opacity: .4} 
		  to {opacity: 1}
		}
		
		/* On smaller screens, decrease text size */
		@media only screen and (max-width: 300px) {
		  .text {font-size: 11px}
		}
	</style>
</head>
<body>
		

 <div class="container-fluid ">
      <!-- ROW 1 -->
      <div
        class="row bg-light sticky-top justify-content-between align-items-center "
        style="height: 60px;"
      >
      
        <div class="col-3 text-light" style="font-size: 24px;">
         <nav class="navbar navbar-light bg-light">
		  <a class="navbar-brand" href="#">
		    <img src="https://pluspng.com/img-png/blood-donation-png-hd-blood-donation-drop-droplet-red-glossy-orange-653.png" width="30" height="30" class="d-inline-block align-top" alt="">
		   Blood Donation 
		  </a>
		</nav>
        </div>
        <div class="col-2 p-0 m-0 text-light d-flex justify-content-end">
            <a href="add_new_donor_form.htm" >Add Donor</a>
        </div>
         <div class="col-2 p-0 m-0 text-light d-flex justify-content-end">
        	 <a href="blood_donate_list.htm" >Donors List</a> 
        </div> 
         <div class="col-2 p-0 m-0 text-light d-flex justify-content-end">
        	 <a href="blood_request_list.htm" >Request List</a> 
        </div>
        <div class="col-2 p-0 m-0 text-light d-flex justify-content-end">
            <a href="#" >Manage Stock</a>
        </div>
        <div class="col-1 p-0 m-0 text-light d-flex justify-content-end">
        	 <a href="index.jsp" >Logout</a> 
        </div>
       
      </div>
</div>
	

<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="s1.jpg" style="width:100%">
  
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="s2.jpg" style="width:100%">
 
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="s3.jpg" style="width:100%">
  
</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 3000); // Change image every 2 seconds
}
</script>



<%@ include file="footer.jsp" %>
</body>
</html>