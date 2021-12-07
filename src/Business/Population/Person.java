/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Population;

import Business.UserAccount.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class Person extends User{
    private List<DonorTransaction> donorTransaction = new ArrayList<>();
    private List<ReceiverTransaction> receiverTransaction = new ArrayList<>();
    
    private int age;
    private float weight;
    private float height;
    private String bloodGroup;

    public Person(List<DonorTransaction> donorTransaction, List<ReceiverTransaction> receiverTransaction) {
        this.donorTransaction = donorTransaction;
        this.receiverTransaction = receiverTransaction;
    }

    public List<DonorTransaction> getDonorTransaction() {
        return donorTransaction;
    }

    public void setDonorTransaction(List<DonorTransaction> donorTransaction) {
        this.donorTransaction = donorTransaction;
    }

    public List<ReceiverTransaction> getReceiverTransaction() {
        return receiverTransaction;
    }

    public void setReceiverTransaction(List<ReceiverTransaction> receiverTransaction) {
        this.receiverTransaction = receiverTransaction;
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
  
    

    public Person(int id) {
        super(id);
    }
}
