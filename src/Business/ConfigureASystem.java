package Business;

import Business.Admin.AdminDirectory;
import Business.Government.LicenseDirectory;
import Business.Government.TrainingDirectory;
import Business.Hospital.DoctorDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Manager.ManagerDirectory;
import Business.Population.PersonDirectory;
import Business.UserAccount.User;
import Business.UserAccount.UserAccount;
import Government.Admin.GovernmentAdminDirectory;

/**
 *
 * @author mansi
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        system.setAdminDirectory(new AdminDirectory());
        system.setPersonDirectory(new PersonDirectory());
        system.setDoctorDirectory(new DoctorDirectory());
        system.setHospitalDirectory(new HospitalDirectory());
        system.setManagerDirectory(new ManagerDirectory());
        system.setGovernmentAdminDirectory(new GovernmentAdminDirectory());
        system.setLicenseDirectory(new LicenseDirectory());
        system.setTrainingDirectory(new TrainingDirectory());
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        //Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin","sysadmin", "sysadmin", User.Role.Admin);
        
        return system;
    }
    
}
