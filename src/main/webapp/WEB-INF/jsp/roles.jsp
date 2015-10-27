<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
 
<html>

<body>

<div class="container">
  <h2>Role And Permission</h2>  
  <br /> 
  
  <div>
  	<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal">Add Role</button>
  </div>
  
  <br /> 
  
 <div>
  <table class="table">
    <thead>
      <tr>
        <th>Role Name</th>
        <th>Can Add</th>
        <th>Can Edit</th>
        <th>Can Delete</th>
        <th>Edit</th>
        <th>Delete</th>
        
      </tr>
    </thead>
    <tbody>
      
      <tr>
        <td>Admin</td>
        <td><span class="glyphicon glyphicon-ok"></td>
        <td><span class="glyphicon glyphicon-ok"></td>
        <td><span class="glyphicon glyphicon-ok"></td>
        <td><span class="glyphicon glyphicon-pencil"></td>
        <td><span class="glyphicon glyphicon-remove"></td>
      </tr>
      
      <tr>
        <td>User</td>
        <td><span class="glyphicon glyphicon-remove"></td>
        <td><span class="glyphicon glyphicon-ok"></td>
        <td><span class="glyphicon glyphicon-remove"></td>
        <td><span class="glyphicon glyphicon-pencil"></td>
        <td><span class="glyphicon glyphicon-remove"></td>
      </tr>
     
      
    </tbody>
  </table> 
 </div>
 
 <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Role and Permission </h4>
        </div>
        <div class="modal-body">
          <input type="text" id="txtPhysicianName" class="form-control" placeholder="Enter Role Name" required autofocus>
        
         <br />
          <div class="checkbox">
  	      	<label><input type="checkbox" value="">Can Add</label>
		  </div>
		  
	 	  <div class="checkbox">
  		  	<label><input type="checkbox" value="">Can Edit</label>
		  </div>
		  
		  <div class="checkbox">
  		  	<label><input type="checkbox" value="">Can Delete</label>
		  </div>
        
        </div>
        
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Save</button>
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>

</html>