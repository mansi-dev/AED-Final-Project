/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import Business.EcoSystem;
import Business.UserAccount.User;

/**
 *
 * @author mansizope
 */
public class Doctor extends User{
    
    private long employeeId;
    private boolean isTrained;
    private String degree;
    private String specialization;
    private Hospital hospital;
    
    public Doctor(int id) {
        super(id);
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public boolean isIsTrained() {
        return isTrained;
    }

    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

     public void setHospitalByID(int id){
        this.hospital=EcoSystem.getInstance().getHospitalDirectory().getHospitalByID(id);
    }
         
    @Override
    public String toString() {
        return "Doctor{" + "employeeId=" + employeeId + ", isTrained=" + isTrained + ", degree=" + degree + ", specialization=" + specialization + '}';
    }
    
    
    
}
