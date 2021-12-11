/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import java.util.ArrayList;

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

    public void deleteRows(TrainingOraganization selectedRow) {
        licenseOrg.remove(selectedRow);
    }

    
}
