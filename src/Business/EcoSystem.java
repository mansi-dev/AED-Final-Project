/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Government.LicenseOrganization;
import Business.Admin.AdminDirectory;
import Business.Population.Receiver;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author mansi
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private LicenseOrganization licenseDirectory;

    private Receiver recieverDirectory;
    private AdminDirectory adminDirectory;

  
    public EcoSystem(RestaurantDirectory restaurantDirectory, LicenseOrganization licenseDirectory, Receiver recieverDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.recieverDirectory = recieverDirectory;
        this.licenseDirectory = licenseDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
    }

    public void setAdminDirectory(AdminDirectory adminDirectory) {
        this.adminDirectory = adminDirectory;
    }

    
    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
