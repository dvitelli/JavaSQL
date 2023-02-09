package src;
import java.io.File;
import java.sql.*;

public class Employee {
    
    int employeeId;
    String firstName;
    String lastName;
    String jobTitle;
    
    public Employee(){}
    public Employee(int employeeIDIn, String firstNameIn, String lastNameIn, String jobTitleIn){
        
        this.employeeId = employeeIDIn;
        this.firstName = firstNameIn;
        this.lastName = lastNameIn;
        this.jobTitle = jobTitleIn;
        
    }
    public Employee(int employeeIDIn){
        
        this.employeeId = employeeIDIn;
        
    } void print(){
        
        System.out.format("\n%s, %s, %s, %s\n", this.employeeId, this.firstName, this.lastName, this.jobTitle);
        
    } void setID(int IDIn){
        
        this.employeeId = IDIn;
        
    } void setFirstName(String firstIn){
        
        this.firstName = firstIn;
        
    } void setLastName(String lastIn){
        
        this.firstName = lastIn;
        
    } void setJobTitle(String jobIn){
        
        this.firstName = jobIn;
        
    }
    
}
