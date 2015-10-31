<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="http://jqueryui.com/jquery-wp-content/themes/jqueryui.com/style.css">

<script>
  $(function() {
    $( "#accordion" ).accordion({
    	collapsible: true,
    	   heightStyle: "content"
    	
    });
  });
  </script>
</head>
<body>
  
<div class="container">
  <h2>Practices Records</h2>   
  <br /> 
  
  <div>
  	<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal">Add Record</button>
  </div>
  <br /> 
  
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
          <h4 class="modal-title">Practice Record</h4>
        </div>
        <div class="modal-body">
        <div class="row">
        
        	<div id="accordion">
				  <h3>Check Boxes</h3>
				  <div>
				  <div class="checkbox">
					  <label><input type="checkbox" value="">Option 1</label>
					</div>
					<div class="checkbox">
					  <label><input type="checkbox" value="">Option 1</label>
					</div>
				  </div>
				  <h3>Date Picker</h3>
				  <div>
					  <div class="row">
						  <div class="col-sm-6"><input type="date" class="form-control" placeholder="Status"></div>
						  <div class="col-sm-6"><input type="date" class="form-control" placeholder="Status"></div>
					  </div>
				  </div>
				  <h3>Text</h3>
				  <div>
				    <div class="col-sm-6"><input type="text" class="form-control" placeholder="Last Contact"></div>
		  <div class="col-sm-6"><input type="text" class="form-control" placeholder="Comment"></div>
				  </div>
				  </div>
        
        </div>
        <!-- <div class="row">  
	        <div class="col-sm-6">     
	          <select class="form-control" id="selRole">
	        	<option>Select Physician</option>
	        	<option>Mathew</option>
	        	<option>Alan</option>
	          </select>
	          </div>
	          
	          <div class="col-sm-6"> 
		          <select class="form-control" id="selPractices">
		        	<option>Select Insurance</option>
		        	<option>A-type</option>
		        	<option>Care Med</option>
		          </select>
	          </div>
         </div>
          
        <br />        
        <div class="row"> 
		  <div class="col-sm-6"><input type="date" placeholder="App file date" class="form-control"></div>
		  <div class="col-sm-6"><input type="text" class="form-control" placeholder="Status"></div>
	    </div>
	    
	    <br />
	    <div class="row">
		  <div class="col-sm-6"><input type="date" class="form-control" placeholder="Status"></div>
		  <div class="col-sm-6"><input type="date" class="form-control" placeholder="Status"></div>
	    </div>
	    
	    <br />
	    <div class="row">
		  <div class="col-sm-6"><input type="text" class="form-control" placeholder="Last Contact"></div>
		  <div class="col-sm-6"><input type="text" class="form-control" placeholder="Comment"></div>
	    </div>
           -->
        <br />
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Save</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>

</html>