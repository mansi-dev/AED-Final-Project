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
    private ArrayList<LicenseOrganization> license;

    public ArrayList<LicenseOrganization> getLicense() {
        return license;
    }

    public void setLicense(ArrayList<LicenseOrganization> license) {
        this.license = license;
    }
    
        
    public LicenseOrganization addNewEntry() {
        
    LicenseOrganization newEntry = new LicenseOrganization();
    license.add(newEntry);
    return newEntry;

    }

    
}
