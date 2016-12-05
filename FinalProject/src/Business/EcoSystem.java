/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neha
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private MasterDonorDirectory masterDonorList;
    private MasterPatientDirectory masterPatientList;

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
    }

    public MasterDonorDirectory getMasterDonorList() {
        return masterDonorList;
    }

    public void setMasterDonorList(MasterDonorDirectory masterDonorList) {
        this.masterDonorList = masterDonorList;
    }

    public MasterPatientDirectory getMasterPatientList() {
        return masterPatientList;
    }

    public void setMasterPatientList(MasterPatientDirectory masterPatientList) {
        this.masterPatientList = masterPatientList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public Network createAndNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
}
