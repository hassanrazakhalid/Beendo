<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>

<body>

	<div class="container">

      <form class="form-signin" action="${BaseURL}loginSubmitted.html" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input name="email" type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label  for="inputPassword" class="sr-only">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->

	<%-- <form action="${BaseURL}loginSubmitted.html" method="post">

		<table>
		<tr><td>Email:   </td><td><input type="text" name="email">  </td></tr>
		<tr><td>Password:   </td><td><input type="text" name="password">  </td></tr>
		<tr> <td align="center"><input type="submit" value="Login"> </td> </tr>
		</table>  
	</form> --%>
	

</body>
</html>