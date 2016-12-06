/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegCenter;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ApoorvaLakhmani
 */
public class Donor {
    
    private String donorId;
    private String donorName;
    private int donorAge;
    private String donorGender;
    private ArrayList<Organ> organDonateList;
    private String bloodGroup;
    private int donorPhoneNumber;
    private String donorAddress;
    private Date dateOfBirth;
    private String donorEmailId;
    private HealthDetails healthDetails;
    private static int counter;
    
    public Donor(){
        organDonateList = new ArrayList<>();
        counter++;
        donorId = String.valueOf(counter);
        healthDetails = new HealthDetails();
    }

    public HealthDetails getHealthDetails() {
        return healthDetails;
    }

    public void setHealthDetails(HealthDetails healthDetails) {
        this.healthDetails = healthDetails;
    }

    public String getDonorEmailId() {
        return donorEmailId;
    }

    public void setDonorEmailId(String donorEmailId) {
        this.donorEmailId = donorEmailId;
    }
    
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(int donorAge) {
        this.donorAge = donorAge;
    }

    public String getDonorGender() {
        return donorGender;
    }

    public void setDonorGender(String donorGender) {
        this.donorGender = donorGender;
    }

    public ArrayList<Organ> getOrganDonateList() {
        return organDonateList;
    }

    public void setOrganDonateList(ArrayList<Organ> organDonateList) {
        this.organDonateList = organDonateList;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getDonorPhoneNumber() {
        return donorPhoneNumber;
    }

    public void setDonorPhoneNumber(int donorPhoneNumber) {
        this.donorPhoneNumber = donorPhoneNumber;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }
    
    @Override
    public String toString(){
        return String.valueOf(donorId);
    }
    
}
