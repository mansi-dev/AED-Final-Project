/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.BloodBank.BloodBank;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author mansizope
 */
public class DonorWorkRequest {
    private BloodBank bloodbank;
    private float hblevel;
    private int numberOfUnits;
    private boolean otherDiseases;
    private float weight;
    private float height;
    private int age;
    private UserAccount reciver;
    private UserAccount sender;
    private Date requestDate;
    private String status;

    public BloodBank getBloodbank() {
        return bloodbank;
    }

    public void setBloodbank(BloodBank bloodbank) {
        this.bloodbank = bloodbank;
    }

    public float getHblevel() {
        return hblevel;
    }

    public void setHblevel(float hblevel) {
        this.hblevel = hblevel;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public boolean isOtherDiseases() {
        return otherDiseases;
    }

    public void setOtherDiseases(boolean otherDiseases) {
        this.otherDiseases = otherDiseases;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserAccount getReciver() {
        return reciver;
    }

    public void setReciver(UserAccount reciver) {
        this.reciver = reciver;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
