/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegCenter;

import java.util.ArrayList;

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
    
    public Donor(){
        organDonateList = new ArrayList<>();
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
    
    
    
}
