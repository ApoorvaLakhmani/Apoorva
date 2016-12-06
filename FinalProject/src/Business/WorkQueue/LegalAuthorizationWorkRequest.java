/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Hospital.Patient;
import Business.RegCenter.Donor;

/**
 *
 * @author Neha
 */
public class LegalAuthorizationWorkRequest extends WorkRequest {
    private String authorization;
    private int hospitalID;
    private String hospitalName;
    private int hospitalContact;
    private Patient patient;
    private Donor donor;
    private String rejectionReason;

    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getHospitalContact() {
        return hospitalContact;
    }

    public void setHospitalContact(int hospitalContact) {
        this.hospitalContact = hospitalContact;
    }

   

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
    
    
    

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    
}
