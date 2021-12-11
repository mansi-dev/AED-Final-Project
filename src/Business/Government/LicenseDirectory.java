/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mayan Mishra
 */
public class LicenseDirectory {
    private ArrayList<LicenseOrganization> licenseOrg = new ArrayList();

    public ArrayList<LicenseOrganization> getLicense() {
        return licenseOrg;
    }

    public void setLicense(ArrayList<LicenseOrganization> licenseOrg) {
        this.licenseOrg = licenseOrg;
    }
    
        
    public LicenseOrganization addNewEntry() {
        
    LicenseOrganization newEntry = new LicenseOrganization();
    licenseOrg.add(newEntry);
    return newEntry;

    }

    public void deleteRows(LicenseOrganization selectedRow) {
        //licenseOrg.remove(selectedRow);
        this.licenseOrg.remove(selectedRow);
    }

//    public void deleteRows(LicenseDirectory selectedRow) {
//          }
//

    public LicenseOrganization addNewEntry(Date expiryDate, Date issueDate, Long licenseNumber, String licenseName) {
    LicenseOrganization newEntry = new LicenseOrganization(licenseName, issueDate, expiryDate, licenseNumber);
    licenseOrg.add(newEntry);
    return newEntry;
    }


    
}
