/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Admin.Admin;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Population.Person;
import Business.UserAccount.User.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String name, String username, String password, Role role){
        if(!checkIfUsernameIsUnique(username)) 
            return null;
        UserAccount userAccount = new UserAccount(name, username, password, role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public int deleteAccount(int id){
        int userAccountFound=0;
        for(UserAccount u : userAccountList){
            if(u.getAccountId()==id){
                userAccountList.remove(u);
                User user = u.getUser();
                if(u.getRole()==Role.Admin) EcoSystem.getInstance().getAdminDirectory().removeAdmin((Admin)user);
                if(u.getRole()==Role.Person) EcoSystem.getInstance().getPersonDirectory().removePerson((Person)user);
                userAccountFound=1;
                break;
            }
        }
        return userAccountFound;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
