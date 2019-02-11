<%-- 
    Document   : registration
    Created on : 14 Apr, 2018, 7:01:19 PM
    Author     : vrusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
    </head>
    <body>
        <form action="CreateNewUser" method="post">
            <center>    
                <h1><b> Registration Form </b></h1><br><br>
                
                User Id : <input type="text" name="id"><br><br>
                Username : <input type="text" name="username"><br><br>
                Name : <input type="text" name="name"><br><br>
                Date Of Birth : <input type="date" name="dob"><br><br>
                Email : <input type="email" name="email"><br><br>
                Password : <input type="password" name="password"><br><br>
                <input type="submit" value="Create User">              
                                
                                   
            </center> 
                       
        </form>

     
    </body>
</html>
