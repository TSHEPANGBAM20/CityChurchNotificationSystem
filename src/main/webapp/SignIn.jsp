<%-- 
    Document   : SignIn
    Created on : 17 Aug 2026, 21:18:42
    Author     : ttbam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="register" method="POST"> <!--Post to the Java bean-->
            <label for="username">Username</label>
            <input type="text" id="username" name="username">
            
            <label for="password">Password</label>
            <input type="password" id="password" name="password">
            
            <button type="submit">Sign in</button>
            
            <p id="successSignIn"></p>
            <p id="errorSignIn"></p>
            
        </form>
    </body>
</html>
