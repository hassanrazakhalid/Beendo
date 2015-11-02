<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<html>

<head>

<script type="text/javascript">

/* $(document).ready(function() {

	  $('#btnAdd').submit(function() {
		  
		  crunchifyAjax();
	  });
}); */

/* function savePractice() {
	
	 var name = $('#txtPracticeName').val();  
	
    $.ajax({
    	contentType : 'application/json; charset=utf-8',
    	type : "post",  
    	url : 'submitFormPractice.html',
  
        data : "name=" + name, 
        dataType : 'json',
        data : JSON.stringify(data),
        success : function(data) {
            $('#result').html(data);   
            alert(data.name);
        },
        error : function(e) {  
            alert('Error: ' + e);   
           }  
    });
} */
	 
function EditSetting(id, name)
{
	 document.getElementById("txtName").value = name; 
	 document.getElementById("editHeader").innerHTML = "Edit Practice"; 
	 var address = "${BaseURL}" + "practice/edit";
	 document.getElementById("frmModel").action = address;
	 //document.getElementById("frmModel").action = "http://localhost:8080/Beendo/practice/edit"; 
     document.getElementById("fieldId").value = id; 
}

function AddSetting()
{
	document.getElementById("txtName").value = ""; 
	document.getElementById("editHeader").innerHTML = "Add Practice";
	var address = "${BaseURL}" + "savePractice";
	 document.getElementById("frmModel").action = address;
	//document.getElementById("frmModel").action = "http://localhost:8080/Beendo/savePractice";
}
	 
</script>


</head>

<body>

<!-- <div id="result"></div> -->
 
<div class="container">
  <h2>Practice Info</h2>  
  <br /> 
  
  <div>
  	<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal" onclick="AddSetting()">Add Practice</button>
  </div>
  
  <br /> 
  
 <div>
  <table class="table">
    <thead>
      <tr>
        <th>Practice Name</th>
        <th>Edit</th>
        <th>Delete</th>
        
      </tr>
    </thead>
    <tbody>
      
      
      <c:forEach items="${Practices}" var="obj">
      	<tr>
        	<td>${obj.name}</td>
        	<td data-toggle="modal" data-target="#myModal" onclick="EditSetting(${obj.id}, '${obj.name}')" onMouseOver="this.style.cursor='pointer'">
        	  <a><span class="glyphicon glyphicon-pencil"></a>
        	</td>
        	<%-- <td data-toggle="modal" data-target="#myModal">
		      	<a href="<spring:url value="/practice/edit/${obj.id}"/>">
		      		<span class="glyphicon glyphicon-pencil">
		      	</a>
      		</td> --%>
      		<td>
		      	<a href="<spring:url value="/practice/delete/${obj.id}"/>">
		      		<span class="glyphicon glyphicon-remove">
		      	</a>
      		</td>
      		
      	</tr>     
	  </c:forEach>
      
      
      
    </tbody>
  </table> 
 </div>
 
 <!-- Add Modal -->
 
 <%-- <form:form method="POST" modelAttribute="user">
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Add Practice</h4>
        </div>
        <div class="modal-body">
        	<form:input path="name" class="form-control" placeholder="Enter Practice Name" />
        	<form:hidden id="fieldId" path="user_id"/>
        </div>
        
        <div class="modal-footer">
          <button class="btn btn-default" type="submit">Save</button>
        </div>
      </div>
      
    </div>
  </div>
 </form:form> --%> 
 
 
 <!-- Edit Modal -->
 
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
        	<form:input id="txtName" path="name" class="form-control" placeholder="Enter Practice Name" />
        	<form:hidden id="fieldId" path="user_id"/>
        </div>
        
        <div class="modal-footer">
          <button class="btn btn-default" type="submit">Save</button>
        </div>
      </div>
      
    </div>
  </div>
 </form:form> 

  
</div>

</body>
</html>