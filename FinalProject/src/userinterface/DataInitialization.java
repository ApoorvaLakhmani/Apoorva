/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.Enterprise.DonorRegistrationCenter;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.RegCenter.Donor;
import Business.RegCenter.Organ;
import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ApoorvaLakhmani
 */
public class DataInitialization {
    
    private static ArrayList<Donor> donorList = new ArrayList<Donor>();
    
     public static void initializeData(){
        try {

            FileInputStream file = new FileInputStream(new File("..\\..\\aed_fall_2016_project_apoorva_lakhmani_001256312\\FinalProjectData.xlsx"));
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                assignDonor(row);
                //call from another calss using object.method 
            }
            file.close();

        } catch (Exception ex) {
            Logger.getLogger(DataInitialization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public static void assignDonor(Row row){
        try {
            Donor donor = new Donor();
            //ArrayList<Organ> organList = new ArrayList<>();
            donor.setDonorId(row.getCell(0).toString());
            donor.setDonorName(row.getCell(1).toString());
            donor.setDonorAge(Integer.parseInt(row.getCell(2).toString()));
            donor.setDonorGender(row.getCell(3).toString());
            if(row.getCell(4).toString()!=""){
                Organ organ1 = donor.addOrgan();
                organ1.setOrganName(row.getCell(4).toString());
                organ1.setOrganLife(Integer.parseInt(row.getCell(5).toString()));
            }
            
            if(row.getCell(6).toString()!=""){
                Organ organ2 = donor.addOrgan();
                organ2.setOrganName(row.getCell(6).toString());
                organ2.setOrganLife(Integer.parseInt(row.getCell(7).toString()));
            }
            if(row.getCell(8).toString()!=""){
                Organ organ3 = donor.addOrgan();
                organ3.setOrganName(row.getCell(8).toString());
                organ3.setOrganLife(Integer.parseInt(row.getCell(9).toString()));
            }
            if(row.getCell(10).toString()!=""){
                Organ organ3 = donor.addOrgan();
                organ3.setOrganName(row.getCell(10).toString());
                organ3.setOrganLife(Integer.parseInt(row.getCell(11).toString()));
            }
            if(row.getCell(12).toString()!=""){
                Organ organ3 = donor.addOrgan();
                organ3.setOrganName(row.getCell(12).toString());
                organ3.setOrganLife(Integer.parseInt(row.getCell(13).toString()));
            }
            donor.setDonorPhoneNumber(Integer.parseInt(row.getCell(14).toString()));
            donor.setDonorAddress(row.getCell(15).toString());
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date dob = sdf.parse(row.getCell(16).toString());
            
            donor.setDateOfBirth(dob);
            donor.setDonorEmailId(row.getCell(17).toString());
            donor.getHealthDetails().setBloodGroup(row.getCell(18).toString());
            donor.getHealthDetails().setHeight(Integer.parseInt(row.getCell(19).toString()));
            donor.getHealthDetails().setWeight(Integer.parseInt(row.getCell(20).toString()));
            donor.getHealthDetails().setBmi(Float.parseFloat(row.getCell(21).toString()));
            donor.getHealthDetails().setHasHighBloodPressure(Boolean.parseBoolean(row.getCell(22).toString()));
            donor.getHealthDetails().setHasDiabetes(Boolean.parseBoolean(row.getCell(23).toString()));
            donor.getHealthDetails().setHasInfectiousDisease(Boolean.parseBoolean(row.getCell(24).toString()));
            donor.getHealthDetails().setFamilyHistOfDisease(Boolean.parseBoolean(row.getCell(25).toString()));
            donor.getHealthDetails().setPsychiatricDisease(Boolean.parseBoolean(row.getCell(26).toString()));
            donor.getHealthDetails().setHasCancer(Boolean.parseBoolean(row.getCell(27).toString()));
            donor.getHealthDetails().setHasHIV(Boolean.parseBoolean(row.getCell(28).toString()));
            
            //SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-DD");
            Date registerDate = sdf.parse(row.getCell(29).toString());
            donor.setDonorRegisterationDate(registerDate);
            
            donor.setIsAvailable(Boolean.parseBoolean(row.getCell(30).toString()));
            donorList.add(donor);
            
        } catch (ParseException ex) {
            Logger.getLogger(DataInitialization.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public static EcoSystem populateSystemDonorList(EcoSystem system){
         system.setMasterDonorDirectory(donorList);
         
         return system;
     }
     
     public static void populateNetworkDonorList(EcoSystem system){
         for(Donor donor : donorList){
             for(Network countryNetwork : system.getNetworkList()){
                 for(Network stateNetwork : countryNetwork.getSubNetwork()){
                     for(Network cityNetwork : stateNetwork.getSubNetwork()){
                         if(donor.getDonorAddress().equals(cityNetwork.getNetworkName())){
                             stateNetwork.getDonorDirectory().addDonor(donor);
                         }
                     }
                 }
             }
         }
     }
     
     public static void populateEnterpriseDonorList(Network cityNetwork){
         for(Donor donor:donorList){
                 if(donor.getDonorAddress().equalsIgnoreCase(cityNetwork.getNetworkName())){
                     for(Enterprise enterprise : cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                         if(enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.DonorRegCenter)){
                             ((DonorRegistrationCenter)enterprise).getDonorDirectory().addDonor(donor);
                         }
                     }
                 }
         }
     }
}
