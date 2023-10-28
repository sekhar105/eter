<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8" />
<title>Add Employee</title>
<meta name="viewport"
	content="width=device-width,
      initial-scale=1.0" />
<link rel="stylesheet" href="/style.css" />
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css" />
</head>
<body>


	<script
		src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>
	<script type="text/javascript">
 
  function Alert(){
	  var name =document.teacherform.name.value;
	  alert(name);
	  alertify.success(name);
	  alertify.set('notifier','position', 'top-right');
	  alertify.success(name);
	  var email=document.teacherform.email.value;
	  var phoneNumber =document.teacherform.phoneNumber.value;
	  var malegender=document.getElementById('malegender').value;
	  var femalegender=document.getElementById('femalegender').value;
	  
	  if(name!= null){
		  alert("name must not be null");
		  alertify.success('name is not null');
		  return true
	  }else{
		  alertify.success('name is null');
		  alert("name is not null")
		  
		  return false
	  }
	 
	  alertify.success(name);
	  alertify.success(email);
	  alertify.success(phoneNumber);
	  alertify.success(malegender);
	  alertify.success(femalegender);
	  return true;
  }
  </script>
	<jsp:include page="sidenavbar.jsp" />
	<div class="container">
		<h1 class="form-title">Add Employee</h1>
		<form:form name="teacherform" method="POST"
			action="/empControl/saveEmployee" modelAttribute="emp"
			onsubmit="return Alert()">
			<div class="main-user-info">
				<div class="user-input-box">
					<label for="fullName">Name</label> <input type="text" id="fullName"
						name="name" placeholder="Enter Full Name" value="${emp.name}"/>
				</div>
				<!-- <div class="user-input-box">
            <label for="username">Username</label>
            <input type="text"
                    id="username"
                    name="username"
                    placeholder="Enter Username"/>
          </div> -->
				<div class="user-input-box">
					<label for="email">Email</label> <input type="email" id="email"
						name="email" placeholder="Enter Email" value="${emp.email}" />
				</div>
				<div class="user-input-box">
					<label for="phoneNumber">Phone Number</label> <input type="text"
						id="phoneNumber" name="phoneNumber"
						placeholder="Enter Phone Number" value="${emp.phoneNumber}" />
				</div>
				<!-- <div class="user-input-box">
            <label for="password">Password</label>
            <input type="password"
                    id="password"
                    name="password"
                    placeholder="Enter Password"/>
          </div>
          <div class="user-input-box">
            <label for="confirmPassword">Confirm Password</label>
            <input type="password"
                    id="confirmPassword"
                    name="confirmPassword"
                    placeholder="Confirm Password"/>
          </div> -->
			</div>
			<div class="gender-details-box">
				<span class="gender-title">Gender</span>
				<div class="gender-category">
					Male
					<form:radiobutton path="gender" id="malegender" value="male" />
					Female
					<form:radiobutton path="gender" id="femalegender" value="female" />
				</div>
			</div>
			<div class="gender-details-box">
				<span class="gender-title">Skill</span>
				<div class="gender-category">
					<form:checkbox path="skill" value="HariCut" />
					HariCut
					<form:checkbox path="skill" value="shampoo" />
					Shampoo
					<form:checkbox path="skill" value="haristright" />
					HairStright
					<form:checkbox path="skill" value="shave" />
					shave
				</div>
			</div>
			<%-- <div class="gender-details-box">
				<span class="gender-title">Start Time</span>
				<div class="gender-category">

					Start Time
					<form:input type="Time" path="startTime" />
					<br>
					<br> End Time
					<form:input type="time" path="endTime" />

				</div>
			</div> --%>
			<div class="gender-details-box">
			<table>
			<tr>
			<td><div id="randValue" style="font-size: 20px"></div></td>
				
			<td><button type="button" id="randomClick" class="button1">Generate Random Number!</button></td>
			</tr>
			</table>
				<form:hidden path="randNo" id="randValue1"/>
			</div>
			<div class="form-submit-btn">
				<input type="reset" value="Reset"> <input type="submit"
					value="Register">
			</div>
		</form:form>
	</div>
	<script type="text/javascript">
    
    //document.getElementById("randValue").innerText="good"
    	var k= document.getElementById("randomClick");
    k.onclick = function(){
    }
    k.onclick = function(){
    var text = "";
    let i = 0;
    while (i < 4) {
    var ran= Math.floor(Math.random() * 10);
      text=text+ran;
      i++;
    }
    console.log(text);
   // abc(text);
    document.getElementById("randValue").innerHTML=text;
    document.getElementById("randValue1").value=text;
    }
    
    </script>
	<style>
.button1 {
    position: relative;
    left:60px;
}	
#randValue{
position: relative;
background: brown;
width: 60px;
background-color: black;
height: 20px;	
color: white
}
</style>
</body>
</html>