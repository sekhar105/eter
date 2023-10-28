<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/empControl/savetiming" >
<div style="position: absolute; left: 36%;top: 31%;">
    <table>
        <thead>

        </thead>
        <tbody>
            <!-- <tr>
                  <td>start time:   <input id="st1" type="time" name="start time" onchange="change('1')"></td>
                  <td>end time: <input id="et1" type="time"></td>  
                  <td><button id="l1" onclick="leave('1')" >leave</button></td>
            </tr>
            <tr>
                <td>start time:   <input type="time" name="start time"></td>
                <td>end time: <input id="et2" type="time"></td>  
                  <td><button id="l2" onclick="leave('2')">leave</button></td>
            </tr>
            <tr>
                <td>start time:  <input id="st3" type="time" name="start time"></td>
                  <td>end time: <input type="time"></td>  
                  <td><button id="l3" onclick="leave('3')">leave</button></td>
           </tr> -->
			
			<c:forEach items="${empWrHrs}" var="da">
			<tr>
			<td>${da.name}:</td>
			<td>start time: <input id="st${da.id}" type="time" name="${da.starttime}" onchange="change(${da.id})"></td>
			<td>end time: <input id="et${da.id}" type="time" name="${da.endtime}" onchange="change(${da.id})"> </td>
			<td><button id="l${da.id}" onclick="leave(${da.id})">leave</button> </td>
			</tr>
			</c:forEach>
			
        </tbody>
    </table>
    <input type="submit">
    </form:form>
</div>
<style>
  
        table{
            border-spacing: 20px;
        }
    </style>
    <script>
     function   leave(da){
       // alert(da);
        document.getElementById("l"+da).disabled = true;
        document.getElementById("st"+da).value='';
        document.getElementById("et"+da).value='';
        }
     function   working(da){
        document.getElementById("l"+da).disabled = true;
        }
        function change(da){

           // alert("chane")
            document.getElementById("l"+da).disabled = false;
        }
    </script>
</body>
</html>