package src;
//import java.util.concurrent.Flow;\
//import java.awt.FlowLayout;

import java.io.File;
import java.sql.*;
import javax.swing.*;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

class GUI extends JFrame implements ActionListener {
    
    private Connection con = Database.getConnection(); //connection to database
    private JButton searchButton;
    private JButton addUserButton;
    private JButton deleteUserButton;
    private JTextField userIDTextField;
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField jobTitleTextField;
    

    void runGUI(){

        JFrame frame = new JFrame("Java SQL Test"); //base frame setup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(375, 250);
        frame.setVisible(true);
        
        JPanel databasePanel = new JPanel();
        databasePanel.setLayout(null);
        frame.add(databasePanel);
        
        JLabel userIDLabel = new JLabel("User ID :");
        userIDLabel.setBounds(10,20,80,25);
        databasePanel.add(userIDLabel);
        this.userIDTextField = new JTextField(20); //user enters ID
        this.userIDTextField.setBounds(100,20,165,25);
        databasePanel.add(this.userIDTextField);
        
        JLabel firstNameLabel = new JLabel("First Name :");
        firstNameLabel.setBounds(10, 50, 80, 25);
        databasePanel.add(firstNameLabel);
        this.firstNameTextField = new JTextField(24); //user enters first name
        this.firstNameTextField.setBounds(100, 50, 165, 25);
        databasePanel.add(this.firstNameTextField);
        
        JLabel lastNameLabel = new JLabel("Last Name :");
        lastNameLabel.setBounds(10, 80, 80, 25);
        databasePanel.add(lastNameLabel);
        this.lastNameTextField = new JTextField(24); //user enters last name
        this.lastNameTextField.setBounds(100, 80, 165, 25);
        databasePanel.add(this.lastNameTextField);
        
        JLabel jobTitleLabel = new JLabel("Job Title :");
        jobTitleLabel.setBounds(10, 110, 80, 25);
        databasePanel.add(jobTitleLabel);
        this.jobTitleTextField = new JTextField(24); //user enters job title
        this.jobTitleTextField.setBounds(100, 110, 165, 25);
        databasePanel.add(this.jobTitleTextField);
        
        this.searchButton = new JButton("Search"); //use to search for user matching data in records
        this.searchButton.setBounds(10, 140, 100, 25);
        this.searchButton.addActionListener(this);
        databasePanel.add(this.searchButton);
        
        
        this.addUserButton = new JButton("Add User");//use to add user to database
        this.addUserButton.setBounds(120, 140, 100, 25);
        this.addUserButton.addActionListener(this);
        databasePanel.add(this.addUserButton);
        
        this.deleteUserButton = new JButton("Delete User");//use to delete user from database
        this.deleteUserButton.setBounds(230, 140, 100, 25);
        this.deleteUserButton.addActionListener(this);
        databasePanel.add(this.deleteUserButton);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource().equals(searchButton)){
            System.out.print("Search Button");
            
            
        }else if(e.getSource() == addUserButton){
            
            System.out.print("Add User Button");
            
            if(userIDTextField.getText().isEmpty()){
                
                
                
                System.out.print("Empty");//implement empty error message
                
            } else if (userIDTextField.getText().length() < 3 || userIDTextField.getText().length() >3) {
                
                //error if User ID isnt 3 digits or non numerical
                
            } else {
                
               
                    
                // all checks are fine so we can add to database
                /*Employee employeeAdd = new Employee(Integer.parseInt(userIDTextField.getText()), 
                firstNameTextField.getText(), lastNameTextField.getText(), jobTitleTextField.getText());*/
                
            }
            
        }else if(e.getSource() == deleteUserButton){
            System.out.print("Delete User Button");
            
            
        } 
        
    }
}


/*try {Statement stmt = con.createStatement(); //statement required for talking to SQL
                
                
    String seeAll = "SELECT * from employeedata";
    System.out.print("SQL Test:" + seeAll + "\n");
    ResultSet rs = stmt.executeQuery(seeAll);
    
     while (rs.next()){
        int employeeId = rs.getInt("employeeID");
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String jobTitle = rs.getString("jobTitle");
        System.out.format("%s, %s, %s, %s\n", employeeId, firstName, lastName, jobTitle);
    } //print all info in database  
    
} catch(SQLException exc){
    exc.printStackTrace();
} */