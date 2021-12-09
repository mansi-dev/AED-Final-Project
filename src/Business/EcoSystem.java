/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Government.LicenseOrganization;
import Business.Admin.AdminDirectory;
import Business.Hospital.DoctorDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Manager.ManagerDirectory;
import Business.Population.PersonDirectory;
import Business.Population.Receiver;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserDirectory;
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
    private PersonDirectory personDirectory;
    private DoctorDirectory doctorDirectory;
    private HospitalDirectory hospitalDirectory;
    private ManagerDirectory managerDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, LicenseOrganization licenseDirectory, Receiver recieverDirectory, DoctorDirectory doctorDirectory,HospitalDirectory hospitalDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.recieverDirectory = recieverDirectory;
        this.licenseDirectory = licenseDirectory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
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
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public LicenseOrganization getLicenseDirectory() {
        return licenseDirectory;
    }

    public void setLicenseDirectory(LicenseOrganization licenseDirectory) {
        this.licenseDirectory = licenseDirectory;
    }

    public Receiver getRecieverDirectory() {
        return recieverDirectory;
    }

    public void setRecieverDirectory(Receiver recieverDirectory) {
        this.recieverDirectory = recieverDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public ManagerDirectory getManagerDirectory() {
        return managerDirectory;
    }

    public void setManagerDirectory(ManagerDirectory managerDirectory) {
        this.managerDirectory = managerDirectory;
    }
    
    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
