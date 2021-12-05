/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

/**
 *
 * @author neeraja
 */
public class Receiver {
    private String bloodGroup;
    private int numberOfUnits;
    private String organizationName;

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Receiver(String bloodGroup, int numberOfUnits, String organizationName) {
        this.bloodGroup = bloodGroup;
        this.numberOfUnits = numberOfUnits;
        this.organizationName = organizationName;
    }

    public Receiver() {
    }

    @Override
    public String toString() {
        return "Receiver{" + "bloodGroup=" + bloodGroup + ", numberOfUnits=" + numberOfUnits + ", organizationName=" + organizationName + '}';
    }
    
    
}
