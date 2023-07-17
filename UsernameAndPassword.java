/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author MNCEDISI
 */
public class UsernameAndPassword extends JFrame
{
    private JPanel usernamePNL;
    private JPanel passwordPNL;
    private JPanel headingPNL;
    private JPanel usernameAndPasswordPNL;
    private JPanel submitPNL;
    private JPanel mainPNL;
    
    private JLabel usernameLBL;
    private JLabel passwordLBL;
    private JLabel headingLBL;
    
    private JTextField usernameTxtFLD;
    
    private JPasswordField passwordFLD;
    
    private JButton submitBTN;
    
    public UsernameAndPassword()
    {
        setTitle("User login page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(280, 200);
        setResizable(false);
   
        //Creating a JPanel
        headingPNL = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        usernamePNL = new JPanel(new FlowLayout());
        passwordPNL = new JPanel(new FlowLayout());
        usernameAndPasswordPNL = new JPanel(new GridLayout(2,1));
         
        submitPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
  
        mainPNL = new JPanel(new GridLayout(3, 1));
        
        //Creating a JLabel
        headingLBL = new JLabel("Login Details");
        headingLBL.setFont(new Font("Aharoni", 0, 16));
        
        usernameLBL = new JLabel("Username    :");
        passwordLBL = new JLabel("Password    :");
        
        //Create a JTextFeild
        usernameTxtFLD = new JTextField(15);
        
        //Create a JPassword
        passwordFLD = new JPasswordField(15);
        
        //Create a JButton
        submitBTN = new JButton("Submit");
 
        //Adding to JPanels varaibles
        headingPNL.add(headingLBL );
        
        usernamePNL.add(usernameLBL);
        usernamePNL.add(usernameTxtFLD);
        
        passwordPNL.add(passwordLBL);
        passwordPNL.add(passwordFLD);
        
        usernameAndPasswordPNL.add(usernamePNL);
        usernameAndPasswordPNL.add(passwordPNL);
        
        submitPNL.add(submitBTN);
        
        mainPNL.add(headingPNL );
        mainPNL.add(usernameAndPasswordPNL);
        mainPNL.add(submitPNL  );
        
        mainPNL.setBorder(new LineBorder(Color.black));
       
        add(mainPNL , BorderLayout.CENTER);
        
        setVisible(true);
    }
}
