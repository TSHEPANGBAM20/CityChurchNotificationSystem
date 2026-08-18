<%-- 
    Document   : Registration
    Created on : 17 Aug 2026, 21:18:20
    Author     : ttbam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>City Church|Register</title>
    </head>
    <body>
        <h1>Register</h1>
        
        <form action="register" method="POST"> <!--Post to the Java bean-->
            <label for="username">Username</label>
            <input type="text" id="username" name="username">
            
            <label for="password">Password</label>
            <input type="password" id="password" name="password">
            
            <button type="submit">Submit</button>
            
            <p id="successRegistration"></p>
            <p id="errorRegistration"></p>
            
        </form>
    </body>
</html>
