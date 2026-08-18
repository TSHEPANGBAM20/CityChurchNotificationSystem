/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citychurchnotificationapp.servlets;

import java.io.IOException;
import java.util.HashMap;
import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ttbam
 */

@WebServlet("/register") // this is how the html/jsp and the java connect
public class RegistrationServlet extends HttpServlet{
    
   static  HashMap <String,String> users = new HashMap<>();
    
    
    //getting the data kind of like in php
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        //checks if they are in the hash map
        if (username.isEmpty() || password.isEmpty()){
            response.sendRedirect("Registration.html");
            return;
        }
        
        if (password.length() < 8){
            response.sendRedirect("Registration.html");
            return;
        }
        
        if (users.containsKey(username)){
        response.getWriter().print("Registration failed. User already exists.");
        return;
        }
        


//       
        
        users.put(username, password);
  
    }
   
  
    
    
    
    
}
