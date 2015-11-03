<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 
<html>

<head>

<script type="text/javascript">
	 
function EditSetting(id, name)
{
	 document.getElementById("txtName").value = name; 
	 document.getElementById("editHeader").innerHTML = "Edit Insurance"; 
	 var address = "${BaseURL}" + "insurance/edit";
	 document.getElementById("frmModel").action = address;
	 //document.getElementById("frmModel").action = "http://localhost:8080/Beendo/practice/edit"; 
     document.getElementById("fieldId").value = id; 
}

function AddSetting()
{
	document.getElementById("txtName").value = ""; 
	document.getElementById("editHeader").innerHTML = "Add Insurance";
	var address = "${BaseURL}" + "saveInsurance";
	 document.getElementById("frmModel").action = address;
	//document.getElementById("frmModel").action = "http://localhost:8080/Beendo/savePractice";
}
	 
</script>

</head>

<body>

<div class="container">
  <h2>Insurance Info</h2> 
  <br />   
  
  <div>
  	<button type="button" class="btn btn-success" data-toggle="modal" onclick="AddSetting()" data-target="#myModal">Add Insurance</button>
  </div>
  <br /> 
  
 <div>
  <table class="table">
    <thead>
      <tr>
        <th>Name</th>
        <th>Edit</th>
        <th>Delete</th>
        
      </tr>
    </thead>
    <tbody>
      
      <c:forEach items="${Insurances}" var="obj">
      	<tr>
        	<td>${obj.name}</td>
        	<td data-toggle="modal" data-target="#myModal" onclick="EditSetting(${obj.id}, '${obj.name}')" onMouseOver="this.style.cursor='pointer'">
        	  <a><span class="glyphicon glyphicon-pencil"></a>
        	</td>
        	
      		<td>
		      	<a href="<spring:url value="/insurance/delete/${obj.id}"/>">
		      		<span class="glyphicon glyphicon-remove">
		      	</a>
      		</td>
      		
      	</tr>  
      </c:forEach>
      
    </tbody>
  </table> 
 </div>
 
 <!-- Modal -->
 <form:form id="frmModel" method="POST" modelAttribute="insurance">
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title" id="editHeader"></h4>
        </div>
        <div class="modal-body">
        	<form:input id="txtName" path="name" class="form-control" placeholder="Enter Insurance Name" />
        	<form:hidden id="fieldId" path="id"/>
        </div>
        
        <div class="modal-footer">
          <button class="btn btn-default" type="submit">Save</button>
        </div>
      </div>
      
    </div>
  </div>
 </form:form> 
  
</div>

</html>
