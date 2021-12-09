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
    private float price;
    private float hblevel;
    private float weight;
    private float height;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ReceiverTransaction() {
    }

    public ReceiverTransaction(float hblevel,int numberOfUnits, String organizationName) {
        this.numberOfUnits = numberOfUnits;
        this.organizationName = organizationName;
        this.hblevel = hblevel;
    }

    

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getHblevel() {
        return hblevel;
    }

    public void setHblevel(float hblevel) {
        this.hblevel = hblevel;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    @Override
    public String toString() {
        return "ReceiverTransaction{" + "hblevel=" + hblevel + "age=" + age +"height=" + height +"weight=" + weight +"numberOfUnits=" + numberOfUnits + ", organizationName=" + organizationName + '}';
    }
}
