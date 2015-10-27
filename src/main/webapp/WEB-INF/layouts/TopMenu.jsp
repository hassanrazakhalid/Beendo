<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container">
	 
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Bendoo</a>
    </div>
    <div>
     
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">PMS <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="http://localhost:8080/Beendo/physician">Physician</a></li>
            <li><a href="http://localhost:8080/Beendo/insurance">Insurances</a></li>
            <li><a href="http://localhost:8080/Beendo/practice">Practices</a></li>
            <li role="separator" class="divider" />
            <li><a href="http://localhost:8080/Beendo/users">User</a></li>
            <li><a href="http://localhost:8080/Beendo/roles">Role & Permission</a></li>
          </ul>
        </li>

      </ul>
    </div>
  </div>
</nav>
	
</div>

</body>
</html>