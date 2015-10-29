<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<body>

	<div class="container">
		<h2>Role And Permission</h2>
		<br />

		<div>
			<button type="button" class="btn btn-success" data-toggle="modal"
				data-target="#myModal">Add Role</button>
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

					<c:forEach items="${rolesList}" var="role">
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

							<%-- 							<td>${role.create}</td>
							<td>${role.update}</td>
							<td>${role.delete}</td>
 --%>
						</tr>
					</c:forEach>

<!-- 					<tr>
						<td>Admin</td>
						<td><span class="glyphicon glyphicon-ok"> </span></td>
						<td><span class="glyphicon glyphicon-ok"> </span></td>
						<td><span class="glyphicon glyphicon-ok"> </span></td>
						<td><span class="glyphicon glyphicon-pencil"> </span></td>
						<td><span class="glyphicon glyphicon-remove"> </span></td>
					</tr>

					<tr>
						<td>User</td>
						<td><span class="glyphicon glyphicon-remove"></td>
						<td><span class="glyphicon glyphicon-ok"></td>
						<td><span class="glyphicon glyphicon-remove"></td>
						<td><span class="glyphicon glyphicon-pencil"></td>
						<td><span class="glyphicon glyphicon-remove"></td>
					</tr>
 -->

				</tbody>
			</table>
		</div>

		<!-- Modal -->
		<form action="${BaseURL}roleSubmitted.html" method="post">
			<h1>${BaseURL}roleSubmitted.html</h1>
			<div class="modal fade" id="myModal" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Role and Permission</h4>
						</div>
						<div class="modal-body">
							<input name="roleName" type="text" id="txtPhysicianName"
								class="form-control" placeholder="Enter Role Name" required
								autofocus> <br />
							<div class="checkbox">
								<label><input name="create" type="checkbox" value="true">Can
									Add</label>
							</div>

							<div class="checkbox">
								<label><input name="update" type="checkbox" value="true">Can
									Edit</label>
							</div>

							<div class="checkbox">
								<label><input name="delete" type="checkbox" value="true">Can
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