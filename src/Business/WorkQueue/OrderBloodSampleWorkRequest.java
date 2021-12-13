/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.BloodBank.BloodBank;

/**
 *
 * @author mansizope
 */
public class OrderBloodSampleWorkRequest extends WorkRequest{
    private int quantity;
    private float price;
    private String bloodGroup;

    private BloodBank bloodbank;
    
    private String requestApproved;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodBank getBloodbank() {
        return bloodbank;
    }

    public void setBloodbank(BloodBank bloodbank) {
        this.bloodbank = bloodbank;
    }



    public String getRequestApproved() {
        return requestApproved;
    }

    public void setRequestApproved(String requestApproved) {
        this.requestApproved = requestApproved;
    }
    
    
}
