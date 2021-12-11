/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import Business.EcoSystem;
import Business.UserAccount.User;

/**
 *
 * @author mansizope
 */
public class BloodBankManager extends User{
    private BloodBank bloodBank;

    public BloodBank getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }
    
     public void setBloodBankByID(int id){
        this.bloodBank=EcoSystem.getInstance().getBloodBankDirectory().getBloodBankByID(id);
    }
     
    public BloodBankManager(int id){
        super(id);
    }
}
