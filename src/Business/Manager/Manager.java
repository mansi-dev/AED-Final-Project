/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manager;

import Business.EcoSystem;
import Business.Hospital.Hospital;
import Business.UserAccount.User;

/**
 *
 * @author mansizope
 */
public class Manager extends User{
    
    private Hospital hospital;

   
    public Hospital getHospital() {
        return hospital;
    }
    public void setHospitalByID(int id){
        this.hospital=EcoSystem.getInstance().getHospitalDirectory().getHospitalByID(id);
    }
    public long getRestaurantByID(int id){
        return EcoSystem.getInstance().getHospitalDirectory().getHospitalByID(id).getId();
    }
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    public Manager(int id){
        super(id);
    }
}
