<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 
<html>

<head>

<script type="text/javascript">
	 
function EditSetting(id, name, email, pswd)
{
	 document.getElementById("inputName").value = name; 
	 document.getElementById("inputEmail").value = email; 
	 document.getElementById("inputPassword").value = pswd; 
	 document.getElementById("editHeader").innerHTML = "Edit User"; 
	 var address = "${BaseURL}" + "users/edit";
	 document.getElementById("frmModel").action = address;
	 //document.getElementById("frmModel").action = "http://localhost:8080/Beendo/practice/edit"; 
     document.getElementById("fieldId").value = id; 
}

function AddSetting()
{
	document.getElementById("inputName").value = ""; 
	document.getElementById("inputEmail").value = ""; 
	 document.getElementById("inputPassword").value = "";
	document.getElementById("editHeader").innerHTML = "Add User";
	var address = "${BaseURL}" + "saveUser";
	 document.getElementById("frmModel").action = address;
	//document.getElementById("frmModel").action = "http://localhost:8080/Beendo/savePractice";
}
	 
</script>

</head>
<html>

<body> 

<div class="container">
  <h2>Add User</h2>  
  <br /> 
  
  <div>
  	<button type="button" class="btn btn-success" data-toggle="modal" onclick="AddSetting()" data-target="#myModal">Add User</button>
  </div>
  
  <br /> 
  
 <div>
  <table class="table">
    <thead>
      <tr>
        <th>Userame</th>
        <th>Email</th>
        <th>Password</th>
        <!-- <th>Role</th> -->
        <th>Edit</th>
        <th>Delete</th>
        
      </tr>
    </thead>
    <tbody>
      
      <c:forEach items="${Users}" var="obj">
      	<tr>
        	<td>${obj.name}</td>
        	<td>${obj.email}</td>
        	<td>${obj.password}</td>
        	<td data-toggle="modal" data-target="#myModal" onclick="EditSetting(${obj.user_id}, '${obj.name}', '${obj.email}', '${obj.password}')" onMouseOver="this.style.cursor='pointer'">
        	  <a><span class="glyphicon glyphicon-pencil"></a>
        	</td>
        	
      		<td>
		      	<a href="<spring:url value="/users/delete/${obj.user_id}"/>">
		      		<span class="glyphicon glyphicon-remove">
		      	</a>
      		</td>
      		
      	</tr>  
      </c:forEach>
      
    </tbody>
  </table> 
 </div>
 
 
  <!-- Modal -->
 <form:form id="frmModel" method="POST" modelAttribute="user">
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title" id="editHeader"></h4>
        </div>
        <div class="modal-body">
          <form:input type="text" path="name" id="inputName" class="form-control" placeholder="Username"  />
          <br />
          <!-- <label for="inputEmail" class="sr-only">Email address</label> -->
          <form:input type="email" path="email" id="inputEmail" class="form-control" placeholder="Email address"  />
          <br />
          <form:input type="password" path="password" id="inputPassword" class="form-control" placeholder="Password" />
          <form:hidden id="fieldId" path="user_id"/>
          <br />
          <select class="form-control" id="selRole">
        	<option>Select Roles</option>
        	<option>User</option>
        	<option>Admin</option>
          </select>
        
        </div>
        
        <div class="modal-footer">
          <button class="btn btn-default" type="submit">Save</button>
        </div>
      </div>
      
    </div>
  </div>
 </form:form> 

  <!-- <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      Modal content
      <div class="modal-content">
        <div class="modal-header"> 
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Add User </h4>
        </div>
        <div class="modal-body">
          <input type="text" id="txtPhysicianName" class="form-control" placeholder="Username" required autofocus>
          <br />
          <label for="inputEmail" class="sr-only">Email address</label>
          <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
          <br />
          <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
          <br />
          <select class="form-control" id="selRole">
        	<option>Select Roles</option>
        	<option>User</option>
        	<option>Admin</option>
          </select>
          
          <br />
          <select class="form-control" id="selPractices">
        	<option>Select Practices</option>
        	<option>byp</option>
        	<option>sybac</option>
          </select>
        
        </div>
        
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Save</button>
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div> -->
  
</div>

</html>