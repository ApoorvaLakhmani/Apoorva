/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author ApoorvaLakhmani
 */
public class Patient {
    
    private int patientID;
    private String patientName;
    private int patientAge;
    private String patientLocation;
    private String bloodType;
    private double weight;
    private String organNeeded;
    private int organSize;
    private String otherMedicalCondition;
    private static int counter;
    
    public Patient(){
        counter++;
        patientID = counter;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientLocation() {
        return patientLocation;
    }

    public void setPatientLocation(String patientLocation) {
        this.patientLocation = patientLocation;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOrganNeeded() {
        return organNeeded;
    }

    public void setOrganNeeded(String organNeeded) {
        this.organNeeded = organNeeded;
    }

    public int getOrganSize() {
        return organSize;
    }

    public void setOrganSize(int organSize) {
        this.organSize = organSize;
    }

    public String getOtherMedicalCondition() {
        return otherMedicalCondition;
    }

    public void setOtherMedicalCondition(String otherMedicalCondition) {
        this.otherMedicalCondition = otherMedicalCondition;
    }
    
    
    
}
