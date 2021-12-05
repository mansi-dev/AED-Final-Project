/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Admin.AdminDirectory;
import Business.Customer.CustomerDirectory;
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
    private CustomerDirectory customerDirectory;
    private Receiver recieverDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private AdminDirectory adminDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, Receiver recieverDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.recieverDirectory = recieverDirectory;
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
