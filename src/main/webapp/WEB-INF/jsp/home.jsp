<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>

<body>

<div class="container">
  <h2>Practices Info</h2>   
  
  <div>
  	<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal">Add Record</button>
  </div>
  
 <div>
  <table class="table">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
        <th>Edit</th>
        <th>Delete</th>
        
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>John</td>
        <td>Doe</td>
        <td>john@example.com</td>
        <td><span class="glyphicon glyphicon-pencil"></td>
        <td><span class="glyphicon glyphicon-remove"></td>
      </tr>
      
      <tr>
        <td>Hashim</td>
        <td>Ali</td>
        <td>hali@example.com</td>
        <td><span class="glyphicon glyphicon-pencil"></td>
        <td><span class="glyphicon glyphicon-remove"></td>
      </tr>
      
      <tr>
        <td>Clark</td>
        <td>Max</td>
        <td>max@example.com</td>
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
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <p>Some text in the modal.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>

</html>