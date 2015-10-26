<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>

<body>

<div class="container">
  <h2>Practices Info</h2>   
  
  <div>
  	<button type="button" class="btn btn-success">Add Physician</button>
  </div>
  
  <div class="row">
  	<div class="span9" />
  </div>
                 
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

</html>