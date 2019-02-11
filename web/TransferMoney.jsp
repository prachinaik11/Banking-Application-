<%-- 
    Document   : TransferMoney
    Created on : 14 Apr, 2018, 7:23:38 PM
    Author     : vrusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transfer Money</title>
    </head>
    <body>
        <form action="TransferMoneyTransaction" method="get">
          
            <center>

                <h1><b>Transfer Money</b></h1>
                
                Enter User ID to which u want to transfer money : <input type="text" name="pId"><br><br>
                Enter name of payee : <input type="text" name="pName"><br><br>
                Enter amount to transfer : <input type="text" name="amt"><br><br>
                
                <input type="submit" value="Transfer Money">
                
            </center>
            
        </form>
    </body>
</html>
