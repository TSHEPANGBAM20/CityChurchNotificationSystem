/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citychurchnotificationapp.servlets;

import java.io.IOException;
import java.util.HashSet;
import javax.enterprise.context.SessionScoped;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ttbam
 */

//Maybe add sessionscoped here
@WebServlet("/signIn")
public class SignInServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //they get the text from the html kinda like dom
        String username = request.getParameter("usernameSignIn");
        String password = request.getParameter("passwordSignIn");
        
        //check validations
        if (username.isEmpty()){
            //error message
            response.getWriter().print("Username field cannot be empty");
            return;
        }
        
        if (password.isEmpty()){
            //error message
            response.getWriter().print("Password field cannot be empty");
            return;
        }
        
        // check if data structure contains user
       
        if (RegistrationServlet.users.containsKey(username) == false){
            //error message
            response.getWriter().print(" User not found");
        }else if (RegistrationServlet.users.containsKey(username) && password.equals(RegistrationServlet.users.get(username)) ){
            //success and redirect
            HttpSession session = request.getSession();
           session.setAttribute("username", username);
           
           response.getWriter().print("Welcome back " + session.getAttribute("username"));
          
        }
        //
        
    }
    
}
