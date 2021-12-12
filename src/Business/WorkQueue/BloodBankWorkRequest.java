/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Population.DonorTransaction;
import java.util.Date;

/**
 *
 * @author mansizope
 */
public class BloodBankWorkRequest extends WorkRequest{
    private DonorTransaction donorTransaction;
    private Date requestDate;
    private String requestApproved;

    public DonorTransaction getDonorTransaction() {
        return donorTransaction;
    }

    public void setDonorTransaction(DonorTransaction donorTransaction) {
        this.donorTransaction = donorTransaction;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestApproved() {
        return requestApproved;
    }

    public void setRequestApproved(String requestApproved) {
        this.requestApproved = requestApproved;
    }
    
    
}
