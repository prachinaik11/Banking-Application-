<%-- 
    Document   : DepositMoney
    Created on : 14 Apr, 2018, 7:23:11 PM
    Author     : vrusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit Money</title>
    </head>
    <body>
        <form action="DepositTransaction" method="get">
          
            <center>

                <h1><b>Deposit Money</b></h1>
                
                Enter amount to deposit : <input type="text" name="amt"><br><br>
                
                
                <input type="submit" value="Deposit Amount">
                
            </center>
            
        </form>
    </body>
</html>
