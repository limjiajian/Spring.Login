<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head><title>User Login</title></head>
<body>
<h6><font color="red">${userNameRef}</font></h6>
<table>
  <form:form action="checkUser" method="post" commandName="user"> 
	<tr>  <td>UserName:</td> <td><form:input  path="userName"/> </td> </tr> 
	<tr> <td> Password :</td> <td><form:password path="password"/> </td> </tr> 
	<tr> <td colspan=2>   <input type="submit"> </td>
  </form:form>
</table>   
</body>
</html> 