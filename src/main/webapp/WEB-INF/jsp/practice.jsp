<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<body>
 
<div class="container">
  <h2>Practice Info</h2>  
  <br /> 
  
  <div>
  	<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal">Add Practice</button>
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
        	<td><span class="glyphicon glyphicon-pencil"></td>
        	<td><span class="glyphicon glyphicon-remove"></td>
      	</tr>     
	  </c:forEach>
      
      
      
    </tbody>
  </table> 
 </div>
 
 <!-- Modal -->
 
 <form action="http://localhost:8080/Beendo/addPractice" method="post">
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Add Practice</h4>
        </div>
        <div class="modal-body">
          <input type="text" name="txtPracticeName" class="form-control" placeholder="Enter Practice Name" required autofocus>
        </div>
        
        <div class="modal-footer">
          <button class="btn btn-default" type="submit">Save</button>
        </div>
      </div>
      
    </div>
  </div>
</form>  
  
</div>

</html>