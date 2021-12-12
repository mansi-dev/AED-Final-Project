/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.GovernmentAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansizope
 */
public class TrainingOrganization extends Organizations{
    public TrainingOrganization(){
        super(Organizations.Type.Training.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
}
