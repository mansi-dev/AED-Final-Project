/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Government.LicenseOrganization;
import Business.Admin.AdminDirectory;
import Business.Government.LicenseDirectory;
import Business.Government.TrainingDirectory;
import Business.Hospital.DoctorDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Manager.ManagerDirectory;
import Business.Population.PersonDirectory;
import Business.Population.Receiver;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserDirectory;
import Government.Admin.GovernmentAdminDirectory;
import java.util.ArrayList;

/**
 *
 * @author mansi
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    
    private Receiver recieverDirectory;
    private AdminDirectory adminDirectory;
    private PersonDirectory personDirectory;
    private DoctorDirectory doctorDirectory;
    private HospitalDirectory hospitalDirectory;
    private ManagerDirectory managerDirectory;
    private TrainingDirectory trainingDirectory;
    private LicenseDirectory licenseDirectory;
    private GovernmentAdminDirectory governmentAdminDirectory;

    public GovernmentAdminDirectory getGovernmentAdminDirectory() {
        return governmentAdminDirectory;
    }

    public void setGovernmentAdminDirectory(GovernmentAdminDirectory governmentAdminDirectory) {
        this.governmentAdminDirectory = governmentAdminDirectory;
    }

    public EcoSystem(RestaurantDirectory restaurantDirectory, Receiver recieverDirectory, DoctorDirectory doctorDirectory,HospitalDirectory hospitalDirectory, TrainingDirectory trainingDirectory, LicenseDirectory licenseDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.recieverDirectory = recieverDirectory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.licenseDirectory = licenseDirectory;
        this.trainingDirectory = trainingDirectory;
        
    }

    public TrainingDirectory getTrainingDirectory() {
        return trainingDirectory;
    }

    public void setTrainingDirectory(TrainingDirectory trainingDirectory) {
        this.trainingDirectory = trainingDirectory;
    }

    public LicenseDirectory getLicenseDirectory() {
        return licenseDirectory;
    }

    public void setLicenseDirectory(LicenseDirectory licenseDirectory) {
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
