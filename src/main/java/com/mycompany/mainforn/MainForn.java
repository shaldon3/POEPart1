/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainforn;
import javax.swing.JOptionPane;

/**
 *
 * @author Shaldon
 */
public class MainForn {

    public static void main(String[] args) {
     // main form used to enter the persons first and last name       
     String firstname = JOptionPane.showInputDialog("Please enter your first name: ");
     String lastname = JOptionPane.showInputDialog("Please enter your last name: ");
        
        Register u = new Register();
        u.checkUsername();
        u.checkPassword();
        
        Login l = new Login();
        l.checkLoginUsername();
        l.checkLoginPassword();
        
        
        String RegUsername = u.Username;
        String RegPassword = u.Password;
        
        String LoginUsername = l.LoginUser;
        String LoginPassword = l.LoginPass;
        
        
        
        if(RegUsername == null ? LoginUsername == null : RegUsername.equals(LoginUsername)){
            
            if(RegPassword == null ? LoginPassword == null : RegPassword.equals(LoginPassword)){
                
                JOptionPane.showMessageDialog(null,"Welcome " + firstname + lastname + "\n Its great to see you again");
            }
            else{
                JOptionPane.showMessageDialog(null,"Username or password incorrect, please try again");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Username or password incorrect, please try again");
        }
    }
}

    

