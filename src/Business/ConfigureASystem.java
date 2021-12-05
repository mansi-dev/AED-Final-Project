package Business;

import Business.Admin.AdminDirectory;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.User;
import Business.UserAccount.UserAccount;

/**
 *
 * @author mansi
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        system.setAdminDirectory(new AdminDirectory());

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        //Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin","sysadmin","sysadmin", "sysadmin", User.Role.Admin);
        
        return system;
    }
    
}
