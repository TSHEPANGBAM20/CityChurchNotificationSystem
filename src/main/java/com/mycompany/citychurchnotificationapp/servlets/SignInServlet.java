/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citychurchnotificationapp.servlets;

import java.io.IOException;
import javax.enterprise.context.SessionScoped;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ttbam
 */
@WebServlet("/signIn")
public class SignInServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //they get the text from the html kinda like dom
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        //check validations
        if (username.isEmpty() || password.isEmpty()){
            //error message
        }
        
        // check if data structure contains user
       
        if (!RegistrationServlet.users.containsKey(username)){
            //error message
        }else if (RegistrationServlet.users.containsKey(username)){
            //success and redirect
        }
        //
        
        
    }
    
}
