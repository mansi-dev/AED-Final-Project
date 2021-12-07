/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import java.util.Date;

/**
 *
 * @author neeraja
 */
public class DonorTransaction {
    private float hblevel;
    private Date bloodLastDonatedDate;
    private Date BloodDonationDate;
    private int numberOfUnits;
    private boolean otherDiseases;
    private boolean isEligible;

    public float getHblevel() {
        return hblevel;
    }

    public void setHblevel(float hblevel) {
        this.hblevel = hblevel;
    }

    public Date getBloodLastDonatedDate() {
        return bloodLastDonatedDate;
    }

    public void setBloodLastDonatedDate(Date bloodLastDonatedDate) {
        this.bloodLastDonatedDate = bloodLastDonatedDate;
    }

    public Date getBloodDonationDate() {
        return BloodDonationDate;
    }

    public void setBloodDonationDate(Date BloodDonationDate) {
        this.BloodDonationDate = BloodDonationDate;
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

    public boolean isIsEligible() {
        return isEligible;
    }

    public void setIsEligible(boolean isEligible) {
        this.isEligible = isEligible;
    }

    public DonorTransaction() {
    }

    @Override
    public String toString() {
        return "DonorTransaction{" + "hblevel=" + hblevel + ", bloodLastDonatedDate=" + bloodLastDonatedDate + ", BloodDonationDate=" + BloodDonationDate + ", numberOfUnits=" + numberOfUnits + ", otherDiseases=" + otherDiseases + ", isEligible=" + isEligible + '}';
    }
    
    
}
