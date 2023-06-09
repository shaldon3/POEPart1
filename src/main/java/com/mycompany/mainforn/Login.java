/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainforn;
import javax.swing.JOptionPane;
/**
 *
 * @author Shaldon
 */
public class Login {
     public String LoginUser;
    public String LoginPass;
    
    
    // used to check if the username and password is the same thats entered in the main form
    public String checkLoginUsername(){ 
        JOptionPane.showMessageDialog(null,"Registration is finished, please login in");
       
        LoginUser = JOptionPane.showInputDialog("Please enter your username: ");
       return LoginUser;
    }
    
    public String checkLoginPassword(){
    
        LoginPass = JOptionPane.showInputDialog("Please enter your password: ");
        return LoginPass;
        

        
    }
}

   