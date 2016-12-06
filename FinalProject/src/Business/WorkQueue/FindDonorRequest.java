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
 * @author ApoorvaLakhmani
 */
public class FindDonorRequest extends WorkRequest{
    private Patient patientDetails;
    private int hospitalID;
    private String hospitalName;
    private int hospitalContactNo;
    private String hospitalAddress;
     private String authorization;
    private Donor donor;
    private String rejectionReason;

    public int getHospitalContactNo() {
        return hospitalContactNo;
    }

    public void setHospitalContactNo(int hospitalContactNo) {
        this.hospitalContactNo = hospitalContactNo;
    }
    
    
    public Patient getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(Patient patientDetails) {
        this.patientDetails = patientDetails;
    }

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

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
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
    
    
    
}
