<%-- 
    Document   : homePage
    Created on : 14 Apr, 2018, 6:57:11 PM
    Author     : vrusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <form action="ValidateUser" method="get">
            <center>    
                <h1><b> Log In </b></h1><br><br>
                
                User Id : <input type="text" name="id"><br><br>
                Username : <input type="text" name="username"><br><br>
                Password : <input type="text" name="password"><br><br>
                <input type="submit" value="login"><br><br>
                <a href="registration.jsp">New User? Register here</a>
                                
                                   
            </center> 
                       
        </form>

     
    </body>
</html>
