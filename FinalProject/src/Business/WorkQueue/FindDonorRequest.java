/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Hospital.Patient;

/**
 *
 * @author ApoorvaLakhmani
 */
public class FindDonorRequest extends WorkRequest{
    Patient patientDetails;

    public Patient getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(Patient patientDetails) {
        this.patientDetails = patientDetails;
    }
    
    
}
