<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>

<script type="text/javascript">
	var array = [];
	
	<c:forEach items="${rolesList}" var="listItem">

	  var id = '${listItem.role_Id}';
	  
	  var type = '${listItem.type}';
	  var create = '${listItem.create}';
	  
	  var update = '${listItem.update}';
	  var read = '${listItem.read}';
	  var del = '${listItem.delete}';
	  
	  var obj = {"Roleid":id,
			  		"type":type,
			  		"update":update,
			  		"create":create,
			  		"read":read,
			  		"del":del};
	  array.push(obj);
	</c:forEach>
	
	function updatePressed(id){
		
		console.log("In update");
		console.log(id);
	 	var model = array[id]; 
	
		console.log(model.del); 
	document.getElementById('roleField').value = model.type;
	
	document.getElementById('checkAdd').checked  = JSON.parse(model.create);
	document.getElementById('checkEdit').checked  = JSON.parse(model.update);
	document.getElementById('checkDel').checked  = JSON.parse(model.del);
	
	 var address  = "${BaseURL}"+"roles/update/" + model.Roleid; 
	/* var address = "http://localhost/Beendo:8080/"; */
	console.log(address);
	console.log(document.getElementById("roleForm"));
	 document.getElementById('roleForm').action = address;
	/* 	console.log('In Update Pressed'+ id + "Type is" + model.type, model,read); */		
	}
	
	function newPressed(){
		
		console.log("New Pressed");
		
		document.getElementById('roleField').value = "";
		
		document.getElementById('checkAdd').checked  = false;
		document.getElementById('checkEdit').checked  = false;
		document.getElementById('checkDel').checked  = false;
		
		var address = "${BaseURL}"+"roles/roleSubmitted.html";
		console.log(address);
	 	document.getElementById('roleForm').action = address;
	}
	
</script>

<body>

	<div class="container">
		<h2>Role And Permission</h2>
		<br />

		<div>
			<button type="button" class="btn btn-success" data-toggle="modal"
				data-target="#myModal" onclick="newPressed()">Add Role</button>
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

					<c:forEach items="${rolesList}" var="role" varStatus="loopCounter">
						<tr>
							<td>${role.type}</td>

							<td><c:choose>
									<c:when test="${role.create == true}">
										<span class="glyphicon glyphicon-ok"> </span>
									</c:when>
									<c:otherwise>
										<span class="glyphicon glyphicon-remove"> </span>
									</c:otherwise>
								</c:choose></td>

							<td><c:choose>
									<c:when test="${role.update == true}">
										<span class="glyphicon glyphicon-ok"> </span>
									</c:when>
									<c:otherwise>
										<span class="glyphicon glyphicon-remove"> </span>
									</c:otherwise>
								</c:choose></td>

							<td><c:choose>
									<c:when test="${role.delete == true}">
										<span class="glyphicon glyphicon-ok"> </span>
									</c:when>
									<c:otherwise>
										<span class="glyphicon glyphicon-remove"> </span>
									</c:otherwise>
								</c:choose></td>

							<td onclick="updatePressed(${loopCounter.index})" data-toggle="modal" data-target="#myModal"><span
								class="glyphicon glyphicon-pencil"> </span></td>

							<td><a
								href="<spring:url value="/roles/delete/${role.role_Id}" />">
									<span class="glyphicon glyphicon-remove"> </span>
							</a></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>

		<!-- Modal -->
		<form id= "roleForm" action="${BaseURL}roleSubmitted.html" method="post">
			<%-- <h1>${BaseURL}roleSubmitted.html</h1> --%>
			<div class="modal fade" id="myModal" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Role and Permission</h4>
						</div>
						<div class="modal-body">
							<input id="roleField" name="fieldRole" type="text"
								class="form-control" placeholder="Enter Role Name" required
								autofocus> <br />
							<div class="checkbox">
								<label><input id="checkAdd" name="create" type="checkbox" value="true">Can
									Add</label>
							</div>

							<div class="checkbox">
								<label><input id="checkEdit" name="update" type="checkbox" value="true">Can
									Edit</label>
							</div>

							<div class="checkbox">
								<label><input id="checkDel" name="delete" type="checkbox" value="true">Can
									Delete</label>
							</div>

						</div>

						<div class="modal-footer">
							<input type="submit" class="btn btn-default" value="Save" />
							<!-- <button type="submit" class="btn btn-default" data-dismiss="modal">Save</button> -->
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
						</div>
					</div>

				</div>
			</div>

		</form>
	</div>
</html>