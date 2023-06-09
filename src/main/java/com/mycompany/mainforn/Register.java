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

// checks if the username and password entered is validated
public class Register {
         public String Username;
     public String Password;
    
    
    public String checkUsername(){
       boolean valid = false;
       
        while(!valid){
             Username= JOptionPane.showInputDialog("Please enter a 5 character long username which contains an uderscore: ");
             
             
             if(Username.length() <= 5 && Username.contains("_")){
                 JOptionPane.showMessageDialog(null,"Username successfully captured");
                 valid = true;
             }
             else{
                 JOptionPane.showMessageDialog(null,"Format incorrect");
                 
             }    
        }
         return Username;
    }
    
    
    public String checkPassword(){

       
        boolean valid2 = false;
        
        while(!valid2){
            Password = JOptionPane.showInputDialog("Please enter an 8 character password which contains a capital"
                +" letter, a number and a special charcater: ");
            
            
            if(Password.length() > 8 && Password.matches(".*[A-Z].*") && Password.matches(".*\\d+.*")){
                
                for(int i = 0; i < Password.length(); i++){
                    
                    if(!Character.isDigit(Password.charAt(i)) && !Character.isLetter(Password.charAt(i))){
                         valid2 = true;
                    }
                }
                JOptionPane.showMessageDialog(null,"Password successfully captured");
                valid2 = true;
            }
            else{
                JOptionPane.showMessageDialog(null,"Password format incorrect");
            }
        }
         return Password;
    }   

    
}
