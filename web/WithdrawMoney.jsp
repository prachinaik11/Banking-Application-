<%-- 
    Document   : WithdrawMoney
    Created on : 14 Apr, 2018, 7:23:26 PM
    Author     : vrusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Withdraw Money</title>
    </head>
    <body>
        <form action="WithdrawTransaction" method="get">
          
            <center>

                <h1><b>Withdraw Money</b></h1>
                
                Enter amount to withdraw : <input type="text" name="amt"><br><br>
                
                <input type="submit" value="Withdraw Amount">
                
            </center>
            
        </form>
    </body>
</html>
