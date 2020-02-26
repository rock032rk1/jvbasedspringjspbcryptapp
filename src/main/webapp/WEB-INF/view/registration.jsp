<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h1>Registration Form</h1>
     <form action="save" method="post">
        <table>
          <tr>
            <td>Username:</td>
            <td><input type="text" name="username"></td>
          </tr>
          <tr>
            <td>Password:</td>
            <td><input type="text" name="password"></td>
          </tr>
          <tr>
            <td>Name:</td>
            <td><input type="text" name="name"></td>
          </tr>
          <tr>
            <td></td>
            <td><input type="submit" value="Submit"></td>
          </tr>
        </table>
     </form>
</body>
</html>