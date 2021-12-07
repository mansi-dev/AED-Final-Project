/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class HospitalDirectory {

    private List<Hospital> hospitalList=new ArrayList();

    public List<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public Hospital addNewHospital(){
        Hospital hospital = new Hospital();
        this.hospitalList.add(hospital);
        return hospital;
    }
    
    public void deleteHospital(Hospital hospital){
        this.hospitalList.remove(hospital);
    }
    
    public Hospital getHospitalByID(int id){        
        for(Hospital r : this.hospitalList){            
            if(r.getId()==id) return r;
        }
        return null;
    }
    
}