package src;
import java.io.File;
import java.sql.*;
import javax.swing.*;
import java.awt.FlowLayout;


public class Main {
    
    public static void main(String[] args){
        
        Database database = new Database(); 
        database.startConnection(); //run database
        
        GUI gui = new GUI();
        gui.runGUI(); //run GUI
        
        JFrame frame = new JFrame("Java SQL Test"); //base frame setup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLayout(null);
        
        JPanel intoPanel = new JPanel();
        
        JLabel userIDJLabel = new JLabel("User ID :");
        frame.add(userIDJLabel);
        JTextField userFieldTextField = new JTextField(20); //user enters ID
        frame.add(userFieldTextField);
        
        JLabel firstNameJLabel = new JLabel("First Name :");
        frame.add(firstNameJLabel);
        JTextField firstNameTextField = new JTextField(24); //user enters first name
        frame.add(firstNameTextField);
        
        JLabel lastNameJLabel = new JLabel("Last Name :");
        frame.add(lastNameJLabel);
        JTextField lastNameTextField = new JTextField(24); //user enters last name
        frame.add(lastNameTextField);
        
        JLabel jobTitleJLabel = new JLabel("Job Title :");
        frame.add(jobTitleJLabel);
        JTextField jobTitleTextField = new JTextField(24); //user enters job title
        frame.add(jobTitleTextField);
        
        
        JButton searchButton = new JButton("Search");
        frame.add(searchButton);
        
        JButton editDatabaseButton = new JButton("Add User");
        frame.add(editDatabaseButton);
        
        JButton deleteUserButton = new JButton("Delete User");
        frame.add(deleteUserButton);
       
        
    
    }
    
}
