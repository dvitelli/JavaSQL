package src;
import java.io.File;
import java.sql.*;


import javax.swing.RootPaneContainer;

public class Database{     
    
    private static Connection connect = null;
    
    static {
        try {
            
                connect = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?", "root", "Secret"); //set up connection to database
                
                System.out.print("Database Started");       
                          
                } catch(SQLException exc){
                    exc.printStackTrace();
                }
}

    public static Connection getConnection(){
        return connect;
    }
    
}

/*while(rs.next()){
                        
                        employeeTest.setID(rs.getInt("employeeID"));
                        employeeTest.setFirstName(rs.getString("firstName"));
                        employeeTest.setLastName(rs.getString("lastName"));
                        employeeTest.setJobTitle(rs.getString("jobTitle"));
    
                    }
                    
                    employeeTest.print();*/    