<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>

<body> 

<div class="container">
  <h2>Add User</h2>  
  <br /> 
  
  <div>
  	<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal">Add User</button>
  </div>
  
  <br /> 
  
 <div>
  <table class="table">
    <thead>
      <tr>
        <th>Userame</th>
        <th>Email</th>
        <th>Password</th>
        <th>Role</th>
        <th>Edit</th>
        <th>Delete</th>
        
      </tr>
    </thead>
    <tbody>
      
      <tr>
        <td>Mathew</td>
        <td>mathew@microsoft.com</td>
        <td>mac785t</td>
        <td>Admin</td>
        <td><span class="glyphicon glyphicon-pencil"></td>
        <td><span class="glyphicon glyphicon-remove"></td>
      </tr>
      
      <tr>
        <td>Bilay</td>
        <td>bl8765@ymail.com</td>
        <td>976gtd</td>
        <td>User</td>
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
  </div>
  
</div>

</html>