<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <meta charset="utf-8" />
    <title>Add Teacher</title>
    <meta name="viewport" content="width=device-width,
      initial-scale=1.0"/>
    <link rel="stylesheet" href="/style.css" />
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css"/>
  </head>
  <body>
  
  
  <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>
  <script type="text/javascript">
  window.onload{
      alert('${te}');
  }
  function Alert(){
	  var name =document.teacherform.name.value;
	  alert(name);
	  alertify.success(name);
	  alertify.set('notifier','position', 'top-right');
	  alertify.success(name);
	  var email=document.tea'cherform.email.value;
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
      <h1 class="form-title">Add Saloon</h1>
   <form:form name="saloonform" method="POST" action="/salooncontroller/savesaloon" modelAttribute="saloon">
        <div class="main-user-info">
          <div class="user-input-box">
            <label for="fullName">Name</label>
            <input type="text"
                    id="fullName"
                    name="name"
                  
                    placeholder="Enter Full Name"/>
          </div>
          <!-- <div class="user-input-box">
            <label for="username">Username</label>
            <input type="text"
                    id="username"
                    name="username"
                    placeholder="Enter Username"/>
          </div> -->
          <div class="user-input-box">
            <label for="email">Email</label>
            <input type="email"
                    id="email"
                    name="email"
                    placeholder="Enter Email"/>
          </div>
          <div class="user-input-box">
            <label for="phoneNumber">Adress</label>
            <input type="text"
                    id="phoneNumber"
                    name="address"
                    placeholder="Enter Phone Number"/>
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
        
        <div class="form-submit-btn">
            <input type="reset" value="Reset">
          <input type="submit" value="Register">
        </div>
      </form:form>
    </div>
  </body>
</html>