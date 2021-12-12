/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.GovernmentAdminRole;
import Business.Role.PersonRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansizope
 */
public class PersonOrganization extends Organizations{
    public PersonOrganization(){
        super(Organizations.Type.Person.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PersonRole());
        return roles;
    }
}
