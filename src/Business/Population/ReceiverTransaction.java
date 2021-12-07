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
public class ReceiverTransaction {
    private int numberOfUnits;
    private String organizationName;

    public ReceiverTransaction() {
    }

    public ReceiverTransaction(int numberOfUnits, String organizationName) {
        this.numberOfUnits = numberOfUnits;
        this.organizationName = organizationName;
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
    @Override
    public String toString() {
        return "ReceiverTransaction{" + "numberOfUnits=" + numberOfUnits + ", organizationName=" + organizationName + '}';
    }
}
