/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import Business.UserAccount.User;
import java.util.Date;

/**
 *
 * @author neeraja
 */
public class Donor extends User{
    private int age;
    private float weight;
    private float height;
    private float hblevel;

    @Override
    public String toString() {
        return "Donor{" + "age=" + age + ", weight=" + weight + ", height=" + height + ", hblevel=" + hblevel + ", bloodGroup=" + bloodGroup + ", bloodLastDonatedDate=" + bloodLastDonatedDate + ", BloodDonationDate=" + BloodDonationDate + ", NumberOfUnits=" + numberOfUnits + ", otherDiseases=" + otherDiseases + ", isEligible=" + isEligible + '}';
    }

    public Donor() {
    }

    public Donor(int age, float weight, float height, float hblevel, String bloodGroup, Date bloodLastDonatedDate, Date BloodDonationDate, int NumberOfUnits, boolean otherDiseases, boolean isEligible) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hblevel = hblevel;
        this.bloodGroup = bloodGroup;
        this.bloodLastDonatedDate = bloodLastDonatedDate;
        this.BloodDonationDate = BloodDonationDate;
        this.numberOfUnits = NumberOfUnits;
        this.otherDiseases = otherDiseases;
        this.isEligible = isEligible;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public float getHblevel() {
        return hblevel;
    }

    public void setHblevel(float hblevel) {
        this.hblevel = hblevel;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
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

    public void setNumberOfUnits(int NumberOfUnits) {
        this.numberOfUnits = NumberOfUnits;
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
    private String bloodGroup;
    private Date bloodLastDonatedDate;
    private Date BloodDonationDate;
    private int numberOfUnits;
    private boolean otherDiseases;
    private boolean isEligible;
    
}
