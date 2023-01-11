package src;
import java.io.File;
import java.sql.*;

import javax.swing.RootPaneContainer;

class Database{     
    
        void startConnection(){
        
    
            try (
            
                Connection connect = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?", "root", "Wsult123!"); //set up connection to database
                
                Statement stmt = connect.createStatement(); //statement required for talking to SQL
                
                ) {
                    
                    String seeAll = "SELECT * from employeedata";
                    System.out.print("SQL Test:" + seeAll + "\n");
                    ResultSet rs = stmt.executeQuery(seeAll);
                    
                    /*while(rs.next()){
                        
                        employeeTest.setID(rs.getInt("employeeID"));
                        employeeTest.setFirstName(rs.getString("firstName"));
                        employeeTest.setLastName(rs.getString("lastName"));
                        employeeTest.setJobTitle(rs.getString("jobTitle"));
    
                    }
                    
                    employeeTest.print();*/
                    
                    while (rs.next()){
                        int employeeId = rs.getInt("employeeID");
                        String firstName = rs.getString("firstName");
                        String lastName = rs.getString("lastName");
                        String jobTitle = rs.getString("jobTitle");
                        System.out.format("%s, %s, %s, %s\n", employeeId, firstName, lastName, jobTitle);
                    } //print all info in database 
                    
                
                    
                } catch(SQLException exc){
                    exc.printStackTrace();
                }
                
        
    }  
    
}